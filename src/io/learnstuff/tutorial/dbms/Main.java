package io.learnstuff.tutorial.dbms;

public class Main {
    public static void main(String[] args){

        var oracleSQL = new OracleDatabase();
        var postgreSQL = new PostgreSQLDatabase();
        var mySQL = new MySQLDatabase();

        System.out.println("--------------------ORACLE------------");
        oracleSQL.create();
        oracleSQL.read();
        oracleSQL.update();
        oracleSQL.delete();

        System.out.println("--------------------POSTGRESQL------------");
        postgreSQL.create();
        postgreSQL.read();
        postgreSQL.update();
        postgreSQL.delete();

        System.out.println("--------------------MYSQL------------");
        mySQL.create();
        mySQL.read();
        mySQL.update();
        mySQL.delete();

        
    }
}
