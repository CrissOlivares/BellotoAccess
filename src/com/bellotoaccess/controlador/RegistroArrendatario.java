
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Arrendatario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cristian Olivares 21-11
 */
public class RegistroArrendatario {
    //CRUD ARRENDATARIO
     public boolean agregarArrendatario(Arrendatario ar) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "INSERT INTO arrendatario (id_ar,numdept_ar, run_ar, nombre_ar, apellido_ar,email_ar,telef_ar) VALUES (?,?, ?, ?, ?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, ar.getId());
            stmt.setInt(2, ar.getNumdept());
            stmt.setString(3, ar.getRun());
            stmt.setString(4, ar.getNombre());
            stmt.setString(5, ar.getApellido());
            stmt.setString(6, ar.getEmail());
            stmt.setInt(7, ar.getTelef());
            stmt.executeUpdate();
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
            String query = "UPDATE arrendatario SET numdept_ar=?, run_ar=?, nombre_ar=?, apellido_ar=?,email_ar=?,telef_ar=? WHERE id_ar=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, ar.getNumdept());         
            stmt.setString(2, ar.getRun());
            stmt.setString(3, ar.getNombre());
            stmt.setString(4, ar.getApellido());
            stmt.setString(5, ar.getEmail());
            stmt.setInt(6, ar.getTelef());
            stmt.setInt(7, ar.getId());
            stmt.executeUpdate();
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
            String query = "DELETE FROM arrendatario WHERE id_ar=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);           
            stmt.executeUpdate();
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
            String query = "SELECT * FROM arrendatario WHERE id_ar=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ar.setId(id);
            }
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar Arrendatario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar Arrendatario por ID: " + e.getMessage());
        }
        return ar;
     }
     
     public ArrayList<Arrendatario> ListaArrendatario() {
        ArrayList<Arrendatario> listaAr = new ArrayList<Arrendatario>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM arrendatario order by id_ar";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
             //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                Arrendatario ar = new Arrendatario();
                ar.setId(rs.getInt("id_ar"));
                ar.setNumdept(rs.getInt("numdept_ar"));
                ar.setRun(rs.getString("run_ar"));
                ar.setNombre(rs.getString("nombre_ar")); 
                ar.setApellido(rs.getString("apellido_ar"));
                ar.setEmail(rs.getString("email_ar"));
                ar.setTelef(rs.getInt("telef_ar"));
                listaAr.add(ar);
            }
            //cierro conexiones
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL Listar Arrendatario: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error Listar Arrendatario: " + e.getMessage());
        }
        return listaAr;
    }
}
