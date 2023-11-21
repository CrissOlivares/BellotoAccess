
package com.bellotoaccess.modelo;

/**
 *
 * @author Cristian Olivares
 */
public class BorradorPersona {

    public static void Persona() {
   
    }
    private String run;
    private String nombre, apellido;
    private int depto;
    private int piso;
    private int celular;
    private String email;
    private String tipo;
    private boolean estado;
    
    //constructores
    public BorradorPersona() {
    }

    public BorradorPersona(String run, String nombre, String apellido, int depto, int piso, int celular, String email, String tipo, boolean estado) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.depto = depto;
        this.piso = piso;
        this.celular = celular;
        this.email = email;
        this.tipo = tipo;
        this.estado = estado;
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

    public int getDepto() {
        return depto;
    }

    public void setDepto(int depto) {
        this.depto = depto;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", depto=" + depto + ", piso=" + piso + ", celular=" + celular + ", email=" + email + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
    
    //metodo customer
    /**
     *Metodo para imprimir el datalle de la persona. 
     */
    public void imprimirDetallePersona(){
        System.out.println(
                "Run: "+run+"\n" +
                "Nombre : "+nombre+"\n" +        
                "Apellido: "+apellido+"\n" +
                "Departamento: "+depto+"\n" +            
                "N Piso: "+piso+"\n" +
                "celular: "+celular+"\n" +       
                "E-Mail: "+email+"\n" +
                "Tipo: "+tipo+"\n" +       
                "Estado: "+estado+"\n"
        );  
        
    }
}

