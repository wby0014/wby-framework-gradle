package org.wby4j.framework.core.impl.support;

/**
 * 用于获取子类的模板类
 *
 * @Author wubinyu
 * @Date 2018/8/16 13:36.
 */
public abstract class SupperClassTemplate extends ClassTemplate {

    protected final Class<?> superClass;

    protected SupperClassTemplate(String packageName, Class<?> superClass) {
        super(packageName);
        this.superClass = superClass;
    }
}
