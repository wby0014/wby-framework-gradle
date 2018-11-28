package org.wby4j.framework.plugin;

/**
 * 插件接口
 *
 * @Author wubinyu
 * @Date 2018/8/21 19:56.
 */
public interface Plugin {

    /**
     * 初始化 插件
     */
    void init();

    /**
     * 销毁插件
     */
    void destroy();
}
