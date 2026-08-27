/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Loggin extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        LocalDate fechaActual = LocalDate.now();
    
    // 2. Definir el formato (Día/Mes/Año)
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    // 3. Asignar la fecha formateada al campo txtFecha
    jTextFielFecha.setText(fechaActual.format(formato));
    
    // 4. Asignar el año actual al campo txtPeriodo
    jTextFieldPeriodo.setText(String.valueOf(fechaActual.getYear()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFielFecha = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTextFielUsuario = new javax.swing.JTextField();
        jLabelPeriodo = new javax.swing.JLabel();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jLabelNombreEmpresa = new javax.swing.JLabel();
        jButtonAceptarLoggin = new javax.swing.JButton();
        jButtonCancelarLoggin = new javax.swing.JButton();
        jLabelMsj = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario: ");

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

        jLabelNombreEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombreEmpresa.setText("Nombre de la empresa");

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

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMAGEN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGO DE LA EMPRESA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelContraseña)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFielUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFielFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAceptarLoggin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCancelarLoggin)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFecha)
                                .addGap(156, 156, 156)
                                .addComponent(jLabelPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMsj)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreEmpresa)
                .addGap(18, 18, 18)
                .addComponent(jLabelMsj)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jTextFielFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPeriodo)
                            .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jTextFielUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAceptarLoggin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContraseña)
                            .addComponent(jButtonCancelarLoggin)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jTextFielUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButtonAceptarLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarLogginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAceptarLogginActionPerformed

    private void jButtonCancelarLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarLogginActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMsj;
    private javax.swing.JLabel jLabelNombreEmpresa;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFielFecha;
    private javax.swing.JTextField jTextFielUsuario;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}
