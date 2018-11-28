package org.wby4j.framework.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handler 调用器
 *
 * @Author wubinyu
 * @Date 2018/8/22 11:06.
 */
public interface HandlerInvoker {

    /**
     * 调用 Handler
     *
     * @param request
     * @param response
     * @param handler
     * @throws Exception
     */
    void invokeHandler(HttpServletRequest request, HttpServletResponse response, Handler handler) throws Exception;
}
