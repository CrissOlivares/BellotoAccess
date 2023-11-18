
package com.bellotoaccess.modelo;

import java.util.Date;

/**
 *
 * @author coh_o
 */
public class Propietario {
    private int id,deptowner,telef;
    private String run,nombre,apellido,email;
    private Date fecha;

    public Propietario() {
    }

    public Propietario(int id, int deptowner, int telef, String run, String nombre, String apellido, String email, Date fecha) {
        this.id = id;
        this.deptowner = deptowner;
        this.telef = telef;
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptowner() {
        return deptowner;
    }

    public void setDeptowner(int deptowner) {
        this.deptowner = deptowner;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", deptowner=" + deptowner + ", telef=" + telef + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", fecha=" + fecha + '}';
    }
   
    
}
