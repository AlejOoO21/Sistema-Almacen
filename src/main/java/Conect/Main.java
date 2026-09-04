package Conect;

import Vistas.vistaPrincipal; // Importamos la ventana principal

public class Main {

    public static void main(String[] args) {
        // 1. Probar la conexión a la base de datos
        conexion.conectar();

        // 2. Ejecutar y mostrar la interfaz gráfica en el hilo de Swing
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                vistaPrincipal principal = new vistaPrincipal();
                principal.setVisible(true); // Se muestra en pantalla completa
            }
        });
    }
}
