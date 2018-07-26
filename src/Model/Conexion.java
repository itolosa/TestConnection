/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
/**
 *
 * @author nachoman
 */
public class Conexion {
    public Conexion() {
        
    }
    
    public Connection GetConexion(String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@158.170.10.19:1521:usch9p",
                user,
                pass
            );
        } catch (Exception e) {
            
        }
        return conn;
    }
    
    
}
