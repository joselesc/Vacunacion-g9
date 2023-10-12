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
public class Centro {
    
    private int id;
    private String nombre;
    private String direccion;
    private int celular;
    private String zona;
    private boolean activo;

    public Centro() {
    }

    public Centro(String nombre, String direccion, int celular, String zona, boolean activo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.zona = zona;
        this.activo = activo;
    }

    public Centro(int id, String nombre, String direccion, int celular, String zona, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.zona = zona;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        String estado;
        if (activo==true){
            estado="act";
        }else{
            estado="baja";
        }
             
        return  id + " - " + nombre + " - " + direccion + " - " + celular + " - " + zona + " - " + estado;
    }
    
    
    
    
    
}
