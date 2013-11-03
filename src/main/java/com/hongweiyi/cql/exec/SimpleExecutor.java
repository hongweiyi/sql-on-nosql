package com.hongweiyi.cql.exec;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.semantic.SemanticAnalyzer;
import com.hongweiyi.cql.parse.semantic.SemanticAnalyzerFactory;
import com.hongweiyi.cql.parse.syntax.CqlParserDriver;
import com.hongweiyi.cql.plan.Planner;
import com.hongweiyi.cql.plan.solr.SolrSelectPlanner;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;

import java.util.List;
import java.util.Map;

/**
 * SimpleExecutor Example
 *
 * User: Hongwei Yi
 * Date: 13-11-2
 */
public class SimpleExecutor implements CommandExecutor {

    CqlContext ctx;
    CqlParserDriver parser;

    DBType dbType;

    public SimpleExecutor() {
        this(DBType.SOLR);
    }

    /**
     * We can let backend database type be transparent to users,
     * when {@link exec();} parse sql and get table name,
     * we can get table's env from some sort of meta database.
     *
     * But, I strongly recommend you **NOT** do this.
     * Some curious users will be very concerned some backend
     * environment features.
     *
     * @param dbType: backend database type, such as "SOLR", "HBASE"
     */
    public SimpleExecutor(DBType dbType) {
        this.dbType = dbType;

        this.init();
    }

    @Override
    public void init() {
        ctx = new CqlContext(dbType);
        parser = new CqlParserDriver();
    }

    @Override
    public int exec(String cmd) throws SyntaxException, ExecException {
        CommonTree tree = parser.parse(cmd);

        if (tree == null) {
            return -1;
        } else {
            printTree(tree, 1);
        }

        SemanticAnalyzer analyzer = SemanticAnalyzerFactory.create(tree);
        List<Planner> planners = analyzer.analyze(tree, ctx);

        for (Planner planner : planners) {
            Object ret = planner.execute(ctx);

            if (ret == null) {
                System.out.println("OK.");
                continue;
            }

            if (ret instanceof UpdateResponse) {
                printUpdateResponse((UpdateResponse) ret);
            } else if (ret instanceof SolrSelectPlanner.Result) {
                printSelectResult((SolrSelectPlanner.Result) ret);
            } else {
                System.out.println("Result: " + ret.toString());
            }
        }

        return 0;
    }

    private void printSelectResult(SolrSelectPlanner.Result res) {
        int i = 1;
        for (SolrDocument doc : res.getDocuments()) {
            System.out.print(Integer.toString(i) + ": ");
            int j = 0;
            for (Map.Entry<String, Object> e : doc.entrySet()) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(e.getKey() + "=" + e.getValue().toString());
                ++j;
            }
            System.out.println();
            ++i;
        }

        System.out.println();
        System.out.println("Query=" + res.getQuery());
        System.out.println("Found "
                + res.getResponse().getResults().getNumFound()
                + " documents, Offset="
                + res.getResponse().getResults().getStart());
        System.out.println("Status=" + res.getResponse().getStatus()
                + ", Elapsed Time=" + res.getResponse().getElapsedTime());
    }

    private void printUpdateResponse(UpdateResponse res) {
        System.out.println("Status=" + res.getStatus() + ", Elapsed Time="
                + res.getElapsedTime());
    }

    private void printTree(Tree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; ++i) {
                sb = sb.append("    ");
            }

            if (!t.isNil()) {
                System.out.println(sb.toString() + t.toString());
                ++indent;
            }

            for (int i = 0; i < t.getChildCount(); ++i) {
                printTree(t.getChild(i), indent);
            }
        }
    }
}
