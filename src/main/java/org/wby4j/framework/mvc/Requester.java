package org.wby4j.framework.mvc;

/**
 * 封装 Request 对象相关信息
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:51.
 */
public class Requester {

    private String requestMethod;
    private String requestPath;

    public Requester(String requestMethod, String requestPath) {
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }
}
