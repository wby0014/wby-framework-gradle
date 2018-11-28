package org.wby4j.framework.plugin;

import org.wby4j.framework.aop.proxy.Proxy;

import java.util.List;

/**
 * 插件代理
 *
 * @Author wubinyu
 * @Date 2018/8/20 9:36.
 */
public abstract class PluginProxy implements Proxy {

    public abstract List<Class<?>> getTargetClassList();
}
