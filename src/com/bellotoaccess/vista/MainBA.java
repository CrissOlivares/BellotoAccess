
package com.bellotoaccess.vista;
//author Cristian Olivares
//IMPORTS
import com.bellotoaccess.modelo.Persona;
import com.bellotoaccess.modelo.DataBase;
import com.bellotoaccess.modelo.Usuario;



public class MainBA {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        //imprime la base de datos de las personas 
        for (Persona personas : db.getPersonas()) {
            personas.imprimirDetallePersona();
        }
        System.out.println("**************************************");
        //aqui imprime la base de datos de los usuarios
        for (Usuario usuarios : db.getUsuarios()){
            usuarios.imprimirDetalleUsuario();  
        }
    }
}
