package com.bellotoaccess.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cristian Olivares
 */
public class Conexion {
    
        public Connection obtenerConexion()
    {
        Connection con = null;
        //trycatch+tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bellotoaccess", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión " + e.getMessage());
        }
        return con;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Conexion MySQL
//      public static void main(String[] args) {
//        Connection con = null;
//        try {
//            //carga la clase controlador
//            Class.forName("com.mysql.jdbc.Driver"); //nombre del controlador de JDBC
//            
//            //establece la conexión a la base de datos
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bellotoaccess", 
//                                                    "root", ""); //URL de la base de datos
//            System.out.println("Conexión exitosa");
//
//        } catch (Exception ex) {
//            System.out.println("Error en la conexion "+ex.getMessage());
//        }
//    }
    
}
