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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAceptarLoggin = new javax.swing.JButton();
        jButtonCancelarLoggin = new javax.swing.JButton();
        jLabelMsj = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFielFecha = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTextFielUsuario = new javax.swing.JTextField();
        jLabelPeriodo = new javax.swing.JLabel();
        jTextFieldPeriodo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGO DE LA EMPRESA");

        jButtonAceptarLoggin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAceptarLoggin.setText("Aceptar");
        jButtonAceptarLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarLogginActionPerformed(evt);
            }
        });

        jButtonCancelarLoggin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCancelarLoggin.setText("Cancelar");
        jButtonCancelarLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarLogginActionPerformed(evt);
            }
        });

        jLabelMsj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelMsj.setText("Ingresar nombre de usuario y contraseña: ");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario: ");

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jLabelContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContraseña.setText("Contraseña: ");

        jTextFielFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFielFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFielFecha.setText(" ");
        jTextFielFecha.setInheritsPopupMenu(true);

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFecha.setText("Fecha: ");

        jTextFielUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFielUsuario.setText(" ");
        jTextFielUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielUsuarioActionPerformed(evt);
            }
        });

        jLabelPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPeriodo.setText("Periodo: ");

        jTextFieldPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPeriodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeriodo.setText(" ");
        jTextFieldPeriodo.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jButtonCancelarLoggin))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelMsj)
                            .addGap(219, 219, 219))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelUsuario)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFielUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelContraseña)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelFecha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFielFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelPeriodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAceptarLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMsj)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarLoggin)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarLoggin)
                    .addComponent(jTextFielFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jTextFielUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielUsuarioActionPerformed
        // TODO add your handling code here:
        jPasswordField.requestFocus();
    }//GEN-LAST:event_jTextFielUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
        validarYEntrar();
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButtonAceptarLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarLogginActionPerformed
        // TODO add your handling code here:
        validarYEntrar();
    }//GEN-LAST:event_jButtonAceptarLogginActionPerformed

    private void jButtonCancelarLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarLogginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarLogginActionPerformed

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
    private javax.swing.JButton jButtonCancelarLoggin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMsj;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFielFecha;
    private javax.swing.JTextField jTextFielUsuario;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}
