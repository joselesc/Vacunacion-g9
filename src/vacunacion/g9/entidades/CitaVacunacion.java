/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.entidades;

import java.time.LocalDateTime;

/**
 *
 * @author josel
 */
public class CitaVacunacion {
    
    private int codCita;
    private Ciudadano persona;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private LocalDateTime fechaHoraColocacion;
    private Vacuna dosis;

    public CitaVacunacion(int codCita, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraColocacion, Vacuna dosis) {
        this.codCita = codCita;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColocacion = fechaHoraColocacion;
        this.dosis = dosis;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, StringfechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraColocacion, Vacuna dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColocacion = fechaHoraColocacion;
        this.dosis = dosis;
    }

    
    public CitaVacunacion() {
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDateTime getFechaHoraColocacion() {
        return fechaHoraColocacion;
    }

    public void setFechaHoraColocacion(LocalDateTime fechaHoraColocacion) {
        this.fechaHoraColocacion = fechaHoraColocacion;
    }

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return codCita + " - " + persona + " - " + codRefuerzo + " - " + fechaHoraCita + " - " + centroVacunacion + " - " + fechaHoraColocacion + " - " + dosis;
    }
    
    
}
