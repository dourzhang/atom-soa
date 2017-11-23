package com.watent.soa.exception;

/**
 * 自定义异常
 *
 * @author Atom
 */
public class DubboException extends RuntimeException {

    public DubboException() {
        super();
    }

    public DubboException(String message) {
        super(message);
    }

    public DubboException(String message, Throwable cause) {
        super(message, cause);
    }

    public DubboException(Throwable cause) {
        super(cause);
    }

    protected DubboException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
