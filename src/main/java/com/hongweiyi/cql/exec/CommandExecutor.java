package com.hongweiyi.cql.exec;

import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.exception.SyntaxException;


public interface CommandExecutor {
  public void init();

  public int exec(String command) throws SyntaxException, ExecException;
}
