package Vistas.Archivos.InternalAlmacenes;

import Conect.conexion;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class InternalArchivoAlmacenes extends javax.swing.JInternalFrame {

    public InternalArchivoAlmacenes() {
        initComponents();
        // Deshabilitar la opción de maximizar la ventana
        this.setMaximizable(false);
        this.setResizable(false);
        // Forzar la eliminación del botón de maximizar en Look & Feel Metal/Windows
javax.swing.plaf.InternalFrameUI ui = this.getUI();
if (ui instanceof javax.swing.plaf.basic.BasicInternalFrameUI) {
    javax.swing.plaf.basic.BasicInternalFrameUI basicUi = (javax.swing.plaf.basic.BasicInternalFrameUI) ui;
    javax.swing.JComponent titlePane = basicUi.getNorthPane();
    
    if (titlePane != null) {
        for (java.awt.Component c : titlePane.getComponents()) {
            // Evaluamos la propiedad accesible del componente
            if (c instanceof javax.swing.AbstractButton) {
                javax.swing.AbstractButton btn = (javax.swing.AbstractButton) c;
                // En Metal UI, el botón verde responde a esta propiedad de acción
                if ("Maximize".equals(btn.getAccessibleContext().getAccessibleName()) 
                        || (btn.getAction() != null && btn.getAction().toString().contains("Maximize"))) {
                    btn.setPreferredSize(new java.awt.Dimension(0, 0));
                    btn.setVisible(false);
                }
            }
        }
        titlePane.revalidate();
        titlePane.repaint();
    }
}
        // Carga la tabla al abrir el internal frame
        listarAlmacenes();
        // Cargar datos desde la sesión
        cargarDatosSesion();
}
    
    private void cargarDatosSesion() {
    jLabelUsuario.setText(Conect.Sesion.usuarioActivo);
    jLabelFecha.setText(Conect.Sesion.fechaActiva);
}
    
    public void listarAlmacenes() {
        DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Mantiene la tabla no editable
        }
    };

    modelo.addColumn("Código");
    modelo.addColumn("Almacenes");
    modelo.addColumn("Abreviado");
    modelo.addColumn("Tipo Kardéx");

    String sql = "SELECT codigo_almacen, nombre_almacenes, abreviado_almacen, tipo_kardex FROM almacenes";

    try (Connection cn = conexion.conectar();
         PreparedStatement ps = cn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Object[] fila = new Object[4];
            fila[0] = rs.getString("codigo_almacen");
            fila[1] = rs.getString("nombre_almacenes");
            fila[2] = rs.getString("abreviado_almacen");
            fila[3] = rs.getString("tipo_kardex");
            modelo.addRow(fila);
        }

        jTableAlmacenes.setModel(modelo);

        // 1. Configurar auto-resizing para que ocupe el ancho del contenedor si sobra espacio
        jTableAlmacenes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // 2. Ajustar el ancho de cada columna según el contenido y el título
        ajustarAnchoColumnas(jTableAlmacenes);

    } catch (SQLException e) {
        System.err.println("Error al cargar la tabla almacenes: " + e.getMessage());
    }
}

// Método auxiliar para calcular y aplicar el ancho óptimo
private void ajustarAnchoColumnas(JTable tabla) {
    for (int col = 0; col < tabla.getColumnCount(); col++) {
        int anchoMaximo = 0;

        // Evaluar el ancho del título de la columna (Header)
        Object valorHeader = tabla.getColumnModel().getColumn(col).getHeaderValue();
        if (valorHeader != null) {
            TableCellRenderer headerRenderer = tabla.getTableHeader().getDefaultRenderer();
            Component compHeader = headerRenderer.getTableCellRendererComponent(tabla, valorHeader, false, false, -1, col);
            anchoMaximo = Math.max(compHeader.getPreferredSize().width + 15, anchoMaximo);
        }

        // Evaluar el ancho del contenido de cada celda en la columna
        for (int row = 0; row < tabla.getRowCount(); row++) {
            TableCellRenderer cellRenderer = tabla.getCellRenderer(row, col);
            Component compCelda = tabla.prepareRenderer(cellRenderer, row, col);
            anchoMaximo = Math.max(compCelda.getPreferredSize().width + 15, anchoMaximo);
        }

        // Asignar el ancho preferido
        tabla.getColumnModel().getColumn(col).setPreferredWidth(anchoMaximo);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAlmacenes1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlmacenes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(185, 209, 234));
        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(244, 246, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(30, 41, 59));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la empresa");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("jLabelUsuario");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Almacenes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empresa: ");

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("jLabelFecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFecha)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabelUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelFecha))))
                .addGap(24, 24, 24))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Almacenes", "Tipo Doc.", "Nro. Doc.", "Nro. Doc Ini", "Nro. Doc Etc"
            }
        ));
        jTable3.setRowHeight(24);
        // 1. Obtener el encabezado de jTable3
        javax.swing.table.JTableHeader header = jTable3.getTableHeader();

        // 2. Aplicar el renderer al encabezado
        header.setDefaultRenderer(new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setOpaque(true);
                label.setBackground(new java.awt.Color(30, 41, 59)); // Azul Oscuro (#1E293B)
                label.setForeground(java.awt.Color.WHITE);             // Texto Blanco
                label.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 65, 85)));

                return label;
            }
        });

        // 3. Fondo blanco para la zona vacía del jScrollPane6
        jScrollPane6.getViewport().setBackground(java.awt.Color.WHITE);
        jScrollPane6.setViewportView(jTable3);

        jLabel6.setBackground(new java.awt.Color(30, 41, 59));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipos de Documentos por Almacen");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 132, 199)), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        jLabel6.setOpaque(true);

        jInternalFrame1.setBackground(new java.awt.Color(185, 209, 234));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame1.setName(""); // NOI18N
        jInternalFrame1.setRequestFocusEnabled(false);

        jTableAlmacenes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Almacenes", "Abreviado", "Tipo Kardéx"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlmacenes1.getTableHeader().setReorderingAllowed(false);
        jTableAlmacenes1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableAlmacenes1ComponentHidden(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAlmacenes1);
        if (jTableAlmacenes1.getColumnModel().getColumnCount() > 0) {
            jTableAlmacenes1.getColumnModel().getColumn(0).setResizable(false);
            jTableAlmacenes1.getColumnModel().getColumn(1).setResizable(false);
            jTableAlmacenes1.getColumnModel().getColumn(2).setResizable(false);
            jTableAlmacenes1.getColumnModel().getColumn(3).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Almacenes", "Tipo Doc.", "Nro. Doc.", "Nro. Doc Ini", "Nro. Doc Etc"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.getViewport().setBackground(java.awt.Color.WHITE);

        jTableAlmacenes.setForeground(new java.awt.Color(15, 23, 42));
        jTableAlmacenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Almacenes", "Abreviado", "Tipo Kardéx"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlmacenes.setRowHeight(24);
        jTableAlmacenes.setSelectionBackground(new java.awt.Color(2, 132, 199));
        jTableAlmacenes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableAlmacenes.getTableHeader().setReorderingAllowed(false);
        jTableAlmacenes.getTableHeader().setDefaultRenderer(new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setOpaque(true);
                label.setBackground(new java.awt.Color(30, 41, 59)); // Azul Oscuro (#1E293B)
                label.setForeground(java.awt.Color.WHITE);             // Texto Blanco
                label.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 65, 85)));

                return label;
            }
        });
        jTableAlmacenes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableAlmacenesComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlmacenes);
        if (jTableAlmacenes.getColumnModel().getColumnCount() > 0) {
            jTableAlmacenes.getColumnModel().getColumn(0).setResizable(false);
            jTableAlmacenes.getColumnModel().getColumn(1).setResizable(false);
            jTableAlmacenes.getColumnModel().getColumn(2).setResizable(false);
            jTableAlmacenes.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setBackground(new java.awt.Color(30, 41, 59));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Listado de Almacenes");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 132, 199)), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jTableAlmacenesComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableAlmacenesComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlmacenesComponentHidden

    private void jTableAlmacenes1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableAlmacenes1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlmacenes1ComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableAlmacenes;
    private javax.swing.JTable jTableAlmacenes1;
    // End of variables declaration//GEN-END:variables
}
