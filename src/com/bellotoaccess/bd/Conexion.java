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
        Connection conex = null;
        //trycatch+tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria", "root", "");
            System.out.println("Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());
        }
        return conex;
    }
    
}
