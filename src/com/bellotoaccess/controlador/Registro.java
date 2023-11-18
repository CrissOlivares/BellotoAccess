
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Arrendatario;
import com.bellotoaccess.modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author coh_o
 */
public class Registro {
    
    public boolean agregar(Arrendatario arrendatario)
    {
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = arrendatario.get.fecha();
            
            String query = "insert into libro(titulo,autor,publicacion,precio,disponible) values(?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, persona.getTitulo());
            stmt.setString(2, persona.getAutor());
            stmt.setDate(3, new java.sql.Date(date.getTime()));
            stmt.setInt(4,persona.getPrecio());
            stmt.setBoolean(5,persona.isDisponible());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Libro " + e.getMessage() );
            return false;
        }
    }
    
    
}
