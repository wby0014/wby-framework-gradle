package org.wby4j.framework.core.fault;

/**
 * 初始化错误
 *
 * @Author wubinyu
 * @Date 2018/8/16 16:07.
 */
public class InitializationError extends Error {

    public InitializationError() {
        super();
    }

    public InitializationError(String message) {
        super(message);
    }

    public InitializationError(String message, Throwable cause) {
        super(message, cause);
    }

    public InitializationError(Throwable cause) {
        super(cause);
    }
}
