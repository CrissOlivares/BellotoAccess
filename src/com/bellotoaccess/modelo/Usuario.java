/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellotoaccess.modelo;

/**
 *
 * @author Cristian Olivares
 */
public class Usuario {
    private String run;
    private String nombre, apellido;
    private String contraseña;

    public Usuario() {
    }

        //constructor
    public Usuario(String run, String nombre, String apellido, String contraseña) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }
    //getter and setter
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    //toString
    @Override
    public String toString() {
        return "Usuario{" + "run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" + contraseña + '}';
    }
    
        public void imprimirDetalleUsuario(){
        System.out.println(
                "Run: "+run+"\n" +
                "Nombre : "+nombre+"\n" +        
                "Apellido: "+apellido+"\n" +
                "Contraseña: "+ contraseña+"\n"
        );  
        
    }
    
    
}

