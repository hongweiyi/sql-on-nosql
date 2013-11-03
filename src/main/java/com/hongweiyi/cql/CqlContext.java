package com.hongweiyi.cql;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.hongweiyi.cql.exec.DBType;
import org.apache.solr.client.solrj.SolrServer;

import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.func.BigDecimalFunction;
import com.hongweiyi.cql.parse.expr.func.BigIntegerFunction;
import com.hongweiyi.cql.parse.expr.func.DateFunction;
import com.hongweiyi.cql.parse.expr.func.DoubleFunction;
import com.hongweiyi.cql.parse.expr.func.FloatFunction;
import com.hongweiyi.cql.parse.expr.func.IntegerFunction;
import com.hongweiyi.cql.parse.expr.func.LengthFunction;
import com.hongweiyi.cql.parse.expr.func.LongFunction;
import com.hongweiyi.cql.parse.expr.func.StringFunction;
import com.hongweiyi.cql.parse.expr.func.SubstringFunction;
import com.hongweiyi.cql.plan.DeletePlanner;
import com.hongweiyi.cql.plan.ExtendedPlanner;
import com.hongweiyi.cql.plan.InsertPlanner;
import com.hongweiyi.cql.plan.SelectPlanner;
import com.hongweiyi.cql.plan.UsePlanner;
import com.hongweiyi.cql.plan.solr.SolrDeletePlanner;
import com.hongweiyi.cql.plan.solr.SolrExtendedPlanner;
import com.hongweiyi.cql.plan.solr.SolrInsertPlanner;
import com.hongweiyi.cql.plan.solr.SolrSelectPlanner;
import com.hongweiyi.cql.plan.solr.SolrUsePlanner;

public class CqlContext {
    private SolrServer solrInstance;
    // TODO private HTable hbaseInstance;

    private Namespace globalNamespace;
    private Namespace namespace;
    private Stack<Namespace> callStack;

    @SuppressWarnings("rawtypes")
    private Map<String, Class> physicalPlanner;

    public CqlContext() {
        this(DBType.SOLR); // DEFAULT: solr
    }

    public CqlContext(DBType dbType) {
        Map<String, Object> defaults = new HashMap<String, Object>();
        registerDefaults(defaults);

        globalNamespace = new Namespace(defaults);
        namespace = globalNamespace;
        callStack = new Stack<Namespace>();

        registerPlanner(dbType);
    }

    @SuppressWarnings("rawtypes")
    private void registerPlanner(DBType dbType) {
        this.physicalPlanner = new HashMap<String, Class>();
        if (DBType.SOLR.equals(dbType)) {
            this.physicalPlanner
                    .put(SelectPlanner.TYPE, SolrSelectPlanner.class);
            this.physicalPlanner
                    .put(InsertPlanner.TYPE, SolrInsertPlanner.class);
            this.physicalPlanner
                    .put(DeletePlanner.TYPE, SolrDeletePlanner.class);
            this.physicalPlanner.put(ExtendedPlanner.TYPE,
                    SolrExtendedPlanner.class);
            this.physicalPlanner.put(UsePlanner.TYPE, SolrUsePlanner.class);
        } else if (DBType.HBASE.equals(dbType)) {
            // TODO not support now
        }
    }

    private void registerDefaults(Map<String, Object> defaults) {
        defaults.put("INTEGER", new IntegerFunction());
        defaults.put("LONG", new LongFunction());
        defaults.put("BIGINTEGER", new BigIntegerFunction());
        defaults.put("FLOAT", new FloatFunction());
        defaults.put("DOUBLE", new DoubleFunction());
        defaults.put("BIGDECIMAL", new BigDecimalFunction());
        defaults.put("STRING", new StringFunction());
        defaults.put("DATE", new DateFunction());
        defaults.put("LENGTH", new LengthFunction());
        defaults.put("SUBSTRING", new SubstringFunction());
    }

    public SolrServer getSolrInstance() {
        return solrInstance;
    }

    public void setSolrInstance(SolrServer instance) {
        this.solrInstance = instance;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public void clear() {
        namespace.clear();
    }

    public void clearGlobal() {
        globalNamespace.clear();
    }

    public Object put(String name, Object value) {
        return namespace.put(name, value);
    }

    public Object get(String name) {
        return namespace.get(name);
    }

    public Object putGlobal(String name, Object value) {
        return globalNamespace.put(name, value);
    }

    public Object getGlobal(String name) {
        return globalNamespace.get(name);
    }

    public void enterBlock() {
        callStack.push(namespace);
        namespace = new Namespace(namespace);
    }

    public void enterFunction() {
        callStack.push(namespace);
        namespace = new Namespace(globalNamespace);
    }

    public void leave() throws ExecException {
        if (callStack.size() <= 0) {
            throw new ExecException("Call stack is empty.");
        } else {
            namespace = callStack.pop();
        }
    }

    @SuppressWarnings("rawtypes")
    public Class getPhysicalPlanner(String type) {
        return this.physicalPlanner.get(type);
    }
}
