package org.wby4j.framework;

import org.wby4j.framework.aop.AopHelper;
import org.wby4j.framework.dao.DatabaseHelper;
import org.wby4j.framework.ioc.BeanHelper;
import org.wby4j.framework.ioc.IocHelper;
import org.wby4j.framework.mvc.ActionHelper;
import org.wby4j.framework.orm.EntityHelper;
import org.wby4j.framework.plugin.PluginHelper;
import org.wby4j.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @Author wubinyu
 * @Date 2018/8/22 15:04.
 */
public final class HelperLoader {

    public static void init() {
        // 定义需要加载的 Helper 类
        Class<?>[] classList = {
                DatabaseHelper.class,
                EntityHelper.class,
                ActionHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                PluginHelper.class
        };
        // 按照顺序加载类
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
