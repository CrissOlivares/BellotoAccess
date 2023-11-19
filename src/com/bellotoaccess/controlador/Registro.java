
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
public class Registro {
    
    //CRUD PARA LOS USUARIO (SOLO AGREGAR)
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
     
     
     public Usuario buscarPorId(int id) {
        Usuario us = new Usuario();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM usuario WHERE id_us=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, id);
            //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                us.setId(id);
              
            }
            //cierro conexiones
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL buscar Usuario por ID: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error buscar Usuario por ID: " + e.getMessage());
        }
        return us;
     }
     
    //CRUD ARRENDATARIO
     public boolean agregarArrendatario(Arrendatario ar) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "INSERT INTO arrendatario (id,numdepto, run, nombre, apellido,email,telef) VALUES (?,?, ?, ?, ?,?,?)";
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
            System.out.println("Error al Agregar Usuario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error Agregar Usuario: " + e.getMessage());
            return false;
        }
    }
      public boolean modificarArrendatario(Arrendatario ar) {
      try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "UPDATE arrendatario SET id=?,numdept=?,nombre=?,apellido=?,email=?,telef=? WHERE id=?";
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
            System.out.println("Error SQL modificarArrendatario: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error modificarArrendatario: " + e.getMessage());
            return false;
        }
    }
     
      public boolean eliminarArrendatario(int id) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "DELETE FROM arrendatario WHERE id=?";
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
            System.out.println("Error eliminarArrendatario: " + e.getMessage());
            return false;
        }
    }
     
     public Arrendatario buscarPorIdArr(int id) {
        Arrendatario ar = new Arrendatario();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            //Declaro un string donde guardo la QUERY para ejecutar en la BD
            String query = "SELECT * FROM usuario WHERE identificador=?";
            //Defino PreparedStatement
            PreparedStatement stmt = cnx.prepareStatement(query);
            //con el query asignado ahora le doy valores a los '?'
            stmt.setInt(1, id);
            //ejecuto la consulta
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ar.setId(id);
                ar.setNombre(rs.getString("Nombre"));
                ar.setApellido(rs.getString("apellido"));
                ar.setRun(rs.getString("Run"));
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
        
        
        //VALIDACION DE LOGIN
        public boolean accesoLogin(String usuario, String pass){
        Conexion con = new Conexion();
        String usuarioCorrecto=null;
        String passCorrecto=null;
    try {
        Connection cnx = con.obtenerConexion();
        PreparedStatement pst = cnx.prepareStatement("SELECT run_us, pass_us FROM usuario");
        ResultSet rs = pst.executeQuery();
        
            if (rs.next()){
                usuarioCorrecto = rs.getString(1);
                passCorrecto = rs.getString(2);
            }
            
            if (usuario.equals(usuarioCorrecto) && pass.equals(passCorrecto)){
                JOptionPane.showMessageDialog(null, "Login correcto, Bienvenido");
                return true;
            } else if (usuario.equals(usuarioCorrecto)|| pass.equals(passCorrecto)){
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
            return false;
        }
       return false; 
    }
    }

           
    
     
//    public boolean agregar(Arrendatario arrendatario)
//    {
//        Date date;
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            date = arrendatario.getFecha();
//            
//            String query = "insert into arrendatario(numdept,run,nombre,apellido,email,telef,fecha) values(?,?,?,?,?,?,?)";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setInt(1, arrendatario.getNumdept());
//            stmt.setString(2, arrendatario.getApellido());
//            stmt.setString(3,arrendatario.getNombre());
//            stmt.setString(4,arrendatario.getApellido());
//            stmt.setString(5,arrendatario.getEmail());
//            stmt.setInt(6,arrendatario.getTelef());    
//            stmt.setDate(7, new java.sql.Date(date.getTime()));
//            
//            stmt.executeUpdate();
//            stmt.close();
//            cnx.close();
//            
//            return true;
//            
//        } catch (SQLException e) {
//            System.out.println("Error SQL al agregar Arrendatario " + e.getMessage() );
//            return false;
//        }
//    }
    
    

