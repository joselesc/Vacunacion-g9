package vacunacion.g9;

import vacunacion.g9.accesoADatos.Conexion;
import vacunacion.g9.vistas.VacunacionG9Vista;

public class VacunacionG9 {

    public static void main(String[] args) {
        VacunacionG9Vista ingreso = new VacunacionG9Vista();
        ingreso.main(args);
        Conexion.getConexion();
    }
    
}
