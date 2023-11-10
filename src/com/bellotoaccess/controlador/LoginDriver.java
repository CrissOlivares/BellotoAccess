
package com.bellotoaccess.controlador;

import com.bellotoaccess.modelo.DataBase;
import com.bellotoaccess.modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Olivares
 */
public class LoginDriver {

    private DataBase db = new DataBase();
    
    
    public LoginDriver() {
    }
   
    public LoginDriver (DataBase db){
        this.db = db;
    } 
            
            
    public boolean validaLogin (String runUsuario, String contraseña, DataBase db){
         ArrayList<Usuario> usuarios = db.getUsuarios();
         
         for (Usuario usuario : usuarios) {
             if (usuario.getRun().equalsIgnoreCase(runUsuario) && usuario.getContraseña().equals(contraseña) ){
                 JOptionPane.showMessageDialog(null, "Ingresando...", "Información",JOptionPane.INFORMATION_MESSAGE );
                 return true;
             } else{
                 JOptionPane.showMessageDialog(null, "Run o Contraseña incorrectas", "Información",JOptionPane.WARNING_MESSAGE); 
                 return false;
            }
        }
    return false;}

    
}
