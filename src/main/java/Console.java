import java.io.IOException;

import com.hongweiyi.cql.exec.CommandExecutor;
import com.hongweiyi.cql.exec.SimpleExecutor;
import jline.ConsoleReader;

/**
 *
 * This is simple console to interact with solr/hbase(not support now) by common-ql(cql)
 *  1. use 'solr_url' as table_name;  // use 'http://localhost:8983/solr' as test;
 *  2. enter your sql with table;     // select * from test;
 *
 * If you are run this by some IDE (IntelliJ or Eclipse),
 * you should add a VM options below to make it work:
 *   -Djline.terminal=jline.UnsupportedTerminal
 *
 * Have fun with cql ;)
 *
 * Author: Hongwei Yi
 * Date: 2013/11/02
 */
public class Console {
	public static void main(String[] args) throws IOException {
		ConsoleReader conReader = new ConsoleReader();
		CommandExecutor exec = new SimpleExecutor();

		final String NORMAL_PROMPT = "SQL>";
		final String CONTD_PROMPT = "... ";

		String prompt = NORMAL_PROMPT;

		while (true) {
			String line = conReader.readLine(prompt);
			if (line == null) {
                System.out.println("---");
				break;
			}

			try {
				if (exec.exec(line) == 0) {
					prompt = NORMAL_PROMPT;
				} else {
					prompt = CONTD_PROMPT;
				}
			} catch (Exception e) {
				e.printStackTrace();
				prompt = NORMAL_PROMPT;
			}
		}
	}

}
