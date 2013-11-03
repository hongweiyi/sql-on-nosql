SQL on NoSQL
===
Overview
---
This project is inpired by [`solrflux`](http://code.google.com/p/solrflux/), which can interact to solr with SQL-like syntax.

What have I done?
---
This project is based-on solrflux, and I refactored it, I want extract it as an abstract layer to access some NoSQL db, such as Solr or HBase.

I extract three main components in SQL execute phrase:

* `sql parse` phrase
* `semantic analyze` phrase
* `plan execute` phrase

Everyone who wants add SQL-like syntax to a specific db, you can implement your own `Planner` by extend some Planner class, such as `SelectPlanner`, `InsertPlanner` or `DeletePlanner`. This project provides an execution plan implementaion of `Solr`. [**go to**](https://github.com/HongweiYi/sql-on-nosql/tree/master/src/main/java/com/hongweiyi/cql/plan/solr)

How to use?
---
Run(Console):
  
    use 'solr_url' as table; // use 'http://localhost:8983/solr' as test;
    enter your sql;          // select * from test;

If you are running this by some IDE (IntelliJ or Eclipse), you should add a VM options below to make it work:

    -Djline.terminal=jline.UnsupportedTerminal

BTW, this project noly support `solr 3.5` currently, if you want, you can make it support `solr 4.x`.  **;)** 

What next?
---
It is very hard and complicated to write your own `ANTLR` template, I just add some aggregate functions to solrflux template to support SQL like `select MAX(field) from table;`. Do this is time-consuming and unnecessary, why not use some open source SQL-parser module? Like [`FoundationDB SQL Parser`](https://github.com/FoundationDB/sql-parser).

Next time I will extract SQL parse phrase, extract `ASTNode` just like Hive did, so we can free our mind from the `Lexer` and `Parser`.

For more information, you can send email to me: hongweiyi#hotmail.com or me#hongweiyi.com. **;)**