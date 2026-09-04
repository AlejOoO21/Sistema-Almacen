package DAO;

import Conect.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public boolean validarUsuario(String usuario, String pass) {
        // Asegúrate de cambiar 'usuarios', 'nom_user' y 'clave' por los nombres reales de tu BD
        String sql = "SELECT * FROM tbusuarios WHERE nomUsuarios = ? AND pwdUsuarios = ?";
        
        try (Connection cn = conexion.conectar(); // Método de tu clase conexion.java
             PreparedStatement pst = cn.prepareStatement(sql)) {
            
            pst.setString(1, usuario);
            pst.setString(2, pass);
            
          try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                // Si entra aquí, la base de datos encontró coincidencia
                System.out.println("--- CONEXIÓN Y CONSULTA EXITOSA ---");
                System.out.println("Usuario encontrado en BD: " + rs.getString("nomUsuarios"));
                // Opcional: imprimir rol u otro campo de la tabla
                // System.out.println("Rol: " + rs.getString("rol")); 
                return true;
            } else {
                // Si entra aquí, las credenciales enviadas no coinciden
                System.out.println("--- CREDENCIALES NO ENCONTRADAS ---");
                System.out.println("Buscado -> Usuario: '" + usuario + "' | Pass: '" + pass + "'");
                return false;
            }
        }
            
        } catch (SQLException e) {
            System.err.println("Error al validar credenciales: " + e.getMessage());
            return false;
        }
    }
}