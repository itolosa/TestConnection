/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conexion;

/**
 *
 * @author nachoman
 */
public class ConexionController {
    Conexion conexion = null;
    
    public ConexionController() {
        
    }
    
    public boolean createConexion(String user, String pass) {
        conexion = new Conexion();
        if (conexion.GetConexion(user, pass) != null) {
            // JOptionPane.showMessageDialog(null, "Conexión exitosa"); 
            // status_label.setText("Conexión Exitosa");
            return true;
        } else {
            // JOptionPane.showMessageDialog(null, "Conexión fallida");
            // status_label.setText("Conexión Fallida");
            return false;
        }
    }
}
