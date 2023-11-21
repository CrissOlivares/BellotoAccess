
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.BorradorDataBaseForTest;
import com.bellotoaccess.modelo.Usuario;
import com.bellotoaccess.vista.MenuInicial;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */
public class LoginDriver {

    private BorradorDataBaseForTest db = new BorradorDataBaseForTest();
    public LoginDriver() {
    }
   
    public LoginDriver (BorradorDataBaseForTest db){
        this.db = db;
    } 
    
     
    
     

    
//    //VALIDACION DE LOGIN(No funciono probar otro)
//        public boolean accesoLogin(String usuario, String pass){
//        Conexion con = new Conexion();
//        String usuarioCorrecto=null;
//        String passCorrecto=null;
//    try {
//        java.sql.Connection cnx = con.obtenerConexion();
//        PreparedStatement pst = cnx.prepareStatement("SELECT run_us, pass_us FROM usuario");
//        ResultSet rs = pst.executeQuery();
//        
//            if (rs.next()){
//                usuarioCorrecto = rs.getString(1);
//                passCorrecto = rs.getString(2);
//            }
//            
//            if (usuario.equals(usuarioCorrecto) && pass.equals(passCorrecto)){
//                JOptionPane.showMessageDialog(null, "Login correcto, Bienvenido");
//                return true;
//            } else if (usuario.equals(usuarioCorrecto)|| pass.equals(passCorrecto)){
//                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
//            return false;
//        }
//       return false; 
//    }
    
//    //validacion de prueba para el login usando el ArrayList, dejar como borrador
    
//    public boolean validaLoginArray (String runUsuario, String contrasena, BorradorDataBaseForTest db){
//         ArrayList<Usuario> usuarios = db.getUsuarios();
//         
//         for (Usuario usuario : usuarios) {
//             if (usuario.getRun().equalsIgnoreCase(runUsuario) && usuario.getContraseña().equals(contrasena) ){
//                 //aqui va para mostrar un mensaje de que estas entrando : JOptionPane.showMessageDialog(null, "Ingresando...", "Información",JOptionPane.INFORMATION_MESSAGE );
//                 return true;
//             } else{
//                 JOptionPane.showMessageDialog(null, "Run o contraseña incorrecta.", "Información",JOptionPane.WARNING_MESSAGE); 
//                 return false;
//            }
//        }
//    return false;
//    }
    
    //Te envia al menu principal
//    public void redirigirLogin (JFrame frame, BorradorDataBaseForTest db, boolean estado  ){
//        if (estado) {frame.dispose();
//        MenuInicial vp = new MenuInicial(db);
//        vp.setVisible(true);
//        }     
//    }
}
