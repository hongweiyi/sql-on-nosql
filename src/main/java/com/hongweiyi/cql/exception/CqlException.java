package com.hongweiyi.cql.exception;

/**
 *
 * Author: Hongwei Yi
 * Date: 2013/11/02
 */
public class CqlException extends Exception {
    public CqlException() {
        super();
    }

    public CqlException(String msg) {
        super(msg);
    }

    public CqlException(Throwable t) {
        super(t);
    }

    public CqlException(String msg, Throwable t) {
        super(msg, t);
    }
}
