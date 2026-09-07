package DAO;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class DesktopConFondo extends JDesktopPane {

    private Image imagen;

    public DesktopConFondo() 
    
    {
        // Carga la imagen desde la carpeta comprimida/compilada de Maven
        URL imgUrl = getClass().getResource("/imagenes/Fondo_Desktop.png");

        // Si la búsqueda directa falla, intenta mediante el ClassLoader
        if (imgUrl == null) {
            imgUrl = getClass().getClassLoader().getResource("imagenes/Fondo_Desktop.png");
        }

        if (imgUrl != null) {
            try {
                imagen = ImageIO.read(imgUrl);
            } catch (IOException e) {
                System.err.println("Error al leer la imagen: " + e.getMessage());
            }
        } else {
            System.err.println("MAVEN ERROR: No se encontró Fondo_Desktop.png en la carpeta target/classes/imagenes/");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}