
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//DEJAR IMPORTS POR SI LOS USO MAS ADELANTE
/**
 *
 * @author Cristian Olivares 20-11
 */
public class RegistroPropietario {
    
    //CRUD PROPIETARIO 
    //(NOTA: VERIFICARLO LUEGO EN EL PHP Y EN ORACLE)
     public boolean agregarPropietario(Propietario pr) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "INSERT INTO propietario (id_pro,depowner_pro, run_pro, nombre_pro, apellido_pro,email_pro,telef_pro) VALUES (?,?, ?, ?, ?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, pr.getId());
            stmt.setInt(2, pr.getDeptowner());
            stmt.setString(3, pr.getRun());
            stmt.setString(4, pr.getNombre());
            stmt.setString(5, pr.getApellido());
            stmt.setString(6, pr.getEmail());
            stmt.setInt(7, pr.getTelef());
            stmt.executeUpdate();
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
            String query = "UPDATE propietario SET depowner_pro=?, run_pro=?, nombre_pro=?, apellido_pro=?,email_pro=?,telef_pro=? WHERE id_pro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, pr.getDeptowner());         
            stmt.setString(2, pr.getRun());
            stmt.setString(3, pr.getNombre());
            stmt.setString(4, pr.getApellido());
            stmt.setString(5, pr.getEmail());
            stmt.setInt(6, pr.getTelef());
            stmt.setInt(7, pr.getId());
            stmt.executeUpdate();
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
            String query = "DELETE FROM propietario WHERE id_pro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);           
            stmt.executeUpdate();
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
            String query = "SELECT * FROM propietario WHERE id_pro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pr.setId(id);
            }
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar propietario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar propietario por ID: " + e.getMessage());
        }
        return pr;
     }
     public ArrayList<Propietario> ListaPropietario() {
        ArrayList<Propietario> listaPr = new ArrayList<Propietario>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM propietario order by id_pro";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
             //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                Propietario pro = new Propietario();
                pro.setId(rs.getInt("id_pro"));
                pro.setDeptowner(rs.getInt("depowner_pro"));
                pro.setRun(rs.getString("run_pro"));
                pro.setNombre(rs.getString("nombre_pro")); 
                pro.setApellido(rs.getString("apellido_pro"));
                pro.setEmail(rs.getString("email_pro"));
                pro.setTelef(rs.getInt("telef_pro"));
                listaPr.add(pro);
            }
            //cierro conexiones
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL Listar Propietario: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error Listar Propietario: " + e.getMessage());
        }
        return listaPr;
    }
}
