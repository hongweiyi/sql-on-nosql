package com.hongweiyi.cql.exception;

/**
 *
 * Author: Hongwei Yi
 * Date: 2013/11/02
 */
public enum ErrorMsg {
    GENERIC_ERROR(42000, "Exception while processing"),
    INVALID_TABLE(10001, "Table '%s' doesn't exist"),
    INVALID_COLUMN(10002, "Invalid column '%s'"),
    SYNTAX_ERROR(20000, "You have an error in your SQL syntax; check the manual for the right syntax to use near '%s'");

    private String msg;
    private int errorCode;

    public static String SYNTAXERROR = "SYNTAX:";
    public static String EXECERROR = "EXEC:";

    ErrorMsg(String msg) {
        // 42000 is the generic SQLState for syntax error.
        this(42000, msg);
    }

    ErrorMsg(int errorCode, String msg) {
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return String.format("ERROR %d: %s", errorCode, msg);
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorCodedMsg() {
        return "[ERROR " + errorCode + "]: " + msg;
    }

    public static ErrorMsg getInstance(String msg) {
        if (null == msg || "".equals(msg)) {
            return GENERIC_ERROR;
        }

        if (msg.startsWith(SYNTAXERROR)) {
            String info = msg.substring(SYNTAXERROR.length());

            ErrorMsg error = SYNTAX_ERROR;
            error.setMsg(String.format(error.getMsg(), info));

            return error;
        } else if (msg.startsWith(EXECERROR)) {
            String info = msg.substring(EXECERROR.length());
            if (info.startsWith("undefined field")) {
                String field = info.substring("undefined field".length()).trim();

                ErrorMsg error = INVALID_COLUMN;
                error.setMsg(String.format(error.getMsg(), field));

                return error;
            }
        }

        return GENERIC_ERROR;
    }
}
