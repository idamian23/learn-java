package io.learnstuff.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static void main(String[] arg){

        String dbURL = "jdbc:postgresql://localhost:5432/learn_stuff_database";
        String username = "postgres";
        String password = "password00";

        try(Connection connection = DriverManager.getConnection(dbURL, username,password)){
            if (connection!=null){
                System.out.println("Connection OK");
            }else{
                System.out.println("Connection Failed!");
            }




        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
