package org.wby4j.framework.mvc;

import org.wby4j.framework.FrameworkConstant;
import org.wby4j.framework.HelperLoader;
import org.wby4j.framework.plugin.Plugin;
import org.wby4j.framework.plugin.PluginHelper;
import org.wby4j.framework.plugin.WebPlugin;
import org.wby4j.framework.util.StringUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * 容器监听器
 *
 * @Author wubinyu
 * @Date 2018/8/22 14:55.
 */
@WebListener
public class ContainerListener implements ServletContextListener {


    /**
     * 当容器初始化时调用
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[wby-framework] 正在容器中初始化...");
        // 获取 ServletContext
        ServletContext servletContext = sce.getServletContext();
        // 初始化相关 Helper 类
        HelperLoader.init();
        // 添加 Servlet 映射
        addServletMapping(servletContext);
        // 注册 WebPlugin
        registerWebPlugin(servletContext);
    }

    /**
     * 当容器销毁时调用
     *
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // 销毁插件
        destroyPlugin();
    }


    private void addServletMapping(ServletContext context) {
        // 用 DefaultServlet 映射所有静态资源
        registerDefaultServlet(context);
        // 用 JspServlet 映射所有 JSP 请求
        registerJspServlet(context);
    }

    private void registerDefaultServlet(ServletContext context) {
        ServletRegistration defaultServlet = context.getServletRegistration("default");
        defaultServlet.addMapping("/index.html");
        defaultServlet.addMapping("/favicon.ico");
        String wwwPath = FrameworkConstant.WWW_PATH;
        if (StringUtil.isNotEmpty(wwwPath)) {
            defaultServlet.addMapping(wwwPath + "*");
        }
    }

    private void registerJspServlet(ServletContext context) {
        ServletRegistration jspServlet = context.getServletRegistration("jsp");
        jspServlet.addMapping("/index.jsp");
        String jspPath = FrameworkConstant.JSP_PATH;
        if (StringUtil.isNotEmpty(jspPath)) {
            jspServlet.addMapping(jspPath + "*");
        }
    }

    private void registerWebPlugin(ServletContext servletContext) {
        List<Plugin> pluginList = PluginHelper.getPluginList();
        for (Plugin plugin : pluginList) {
            if (plugin instanceof WebPlugin) {
                WebPlugin webPlugin = (WebPlugin) plugin;
                webPlugin.register(servletContext);
            }
        }
    }

    private void destroyPlugin() {
        List<Plugin> pluginList = PluginHelper.getPluginList();
        for (Plugin plugin : pluginList) {
            plugin.destroy();
        }
    }
}
