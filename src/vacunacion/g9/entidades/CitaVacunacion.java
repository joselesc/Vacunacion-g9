package vacunacion.g9.entidades;

import java.time.LocalDateTime;

public class CitaVacunacion {

    private int codCita;
    private Ciudadano persona;
    private int codRefuerzo;
    private LocalDateTime fechaHoraCita;
    private String centroVacunacion;
   private Vacuna dosis;
    private boolean cancelada;

    public CitaVacunacion(int codCita, Ciudadano persona, int codRefuerzo, LocalDateTime fechaHoraCita, String centroVacunacion, Vacuna dosis, boolean cancelada) {
        this.codCita = codCita;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.dosis = dosis;
        this.cancelada = cancelada;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, LocalDateTime fechaHoraCita, String centroVacunacion, Vacuna dosis, boolean cancelada) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.dosis = dosis;
        this.cancelada = cancelada;
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

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public String toString() {
        return codCita + " - " + persona + " - " + codRefuerzo + " - " + fechaHoraCita + " - " + centroVacunacion + " - "+ dosis + " - "+ cancelada;
    }

}
