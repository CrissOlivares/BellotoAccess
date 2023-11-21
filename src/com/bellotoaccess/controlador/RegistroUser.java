
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Arrendatario;
import com.bellotoaccess.modelo.BorradorPersona;
import com.bellotoaccess.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author coh_o
 */
public class RegistroUser {
    //CRUD DEL USUARIO VALIDAR EL LOGIN
   public boolean validarUsuario(Usuario us) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "SELECT * FROM usuarios WHERE run_us=´run_us' and pass_us='pass_us'";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, us.getRun());
            stmt.setString(2, us.getContraseña());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al ingresar con sus credenciales: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error ingresar con sus credenciales: " + e.getMessage());
            return false;
        }
    }
    
    
    //CRUD PARA LOS USUARIOS, AGREGAR USUARIO
     public boolean agregarUsuario(Usuario us) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "INSERT INTO usuario (id_us, run_us, nombre_us, apellido_us,pass_us) VALUES (?, ?, ?, ?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, us.getId());
            stmt.setString(2, us.getRun());
            stmt.setString(3, us.getNombre());
            stmt.setString(4, us.getApellido());
            stmt.setString(5, us.getContraseña());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al Agregar Usuario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error Agregar Usuario: " + e.getMessage());
            return false;
        }
    }
     //MODIFICAR USUARIO
     public boolean modificarUsuario(Usuario us) {
      try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "UPDATE usuario SET run_us=?, nombre_us=?,apellido_us=?,pass_us=? WHERE id_us=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, us.getRun());
            stmt.setString(2, us.getNombre());
            stmt.setString(3, us.getApellido());
            stmt.setString(4, us.getContraseña());
            stmt.setInt(5, us.getId());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL Modificar Usuario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error Modificar Usuario: " + e.getMessage());
            return false;
        }
    }
     //Eliminar Usuario
      public boolean eliminarUsuario(int id) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "DELETE FROM usuario WHERE id_us=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);           
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL eliminar Usuario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error eliminarUsuario: " + e.getMessage());
            return false;
        }
    }
     //Buscar id Usuario
     public Usuario buscarPorId(int id) {
        Usuario us = new Usuario();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "SELECT * FROM usuario WHERE id_us=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                us.setId(id);
            }
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar Usuario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar Usuario por ID: " + e.getMessage());
        }
        return us;
     }  
    }


    
    

