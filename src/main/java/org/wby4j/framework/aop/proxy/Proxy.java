package org.wby4j.framework.aop.proxy;

/**
 * 代理接口
 *
 * @Author wubinyu
 * @Date 2018/8/17 9:56.
 */
public interface Proxy {

    /**
     * 执行链式代理
     *
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
