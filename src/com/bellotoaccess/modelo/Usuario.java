
package com.bellotoaccess.modelo;

/**
 *
 * @author Cristian Olivares
 */
public class Usuario {
    private int id;
    private String run;
    private String nombre, apellido;
    private String contraseña;

    public Usuario() {
        this.id=0;
    }

    public Usuario(int id, String run, String nombre, String apellido, String contraseña) {
        this.id = id;
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    public void imprimirDetalleUsuario(){
        System.out.println("codigo: "+id+"\n" +
                "Run: "+run+"\n" +
                "Nombre : "+nombre+"\n" +        
                "Apellido: "+apellido+"\n" +
                "Contraseña: "+ contraseña+"\n");
    }
    
}

