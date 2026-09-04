package Vistas.InternalArchivo;

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlmacenes = new javax.swing.JTable();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setRequestFocusEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Almacenes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Empresa: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de la empresa");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Usuario: ");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setText("jLabelUsuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha: ");

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFecha.setText("jLabelFecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUsuario)))
                .addGap(18, 18, 18)
                .addComponent(jLabelFecha)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabelFecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelUsuario))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
        jTableAlmacenes.getTableHeader().setReorderingAllowed(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAlmacenesComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableAlmacenesComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlmacenesComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlmacenes;
    // End of variables declaration//GEN-END:variables
}
