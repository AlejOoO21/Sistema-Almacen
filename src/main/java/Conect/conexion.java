package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_almacen";
    private static final String USER = "root"; // Tu usuario de BD
    private static final String PASSWORD = "root";  // Tu contraseña de BD

    public static Connection getconectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        return con;
    }
}