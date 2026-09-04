package DAO;

public class SesionDAO {
    private static String fechaIngresada;
    private static String usuarioIngresado;

    // Métodos para la Fecha
    public static String getFechaIngresada() {
        return fechaIngresada;
    }
    public static void setFechaIngresada(String fecha) {
        fechaIngresada = fecha;
    }

    // Métodos para el Usuario
    public static String getUsuarioIngresado() {
        return usuarioIngresado;
    }
    public static void setUsuarioIngresado(String usuario) {
        usuarioIngresado = usuario;
    }
}
