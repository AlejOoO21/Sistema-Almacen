package DAO;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JToolBar;

public class GradientToolBar extends JToolBar {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Color superior (blanco/celeste suave) y color inferior (azul claro)
        Color colorInicio = new Color(240, 248, 255);
        Color colorFin = new Color(170, 200, 235);

        // Crear el degradado vertical
        GradientPaint gp = new GradientPaint(
            0, 0, colorInicio,
            0, getHeight(), colorFin
        );

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
