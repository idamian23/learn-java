package io.learnstuff.tutorial.dbms;

public class PostgreSQLDatabase implements CRUDInterface{
    @Override
    public void create() {
        System.out.println("This method creates data on PostgreSQL Database");
    }

    @Override
    public void read() {
        System.out.println("This method reads data on PostgreSQL Database");
    }

    @Override
    public void update() {
        System.out.println("This method updates data on PostgreSQL Database");
    }

    @Override
    public void delete() {
        System.out.println("This method deletes data on PostgreSQL Database");
    }
}
