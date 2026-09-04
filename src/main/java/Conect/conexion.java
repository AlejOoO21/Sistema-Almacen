package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    //private static final String URL = "jdbc:mysql://localhost:3307/sistema_almacen"; //Url para conectar bd fran
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_almacen";
    private static final String USER = "root"; // Tu usuario de BD
    private static final String PASSWORD = "root";  // contraseña de alejandro
    //private static final String PASSWORD = "G1rock7";  //contraseña de rodrigo
    //private static final String PASSWORD = " ";  // contraseña de fran
    public static Connection conectar() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de conexión a la BD: " + e.getMessage());
        }
        return cn;
    }
}