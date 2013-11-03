package com.hongweiyi.cql.parse.expr;


import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class StatLiteral extends LiteralExpression {
    public String type;
    public String field;

    public StatLiteral(String type, String field) {
        this.type = type;
        this.field = field;
    }

    public String evaluate(CqlContext ctx) throws ExecException {
        return type;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(type.toString());
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
