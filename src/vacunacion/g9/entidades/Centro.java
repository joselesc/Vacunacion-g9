package vacunacion.g9.entidades;

public class Centro {
    
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String zona;
    private boolean activo;

    public Centro() {
    }

    public Centro(int id, String nombre, String direccion, int telefono, String zona) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.zona = zona;
    }

    public Centro(String nombre, String direccion, int celular, String zona, boolean activo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = celular;
        this.zona = zona;
        this.activo = activo;
    }

    public Centro(int id, String nombre, String direccion, int celular, String zona, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = celular;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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
        return  id + " - " + nombre + " - " + direccion + " - " + telefono + " - " + zona + " - " + activo;
    }
}
