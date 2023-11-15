
package com.bellotoaccess.controlador;

import com.bellotoaccess.modelo.DataBase;
import com.bellotoaccess.modelo.Usuario;
import com.bellotoaccess.vista.MenuInicial;
import java.util.ArrayList;
import javax.swing.JFrame;
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
            
    //validacion de prueba para el login usando el ArrayList
    public boolean validaLogin (String runUsuario, String contrasena, DataBase db){
         ArrayList<Usuario> usuarios = db.getUsuarios();
         
         for (Usuario usuario : usuarios) {
             if (usuario.getRun().equalsIgnoreCase(runUsuario) && usuario.getContraseña().equals(contrasena) ){
                 //aqui va para mostrar un mensaje de que estas entrando : JOptionPane.showMessageDialog(null, "Ingresando...", "Información",JOptionPane.INFORMATION_MESSAGE );
                 return true;
             } else{
                 JOptionPane.showMessageDialog(null, "Run o contraseña incorrecta.", "Información",JOptionPane.WARNING_MESSAGE); 
                 return false;
            }
        }
    return false;
    }
    //Te envia al menu principal
    public void redirigirLogin (JFrame frame, DataBase db, boolean estado  ){
        if (estado) {frame.dispose();
        MenuInicial vp = new MenuInicial(db);
        vp.setVisible(true);
        }     
    }
}
