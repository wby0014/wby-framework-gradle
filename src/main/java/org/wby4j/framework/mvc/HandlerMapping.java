package org.wby4j.framework.mvc;

/**
 * 处理器映射
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:47.
 */
public interface HandlerMapping {

    /**
     * 获取 Handler
     *
     * @param currentRequestMethod
     * @param currentRequestPath
     * @return
     */
    Handler getHandler(String currentRequestMethod, String currentRequestPath);
}
