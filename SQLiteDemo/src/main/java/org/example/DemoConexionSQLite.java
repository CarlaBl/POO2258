package org.example;

import java.sql.*;

import org.sqlite.JDBC;

public class DemoConexionSQLite {
    public static void main(String[] args) {
        String DB_URL = "jdbc:sqlite:librosDB.db";
        Connection connection = null;

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DB_URL);
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM libros; ");
            while(rst.next()){
                System.out.println(rst.getString(1) +" "+ rst.getString(2));
            }
            connection.close();
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }catch (SQLException sql){
            sql.printStackTrace();
        }


    }
}
