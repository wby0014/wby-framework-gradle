package org.wby4j.framework.mvc.fault;

/**
 * 上传异常 （当文件上传失败时抛出）
 *
 * @Author wubinyu
 * @Date 2018/8/22 9:34.
 */
public class UploadException extends RuntimeException {

    public UploadException() {
        super();
    }

    public UploadException(String message) {
        super(message);
    }

    public UploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public UploadException(Throwable cause) {
        super(cause);
    }

}
