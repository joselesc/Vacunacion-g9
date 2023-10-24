package vacunacion.g9.entidades;

import java.time.LocalDate;

public class Vacuna {


    private int lote;
    private long cuit;
    private String marca;
    private double medida;
    private LocalDate fechaCaduca;
    private int stock;
    private boolean colocada;

    public Vacuna(int lote, long cuit, String marca, double medida, LocalDate fechaCaduca, int stock) {
        this.lote = lote;
        this.cuit = cuit;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.stock = stock;
    }

    public Vacuna() {
    }

    public Vacuna(long cuit, String marca, double medida, LocalDate fechaCaduca, int stock) {
        this.cuit = cuit;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.stock = stock;
    }

    public Vacuna(long cuit, String marca, double medida, LocalDate fechaCaduca, int stock, boolean colocada) {
        this.cuit = cuit;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.stock = stock;
        this.colocada = colocada;
    }

    public Vacuna(int lote, long cuit, String marca, double medida, LocalDate fechaCaduca, int stock, boolean colocada) {
        this.lote = lote;
        this.cuit = cuit;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.stock = stock;
        this.colocada = colocada;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
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
        return "Vacuna{" + "lote=" + lote + ", cuit=" + cuit + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", stock=" + stock + ", colocada=" + colocada + '}';
    }

}
