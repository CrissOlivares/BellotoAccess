
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
            
            date = arrendatario.getFecha();
            
            String query = "insert into arrendatario(numdept,run,nombre,apellido,email,telef,fecha) values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, arrendatario.getNumdept());
            stmt.setString(2, arrendatario.getApellido());
            stmt.setString(3,arrendatario.getNombre());
            stmt.setString(4,arrendatario.getApellido());
            stmt.setString(5,arrendatario.getEmail());
            stmt.setInt(6,arrendatario.getTelef());    
            stmt.setDate(7, new java.sql.Date(date.getTime()));
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Arrendatario " + e.getMessage() );
            return false;
        }
    }
    
    
}
