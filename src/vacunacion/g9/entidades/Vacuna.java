package vacunacion.g9.entidades;

import java.time.LocalDate;

class Vacuna {
    
   private int nroSeriDosis;
    private long cuit;
    private String marca;
    private double medida;
    private LocalDate fechaCaduca;
    private int stock;
    private boolean colocada;

    public Vacuna() {
    }

    public Vacuna(int nroSeriDosis, long cuit, String marca, double medida, LocalDate fechaCaduca, int stock, boolean colocada) {
        this.nroSeriDosis = nroSeriDosis;
        this.cuit = cuit;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.stock = stock;
        this.colocada = colocada;
    }

    public int getNroSeriDosis() {
        return nroSeriDosis;
    }

    public void setNroSeriDosis(int nroSeriDosis) {
        this.nroSeriDosis = nroSeriDosis;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
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

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    @Override
    public String toString() {
        return "nroSeriDosis=" + nroSeriDosis 
                + ", cuit: " + cuit 
                + ", marca: " + marca 
                + ", medida: " + medida 
                + ", fechaCaduca: " + fechaCaduca 
                + ", stock: " + stock 
                + ", colocada: " + colocada;
    }
}
