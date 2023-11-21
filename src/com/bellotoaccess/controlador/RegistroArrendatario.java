
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Arrendatario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author coh_o
 */
public class RegistroArrendatario {
    //CRUD ARRENDATARIO
     public boolean agregarArrendatario(Arrendatario ar) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "INSERT INTO arrendatario (id_ar,numdept_ar, run_ar, nombre_ar, apellido_ar,email_ar,telef_ar) VALUES (?,?, ?, ?, ?,?,?)";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, ar.getId());
            stmt.setInt(2, ar.getNumdept());
            stmt.setString(3, ar.getRun());
            stmt.setString(4, ar.getNombre());
            stmt.setString(5, ar.getApellido());
            stmt.setString(6, ar.getEmail());
            stmt.setInt(7, ar.getTelef());
            //ejecuto la query
            stmt.executeUpdate();
            //cierro conexiones
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al Agregar Arrendatario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error Agregar Arrendatario: " + e.getMessage());
            return false;
        }
    }
     public boolean modificarArrendatario(Arrendatario ar) {
      try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "UPDATE arrendatario SET numdept_ar=?, run_ar=?, nombre_ar=?, apellido_ar=?,email_ar=?,telef_ar=? WHERE id_ar=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, ar.getNumdept());         
            stmt.setString(2, ar.getRun());
            stmt.setString(3, ar.getNombre());
            stmt.setString(4, ar.getApellido());
            stmt.setString(5, ar.getEmail());
            stmt.setInt(6, ar.getTelef());
            stmt.setInt(7, ar.getId());
            //ejecuto la query
            stmt.executeUpdate();
            //cierro conexiones
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL modificar Arrendatario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error modificar Arrendatario: " + e.getMessage());
            return false;
        }
    }
     
      public boolean eliminarArrendatario(int id) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "DELETE FROM arrendatario WHERE id_ar=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, id);           
            //ejecuto la query
            stmt.executeUpdate();
            //cierro conexiones
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL eliminarArrendatario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error eliminar Arrendatario: " + e.getMessage());
            return false;
        }
    }
     
     public Arrendatario buscarPorIdArr(int id) {
        Arrendatario ar = new Arrendatario();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM arrendatario WHERE id_ar=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, id);
            //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ar.setId(id);
            }
            //cierro conexiones
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar Arrendatario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar Arrendatario por ID: " + e.getMessage());
        }
        return ar;
     }
}
