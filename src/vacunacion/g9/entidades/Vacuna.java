/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vacunacion.g9.entidades;

import java.util.Date;

/**
 *
 * @author jfaja
 */
class Vacuna {
    
    private int nroSerieDosis;
    private int cuit_laboratorio;
    private String marca;
    private double medida;
    private Date fechaCaduca;
    private boolean colocada;

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public int getCuit_laboratorio() {
        return cuit_laboratorio;
    }

    public void setCuit_laboratorio(int cuit_laboratorio) {
        this.cuit_laboratorio = cuit_laboratorio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public Date getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Date fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public Vacuna(int cuit_laboratorio, String marca, double medida, Date fechaCaduca, boolean colocada) {
        this.cuit_laboratorio = cuit_laboratorio;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
    }

    public Vacuna(int nroSerieDosis, int cuit_laboratorio, String marca, double medida, Date fechaCaduca, boolean colocada) {
        this.nroSerieDosis = nroSerieDosis;
        this.cuit_laboratorio = cuit_laboratorio;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
    }

    public Vacuna() {
    }

}
