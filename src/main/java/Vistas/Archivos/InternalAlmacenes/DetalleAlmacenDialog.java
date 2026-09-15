
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
        jTextField_NombreDeLaEmpresa.setEditable(false); // Empresa
        jTextFieldAlmaceSelec.setEditable(false);
        jTextFieldFechaCreaAlmac.setEditable(false);
        jTextField_Usuario.setEditable(false);
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
            jTextField_NombreDeLaEmpresa.setText("Empresa Principal"); 
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
            
            jTextField_Usuario.setText(usuarioMod != null ? usuarioMod : "Sin modificaciones");
            
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextField_NombreDeLaEmpresa = new javax.swing.JTextField();
        jLabel_Empresa = new javax.swing.JLabel();
        jLabel_Almacen = new javax.swing.JLabel();
        jTextFieldFechaCreaAlmac = new javax.swing.JTextField();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel_UsuarioModificado = new javax.swing.JLabel();
        jLabel_UltimaVezModificado = new javax.swing.JLabel();
        jTextFieldModificaFechaAlmac = new javax.swing.JTextField();
        jLabel_Estado = new javax.swing.JLabel();
        jTextFieldAlmaceSelec = new javax.swing.JTextField();
        jLabel_FechadeCreacio = new javax.swing.JLabel();
        jComboBoxEstadoAlmacen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(30, 41, 59));

        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CHECK.png"))); // NOI18N
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAceptar.setIconTextGap(1);
        jButtonAceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DISCHECK.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_NombreDeLaEmpresa.setEditable(false);
        jTextField_NombreDeLaEmpresa.setText("Nombre de la empresa");

        jLabel_Empresa.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Empresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Empresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Empresa.setText("Empresa:");

        jLabel_Almacen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Almacen.setText("Almacén: ");

        jTextFieldFechaCreaAlmac.setEditable(false);

        jTextField_Usuario.setEditable(false);
        jTextField_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsuarioActionPerformed(evt);
            }
        });

        jLabel_UsuarioModificado.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_UsuarioModificado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_UsuarioModificado.setText("Usuario Modifica: ");

        jLabel_UltimaVezModificado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_UltimaVezModificado.setText("Ultima vez modificado: ");

        jTextFieldModificaFechaAlmac.setEditable(false);

        jLabel_Estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Estado.setText("Estado: ");

        jTextFieldAlmaceSelec.setEditable(false);

        jLabel_FechadeCreacio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_FechadeCreacio.setText("Fecha de Creación:");

        jComboBoxEstadoAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxEstadoAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoAlmacenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_UsuarioModificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_UltimaVezModificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModificaFechaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FechadeCreacio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFechaCreaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Almacen)
                            .addGap(2, 2, 2)
                            .addComponent(jTextFieldAlmaceSelec))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Empresa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_NombreDeLaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NombreDeLaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAlmaceSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Almacen))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 465, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_UsuarioModificado)
                            .addComponent(jLabel_UltimaVezModificado)
                            .addComponent(jTextFieldModificaFechaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_FechadeCreacio)
                            .addComponent(jTextFieldFechaCreaAlmac, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Estado)
                            .addComponent(jComboBoxEstadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsuarioActionPerformed

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
    private javax.swing.JLabel jLabel_Almacen;
    private javax.swing.JLabel jLabel_Empresa;
    private javax.swing.JLabel jLabel_Estado;
    private javax.swing.JLabel jLabel_FechadeCreacio;
    private javax.swing.JLabel jLabel_UltimaVezModificado;
    private javax.swing.JLabel jLabel_UsuarioModificado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAlmaceSelec;
    private javax.swing.JTextField jTextFieldFechaCreaAlmac;
    private javax.swing.JTextField jTextFieldModificaFechaAlmac;
    private javax.swing.JTextField jTextField_NombreDeLaEmpresa;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
