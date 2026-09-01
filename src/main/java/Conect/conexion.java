package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    //private static final String URL = "jdbc:mysql://localhost:3307/sistema_almacen"; //Url para conectar bd fran
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_almacen";
    private static final String USER = "root"; // Tu usuario de BD
    private static final String PASSWORD = "root";  // contraseña de alejandro, fran
    //private static final String PASSWORD = "G1rock7";  //contraseña de rodrigo
    //private static final String PASSWORD = " ";  // contraseña de fran
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