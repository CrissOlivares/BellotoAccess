
package com.bellotoaccess.modelo;

import java.util.ArrayList;

/**
 *
 * @author Cristian Olivares
 */
public class DataBaseForTest {
    //simulacion de base de datos (BORRAR)
    private ArrayList<Persona> personas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> colecciones;
    
    //constructor 
    public DataBaseForTest(){
        this.personas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.colecciones = new ArrayList<>();
        
        /**Al iniciar la clase comienza a llenar la base de datos*/
            agregarMockup();
    }
    
    //getter y setters
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<String> getColecciones() {
        return colecciones;
    }

    public void setColecciones(ArrayList<String> colecciones) {
        this.colecciones = colecciones;
    }
   
    //metodos customers
    
   
    
    
    
    /**
     * Metodos que agregan datos dummy como simulacion de una base de datos
     */
    private void agregarMockup(){
        //añadir personas
    this.personas.add(new Persona("19770359-8","Cristian","Olivares",203,1, 974741504,"cri.olivaresh@duocuc.cl","Arrendatario",true));
    this.personas.add(new Persona("11507568-3","Victoria","Castilo",203,1, 975751605,"vic.castillo@duocuc.cl","Arrendatario",true));
    this.personas.add(new Persona("14998344-k","Jordan","Robles",304,2, 986861709,"jor.robles@duocuc.cl","Propietario",true));
        //añadir usuario
    this.usuarios.add(new Usuario(4,"19770359-8", "Cristian", "Olivares", "cris123"));    
    this.usuarios.add(new Usuario(1,"16667556-2", "Carlos", "tapia", "carlos123"));
    this.usuarios.add(new Usuario(2,"19990459-7","Fabian","Contreras","fabian123"));
    this.usuarios.add(new Usuario(3,"20876321-2","Yasna","Herrera","yasi443"));
    
    
        //añadir colecciones
    this.colecciones.add("Arrendatario");
    this.colecciones.add("Propietario");
    this.colecciones.add("Usuario");
    }
    
    
    
    
}


