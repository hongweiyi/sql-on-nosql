package com.hongweiyi.cql.exception;

/**
 *
 * Cql throws this exception only when SQL parse and semantic analyze phrase
 * gets some unexpected error.
 *
 * Author: Hongwei Yi
 * Date: 2013/11/02
 */
public class SyntaxException extends CqlException {
    public SyntaxException() {
        super();
    }

    public SyntaxException(String msg) {
        super(msg);
    }

    public SyntaxException(Throwable t) {
        super(t);
    }

    public SyntaxException(String msg, Throwable t) {
        super(msg, t);
    }
}
