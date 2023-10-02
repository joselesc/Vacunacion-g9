/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.entidades;

/**
 *
 * @author josel
 */
public class Ciudadano {
    
    private int dni;
   private String nombre;
   private String apellido;
    private String  email;
    private int celular;
    private String patologia=null;
    private String ambitoTrabajo;

    public Ciudadano(int dni, String nombre, String apellido, String email, int celular, String patologia, String ambitoTrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
    }
    
    
      public Ciudadano(int dni, String nombre, String apellido, String email, int celular, String ambitoTrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.ambitoTrabajo = ambitoTrabajo;
    }
    

    public Ciudadano() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    @Override
    public String toString() {
        return  dni + " - " + nombre + " " + apellido + " - "+ email + " - " + celular + " - " + patologia + " - " + ambitoTrabajo ;
    }
    
    
           
    
}
