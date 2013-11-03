package com.hongweiyi.cql.exception;

/**
 *
 * Cql throws this exception only when plan execute phrase
 * gets some unexpected error.
 *
 * Author: Hongwei Yi
 * Date: 2013/11/02
 */
public class ExecException extends CqlException {
    public ExecException() {
        super();
    }

    public ExecException(String msg) {
        super(msg);
    }

    public ExecException(Throwable t) {
        super(t);
    }

    public ExecException(String msg, Throwable t) {
        super(msg, t);
    }
}
