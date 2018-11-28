package org.wby4j.framework.mvc.fault;

/**
 * 认证异常（当非法访问时抛出）
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:31.
 */
public class AuthcException extends RuntimeException {

    public AuthcException() {
        super();
    }

    public AuthcException(String message) {
        super(message);
    }

    public AuthcException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthcException(Throwable cause) {
        super(cause);
    }

}
