
package com.bellotoaccess.vista;
//author Cristian Olivares
//IMPORTS
import com.bellotoaccess.modelo.Persona;
import com.bellotoaccess.modelo.DataBaseForTest;
import com.bellotoaccess.modelo.Usuario;



public class MainBA {
 
    public static void main(String[] args) {
        //ejecutar el proyecto
        Login login = new Login();
        login.setVisible(true);
        //se ejecuta en el centro
        login.setLocationRelativeTo(null);
        
        
        
//        DataBaseForTest db = new DataBaseForTest();
//        //imprime la base de datos de las personas 
//        for (Persona personas : db.getPersonas()) {
//            personas.imprimirDetallePersona();
//        }
//        System.out.println("**************************************");
//        //aqui imprime la base de datos de los usuarios
//        for (Usuario usuarios : db.getUsuarios()){
//            usuarios.imprimirDetalleUsuario();  
//        }
    }
}
