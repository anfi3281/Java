/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inperpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Inperpus {
    
    private static Connection MySQLConfig;
    
    public static  Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/inperpus";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            System.out.println("koneksi ke database gagal" + e.getMessage ());
        }
        return MySQLConfig;
    }
}
    /**
     * @param args the command line arguments
     */
