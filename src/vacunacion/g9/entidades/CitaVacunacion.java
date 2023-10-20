package vacunacion.g9.entidades;

import java.time.LocalDateTime;

public class CitaVacunacion {

    private int codCita, dni, lote, id_centro;
    private LocalDateTime fechaHoraCita;
    private boolean colocada, cancelada;

    public CitaVacunacion() {
    }

    public CitaVacunacion(int codCita, int dni, int lote, int id_centro, LocalDateTime fechaHoraCita, boolean colocada, boolean cancelada) {
        this.codCita = codCita;
        this.dni = dni;
        this.lote = lote;
        this.id_centro = id_centro;
        this.fechaHoraCita = fechaHoraCita;
        this.colocada = colocada;
        this.cancelada = cancelada;
    }   

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getId_centro() {
        return id_centro;
    }

    public void setId_centro(int id_centro) {
        this.id_centro = id_centro;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "codCita=" + codCita + ", dni=" + dni + ", lote=" + lote + ", id_centro=" + id_centro + ", fechaHoraCita=" + fechaHoraCita + ", colocada=" + colocada + ", cancelada=" + cancelada + '}';
    }

    
}
