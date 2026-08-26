package Conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    // CORREGIDO: Se eliminó la comilla doble extra que estaba al final antes del punto y coma
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_almacen?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";

    public static Connection conectar() {
        Connection link = null;
        try {
            link = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conectado exitosamente!");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return link;
    }
}