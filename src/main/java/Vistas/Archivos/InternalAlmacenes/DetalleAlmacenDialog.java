
package Vistas.Archivos.InternalAlmacenes;

import Conect.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class DetalleAlmacenDialog extends javax.swing.JDialog {
    
    private int idAlmacen;
    
    // Constructor que acepta los 3 parámetros
    public DetalleAlmacenDialog(java.awt.Frame parent, boolean modal, int idAlmacen) {
        super(parent, modal);
        initComponents();
        this.idAlmacen = idAlmacen;
        this.setLocationRelativeTo(parent);
        
        cargarDetalleAlmacen();
    }

    public DetalleAlmacenDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.idAlmacen = idAlmacen;
        this.setLocationRelativeTo(parent);
        
        // Configurar los campos como no editables
        jTextField2.setEditable(false); // Empresa
        jTextFieldAlmaceSelec.setEditable(false);
        jTextFieldFechaCreaAlmac.setEditable(false);
        jTextFieldUsuarioModAlm.setEditable(false);
        jTextFieldModificaFechaAlmac.setEditable(false);
        
        cargarDetalleAlmacen();
    }
    
    private void cargarDetalleAlmacen() {
        String sql = "SELECT nombre_almacenes, fecha_creacion_almacen, es_activo_almacen, "
               + "fecha_modificacion_almacen, usuario_modificacion_almacen "
               + "FROM almacenes WHERE id_almacen = ?";

    try (Connection cn = conexion.conectar();
         PreparedStatement ps = cn.prepareStatement(sql)) {

        ps.setInt(1, idAlmacen);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            jTextField2.setText("Empresa Principal"); 
            jTextFieldAlmaceSelec.setText(rs.getString("nombre_almacenes"));
            
            // Formateador para mostrar solo la fecha (día/mes/año)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            // 1. Fecha de Creación
            java.sql.Timestamp fechaCreaTS = rs.getTimestamp("fecha_creacion_almacen");
            if (fechaCreaTS != null) {
                jTextFieldFechaCreaAlmac.setText(sdf.format(fechaCreaTS));
            } else {
                jTextFieldFechaCreaAlmac.setText("Sin registro");
            }

            // 2. Última Modificación (Usuario y Fecha)
            String usuarioMod = rs.getString("usuario_modificacion_almacen");
            java.sql.Timestamp fechaModTS = rs.getTimestamp("fecha_modificacion_almacen");
            
            jTextFieldUsuarioModAlm.setText(usuarioMod != null ? usuarioMod : "Sin modificaciones");
            
            if (fechaModTS != null) {
                jTextFieldModificaFechaAlmac.setText(sdf.format(fechaModTS));
            } else {
                jTextFieldModificaFechaAlmac.setText("Sin modificaciones");
            }

            // 3. Estado en el ComboBox
            int esActivo = rs.getInt("es_activo_almacen");
            if (esActivo == 1) {
                jComboBoxEstadoAlmacen.setSelectedItem("Activo");
            } else {
                jComboBoxEstadoAlmacen.setSelectedItem("Inactivo");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos del almacén: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void guardarCambios() {
        String estadoSeleccionado = jComboBoxEstadoAlmacen.getSelectedItem().toString();
        int nuevoEstado = estadoSeleccionado.equals("Activo") ? 1 : 0;
        
        // Se toma el usuario logueado almacenado en Conect.Sesion.usuarioActivo
        String usuarioActual = Conect.Sesion.usuarioActivo;

        String sqlUpdate = "UPDATE almacenes SET "
                         + "es_activo_almacen = ?, "
                         + "usuario_modificacion_almacen = ?, "
                         + "fecha_modificacion_almacen = NOW() "
                         + "WHERE id_almacen = ?";

        try (Connection cn = conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sqlUpdate)) {

            ps.setInt(1, nuevoEstado);
            ps.setString(2, usuarioActual);
            ps.setInt(3, idAlmacen);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Estado actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.dispose(); // Cierra el diálogo al guardar
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxEstadoAlmacen = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuarioModAlm = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextFieldAlmaceSelec = new javax.swing.JTextField();
        jTextFieldFechaCreaAlmac = new javax.swing.JTextField();
        jTextFieldModificaFechaAlmac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Empresa: ");

        jLabel9.setText("Almacén: ");

        jLabel10.setText("Usuario Modifica: ");

        jLabel11.setText("Ultima vez modificado: ");

        jLabel12.setText("Estado: ");

        jComboBoxEstadoAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxEstadoAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoAlmacenActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Detalle y cambio de estado de almacén");

        jLabel1.setText("Fecha de Creación:");

        jTextFieldUsuarioModAlm.setEditable(false);

        jTextField2.setEditable(false);
        jTextField2.setText("Nombre de la empresa");

        jTextFieldAlmaceSelec.setEditable(false);

        jTextFieldFechaCreaAlmac.setEditable(false);

        jTextFieldModificaFechaAlmac.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldAlmaceSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldFechaCreaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldUsuarioModAlm, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldModificaFechaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxEstadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAlmaceSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFechaCreaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldUsuarioModAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldModificaFechaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxEstadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEstadoAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoAlmacenActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jComboBoxEstadoAlmacenActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        guardarCambios();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Descarta cambios sin actualizar la BD
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleAlmacenDialog dialog = new DetalleAlmacenDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxEstadoAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAlmaceSelec;
    private javax.swing.JTextField jTextFieldFechaCreaAlmac;
    private javax.swing.JTextField jTextFieldModificaFechaAlmac;
    private javax.swing.JTextField jTextFieldUsuarioModAlm;
    // End of variables declaration//GEN-END:variables
}
