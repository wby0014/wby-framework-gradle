package org.wby4j.framework.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 视图解析器
 *
 * @Author wubinyu
 * @Date 2018/8/22 11:12.
 */
public interface ViewResolver {

    /**
     * 解析视图
     *
     * @param request
     * @param response
     * @param actionMethodResult
     */
    void resolveView(HttpServletRequest request, HttpServletResponse response, Object actionMethodResult);
}
