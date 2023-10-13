package vacunacion.g9.entidades;

import java.time.LocalDate;

public class Ciudadano {

    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private int celular;
    private String zona;
    private String patologia = null;
    private boolean ambitoTrabajo;
    private boolean riesgo;
    private LocalDate fechaInscripcion;

    public Ciudadano() {
    }
    //Utilizado por AdministrarCiudadanoVista();
    public Ciudadano(int dni, boolean ambitoTrabajo, boolean riesgo, LocalDate fechaInscripcion) {
        this.dni = dni;
        this.ambitoTrabajo = ambitoTrabajo;
        this.riesgo = riesgo;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Ciudadano(int dni, String nombre, String apellido, String email, int celular, String zona, String patologia, boolean ambitoTrabajo, boolean riesgo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.zona = zona;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
        this.riesgo = riesgo;
    }

    public Ciudadano(int dni, String nombre, String apellido, String email, int celular, String zona, boolean ambitoTrabajo, boolean riesgo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.zona = zona;
        this.ambitoTrabajo = ambitoTrabajo;
        this.riesgo = riesgo;
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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public boolean isAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(boolean ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setRiesgo(boolean riego) {
        this.riesgo = riego;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString() {

        String ambito = "";
        String deRiesgo = "";
        if (ambitoTrabajo == true) {
            ambito = "de riesgo";
        }
        if (riesgo == true) {
            deRiesgo = "de riesgo";
        }
        if(patologia==null){
            patologia=" sin patologia preexistente";
        }

        return dni + " - " + nombre + " " + apellido + " - " + email + " - " + celular + " - " + zona + " - " + patologia
                + " - " + ambito + " - " + deRiesgo + " - " + fechaInscripcion;
    }

}
