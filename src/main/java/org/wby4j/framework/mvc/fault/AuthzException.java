package org.wby4j.framework.mvc.fault;

/**
 * 授权异常 （当权限无效时抛出）
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:33.
 */
public class AuthzException extends RuntimeException {

    public AuthzException() {
        super();
    }

    public AuthzException(String message) {
        super(message);
    }

    public AuthzException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthzException(Throwable cause) {
        super(cause);
    }

}
