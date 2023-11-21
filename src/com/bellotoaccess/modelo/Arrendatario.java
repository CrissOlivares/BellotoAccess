
package com.bellotoaccess.modelo;

import java.util.Date;

/**
 *
 * @author coh_o
 */
public class Arrendatario {
    
    private int id;
    private int numdept,telef;
    private String run,nombre,apellido,email;
    

    public Arrendatario() {
        this.id=0;
    }

    public Arrendatario(int id, int numdept, int telef, String run, String nombre, String apellido, String email) {
        this.id = id;
        this.numdept = numdept;
        this.telef = telef;
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumdept() {
        return numdept;
    }

    public void setNumdept(int numdept) {
        this.numdept = numdept;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    @Override
    public String toString() {
        return "Arrendatario{" + "id=" + id + ", numdept=" + numdept + ", telef=" + telef + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }

  
    
    
}
