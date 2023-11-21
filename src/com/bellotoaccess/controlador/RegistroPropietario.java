/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Arrendatario;
import com.bellotoaccess.modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author coh_o
 */
public class RegistroPropietario {
    //CRUD ARRENDATARIO
     public boolean agregarPropietario(Propietario pr) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "INSERT INTO propietario (id_pro,depowner_pro, run_pro, nombre_pro, apellido_pro,email_pro,telef_pro) VALUES (?,?, ?, ?, ?,?,?)";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, pr.getId());
            stmt.setInt(2, pr.getDeptowner());
            stmt.setString(3, pr.getRun());
            stmt.setString(4, pr.getNombre());
            stmt.setString(5, pr.getApellido());
            stmt.setString(6, pr.getEmail());
            stmt.setInt(7, pr.getTelef());
            //ejecuto la query
            stmt.executeUpdate();
            //cierro conexiones
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al Agregar Propietario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error Agregar Propietario: " + e.getMessage());
            return false;
        }
    }
     public boolean modificarPropietario(Propietario pr) {
      try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "UPDATE propietario SET depowner_pro=?, run_pro=?, nombre_pro=?, apellido_pro=?,email_pro=?,telef_pro=? WHERE id_pro=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, pr.getDeptowner());         
            stmt.setString(2, pr.getRun());
            stmt.setString(3, pr.getNombre());
            stmt.setString(4, pr.getApellido());
            stmt.setString(5, pr.getEmail());
            stmt.setInt(6, pr.getTelef());
            stmt.setInt(7, pr.getId());
            //ejecuto la query
            stmt.executeUpdate();
            //cierro conexiones
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL modificar propietario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error modificar propietario: " + e.getMessage());
            return false;
        }
    }
     
      public boolean eliminarPropietario(int id) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "DELETE FROM propietario WHERE id_pro=?";
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
            System.out.println("Error SQL eliminar Propietario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error eliminar Propietario: " + e.getMessage());
            return false;
        }
    }
     
     public Propietario buscarPorIdPr(int id) {
        Propietario pr = new Propietario();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM propietario WHERE id_pro=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, id);
            //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pr.setId(id);
            }
            //cierro conexiones
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar propietario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar propietario por ID: " + e.getMessage());
        }
        return pr;
     }
}
