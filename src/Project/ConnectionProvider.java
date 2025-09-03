/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;   // For establishing a connection
import java.sql.PreparedStatement; // For executing SQL queries with parameters
import java.sql.Statement;       // For executing simple SQL queries
import java.sql.ResultSet;       // For handling query results
import java.sql.SQLException;    // For handling SQL exceptions


/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qms", "root", "123456");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
