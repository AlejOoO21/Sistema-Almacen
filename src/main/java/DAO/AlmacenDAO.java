package DAO;

import Conect.conexion; // Ajusta a tu clase de conexión
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class AlmacenDAO {
    public DefaultTableModel listarAlmacenes() {
        // 1. Definimos únicamente las 2 columnas a mostrar
        String[] columnas = {"Código", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        // 2. Consulta seleccionando solo codigo_almacen y nombre
        String sql = "SELECT codigo_almacen, nombre FROM almacenes";

        try (Connection cn = conexion.getconectar();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            Object[] fila = new Object[2];
            while (rs.next()) {
                fila[0] = rs.getString("codigo_almacen");
                fila[1] = rs.getString("nombre");
                
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            System.err.println("Error al cargar almacenes: " + e.getMessage());
        }

        return modelo;
    }
}
