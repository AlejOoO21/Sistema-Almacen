package vistas;

import Vistas.vistaPrincipal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import DAO.UsuarioDAO;

public class Loggin extends javax.swing.JFrame {

    public Loggin() {
        initComponents();
    
    this.setLocationRelativeTo(null); // Centra la ventana
    
    // Al presionar ENTER en cualquier campo, ejecutará el evento de jButtonAceptarLoggin
    this.getRootPane().setDefaultButton(jButtonAceptarLoggin);
    
    LocalDate fechaActual = LocalDate.now();
    
    // 2. Definir el formato (Día/Mes/Año)
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    // 3. Asignar la fecha formateada al campo txtFecha
    jTextFielFecha.setText(fechaActual.format(formato));
    
    // 4. Asignar el año actual al campo txtPeriodo
    jTextFieldPeriodo.setText(String.valueOf(fechaActual.getYear()));
    }
    
    private void validarYEntrar() {
    String usuario = jTextFielUsuario.getText().trim();
    String password = new String(jPasswordField.getPassword());

    if (usuario.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    UsuarioDAO dao = new UsuarioDAO();
    boolean esValido = dao.validarUsuario(usuario, password);

    if (esValido) {
        // Ingreso directo a la ventana principal
        vistaPrincipal principal = new vistaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose(); 
    } else {
        // Alerta visible únicamente si falla la autenticación
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
        jPasswordField.setText("");
        jPasswordField.requestFocus();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelTarjeta = new javax.swing.JPanel();
        jPanel_Contraseña = new javax.swing.JPanel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel_Usuario = new javax.swing.JPanel();
        jTextFielUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButtonAceptarLoggin = new javax.swing.JButton();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jTextFielFecha = new javax.swing.JTextField();

        jLabel1.setText("Fecha:");

        jLabel4.setText("Periado:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 183, 142));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTarjeta.setPreferredSize(new java.awt.Dimension(550, 220));

        jPanel_Contraseña.setBackground(new java.awt.Color(234, 234, 234));
        jPanel_Contraseña.setPreferredSize(new java.awt.Dimension(280, 45));
        jPanel_Contraseña.setLayout(new java.awt.BorderLayout());

        jPasswordField.setBackground(new java.awt.Color(234, 234, 234));
        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.setText("Password");
        jPasswordField.setBorder(null);
        jPasswordField.setEchoChar((char) 0);
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel_Contraseña.add(jPasswordField, java.awt.BorderLayout.CENTER);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Candado.png"))); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel_Contraseña.add(jLabel3, java.awt.BorderLayout.WEST);

        jPanel_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Usuario.setPreferredSize(new java.awt.Dimension(280, 45));
        jPanel_Usuario.setLayout(new java.awt.BorderLayout());

        jTextFielUsuario.setBackground(new java.awt.Color(234, 234, 234));
        jTextFielUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFielUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFielUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFielUsuario.setText("Username");
        jTextFielUsuario.setBorder(null);
        jTextFielUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFielUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFielUsuarioFocusLost(evt);
            }
        });
        jTextFielUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielUsuarioActionPerformed(evt);
            }
        });
        jPanel_Usuario.add(jTextFielUsuario, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(45, 45));
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_Usuario.add(jLabel2, java.awt.BorderLayout.WEST);

        jButtonAceptarLoggin.setBackground(new java.awt.Color(255, 218, 18));
        jButtonAceptarLoggin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAceptarLoggin.setText("Iniciar Sesion");
        jButtonAceptarLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarLogginActionPerformed(evt);
            }
        });

        jTextFieldPeriodo.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPeriodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeriodo.setText(" ");
        jTextFieldPeriodo.setInheritsPopupMenu(true);

        jTextFielFecha.setBackground(new java.awt.Color(234, 234, 234));
        jTextFielFecha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextFielFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFielFecha.setText(" ");
        jTextFielFecha.setInheritsPopupMenu(true);
        jTextFielFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTarjetaLayout = new javax.swing.GroupLayout(jPanelTarjeta);
        jPanelTarjeta.setLayout(jPanelTarjetaLayout);
        jPanelTarjetaLayout.setHorizontalGroup(
            jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtonAceptarLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelTarjetaLayout.setVerticalGroup(
            jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptarLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 440, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButtonAceptarLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarLogginActionPerformed
        // TODO add your handling code here:
        validarYEntrar();
    }//GEN-LAST:event_jButtonAceptarLogginActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
        validarYEntrar();
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextFielUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielUsuarioActionPerformed
        // TODO add your handling code here:
        jPasswordField.requestFocus();
    }//GEN-LAST:event_jTextFielUsuarioActionPerformed

    private void jTextFielUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFielUsuarioFocusGained
        // TODO add your handling code here:
        if (jTextFielUsuario.getText().equals("Username")) {
    jTextFielUsuario.setText("");
    jTextFielUsuario.setForeground(new java.awt.Color(0, 0, 0));
}
    }//GEN-LAST:event_jTextFielUsuarioFocusGained

    private void jTextFielUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFielUsuarioFocusLost
        // TODO add your handling code here:
        if (jTextFielUsuario.getText().trim().isEmpty()) {
    jTextFielUsuario.setText("Username");
    jTextFielUsuario.setForeground(new java.awt.Color(153, 153, 153));
}
    }//GEN-LAST:event_jTextFielUsuarioFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        // TODO add your handling code here:
        if (String.valueOf(jPasswordField.getPassword()).equals("Password")) {
    jPasswordField.setText("");
    jPasswordField.setForeground(new java.awt.Color(0, 0, 0));
    jPasswordField.setEchoChar('\u2022');
}
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        // TODO add your handling code here:
        if (String.valueOf(jPasswordField.getPassword()).trim().isEmpty()) {
    jPasswordField.setText("Password");
    jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
    jPasswordField.setEchoChar((char) 0);
}
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jTextFielFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielFechaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarLoggin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTarjeta;
    private javax.swing.JPanel jPanel_Contraseña;
    private javax.swing.JPanel jPanel_Usuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFielFecha;
    private javax.swing.JTextField jTextFielUsuario;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}
