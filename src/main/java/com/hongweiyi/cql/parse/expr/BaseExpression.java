package com.hongweiyi.cql.parse.expr;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.func.Function;


public abstract class BaseExpression implements Expression {
    public BaseExpression() {
    }

    public boolean isNumber(Object o) {
        return (o instanceof Number);
    }

    public boolean isBigDecimal(Object o) {
        return (o instanceof BigDecimal);
    }

    public boolean isBigInteger(Object o) {
        return (o instanceof BigInteger);
    }

    public boolean isDouble(Object o) {
        return (o instanceof Double);
    }

    public boolean isFloat(Object o) {
        return (o instanceof Float);
    }

    public boolean isLong(Object o) {
        return (o instanceof Long);
    }

    public boolean isInteger(Object o) {
        return (o instanceof Integer);
    }

    public boolean isString(Object o) {
        return (o instanceof String);
    }

    public boolean isDate(Object o) {
        return (o instanceof Date);
    }

    public boolean isIndexable(Object o) {
        return (isList(o) || isArray(o));
    }

    public boolean isList(Object o) {
        return (o instanceof List<?>);
    }

    public boolean isCollection(Object o) {
        return (o instanceof Collection<?>);
    }

    public boolean isArray(Object o) {
        return o.getClass().isArray();
    }

    public boolean isExpression(Object o) {
        return (o instanceof Expression);
    }

    public boolean isFunction(Object o) {
        return (o instanceof Function);
    }

    public boolean isLiteralExpression(Object o) {
        return (o instanceof LiteralExpression);
    }

    public boolean isIdLiteral(Object o) {
        return (o instanceof IdLiteral);
    }

    public boolean isLiteralExpressionExcludingId(Object o) {
        return ((o instanceof LiteralExpression) &&
                !(o instanceof IdLiteral));
    }

    public boolean isValueLiteralExpression(Object o) {
        return ((o instanceof LiteralExpression) &&
                !(o instanceof IdLiteral) &&
                !(o instanceof NullLiteral) &&
                !(o instanceof WildcardLiteral));
    }

    public boolean isNumberLiteralExpression(Object o) {
        return (o instanceof NumberLiteralExpression);
    }

    public boolean isStringLiteral(Object o) {
        return (o instanceof StringLiteral);
    }

    public boolean isNullLiteral(Object o) {
        return (o instanceof NullLiteral);
    }

    public boolean isWildcardLiteral(Object o) {
        return (o instanceof WildcardLiteral);
    }

    public String convertToString(Object obj) {
        if (obj == null) {
            return null;
        }

        return obj.toString();
    }

    public Boolean convertToBoolean(Object obj) {
        // null return false
        if (obj == null) {
            return false;
        }

        if (obj instanceof Boolean) {
            // return directly
            return (Boolean) obj;
        } else if (obj instanceof Number) {
            // zero is true
            return (0.0 == ((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            // empty str is true
            return !((String) obj).equals("");
        } else if (obj.getClass().isArray()) {
            // not empty if true
            return (Array.getLength(obj) > 0);
        } else if (obj instanceof Collection<?>) {
            // not empty if true
            return !((Collection<?>) obj).isEmpty();
        } else {
            return true;
        }
    }

    public BigDecimal convertToBigDecimal(Number n)
            throws ExecException {
        if (n == null) {
            return null;
        }

        if (n instanceof BigDecimal) {
            return (BigDecimal) n;
        } else if (n instanceof BigInteger) {
            return new BigDecimal((BigInteger) n);
        } else if (n instanceof Double) {
            return new BigDecimal((Double) n);
        } else if (n instanceof Float) {
            return new BigDecimal((Float) n);
        } else if (n instanceof Long) {
            return new BigDecimal((Long) n);
        } else if (n instanceof Integer) {
            return new BigDecimal((Integer) n);
        } else {
            return new BigDecimal(n.longValue());
        }
    }

    public BigInteger convertToBigInteger(Number n) {
        if (n == null) {
            return null;
        }

        if (n instanceof BigDecimal) {
            return ((BigDecimal) n).toBigInteger();
        } else if (n instanceof BigInteger) {
            return (BigInteger) n;
        } else if (n instanceof Double) {
            return new BigDecimal((Double) n).toBigInteger();
        } else if (n instanceof Float) {
            return new BigDecimal((Float) n).toBigInteger();
        } else if (n instanceof Long) {
            return BigInteger.valueOf((Long) n);
        } else if (n instanceof Integer) {
            return BigInteger.valueOf((Integer) n);
        } else {
            return BigInteger.valueOf(n.longValue());
        }
    }

    public Double convertToDouble(Number n) {
        if (n == null) {
            return null;
        }

        return n.doubleValue();
    }

    public Float convertToFloat(Number n) {
        if (n == null) {
            return null;
        }

        return n.floatValue();
    }

    public Long convertToLong(Number n) {
        if (n == null) {
            return null;
        }

        return n.longValue();
    }

    public Integer convertToInteger(Number n) {
        if (n == null) {
            return null;
        }

        return n.intValue();
    }
}
