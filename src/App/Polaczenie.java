/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Daniil Kochyk
 */
public class Polaczenie {
     public static Connection getConnection(){
         
         String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;" + "databaseName=projDb;"
                 + "user=sa;" + "password=sa;";
         
         try{
           Connection con = DriverManager.getConnection(url);
           return con;
         }
         catch(SQLException e){
             System.out.println(e.toString());
             return null;
         }
     }
}
