package Vistas;

import Vistas.InternalArchivo.InternalArchivoAlmacenes;
import Vistas.InternalArchivo.InternalCierreValorización;
import Vistas.InternalArchivo.InternalCliente;
import Vistas.InternalArchivo.InternalGalga;
import Vistas.InternalArchivo.InternalLineasFamilias;
import Vistas.InternalArchivo.InternalMaquina;
import Vistas.InternalArchivo.InternalMuestras;
import Vistas.InternalArchivo.InternalProductos;
import Vistas.InternalArchivo.InternalProveedor;
import Vistas.InternalArchivo.InternalTecnica;
import Vistas.InternalArchivo.InternalTipoProduc;
import Vistas.InternalArchivo.InternalTipoServicios;
import Vistas.InternalArchivo.InternalTipodeCambio;
import Vistas.InternalArchivo.InternalTransportista;
import Vistas.InternalArchivo.InternalUsuarios;
import java.util.LinkedList;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;

public class vistaPrincipal extends javax.swing.JFrame {
    
    // Control de ventanas en cola
    private LinkedList<JInternalFrame> ventanasAbiertas = new LinkedList<>();
    private final int MAX_VENTANAS = 6;
    
    public vistaPrincipal() {   
        initComponents();
<<<<<<< HEAD

    // 1. Limpiar el panel para borrar residuos del diseñador visual
    jPanel2.removeAll();
=======
        // 1. Quitar límites de tamaño
        FONDO.setPreferredSize(null);
        FONDO.setMinimumSize(null);
>>>>>>> ec7a1c0 (Subiendo avances de mi parte del proyecto)

    // 2. Arreglo con las variables reales de tus botones
    javax.swing.JButton[] botones = {
        jButton17, jButton18, jButton19, jButton20, 
        jButton21, jButton22, jButton23, jButton24
    };

<<<<<<< HEAD
    // Estilo visual de los botones
    for (javax.swing.JButton btn : botones) {
        btn.setPreferredSize(new java.awt.Dimension(90, 90)); // Tamaño rectangular
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(true);
        btn.setBackground(java.awt.Color.WHITE);
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 190, 210), 1),
            javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
    }

        // 3. Configurar GridBagLayout en jPanel2
        jPanel2.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = java.awt.GridBagConstraints.RELATIVE;
        gbc.anchor = java.awt.GridBagConstraints.NORTH;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.insets = new java.awt.Insets(4, 6, 4, 6);

    // Agregar los botones de forma limpia
        for (javax.swing.JButton btn : botones) {
        jPanel2.add(btn, gbc);
    }

    // 4. Componente invisible al final para empujar todo hacia arriba
        gbc.weighty = 1.0;
        gbc.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(new javax.swing.JLabel(), gbc);

    // Reconstruir el panel
        jPanel2.revalidate();
        jPanel2.repaint();
    }      
=======
        // 3. Renderizar y actualizar el diseño de los paneles
        this.revalidate();
        this.repaint();
        }
        
>>>>>>> ec7a1c0 (Subiendo avances de mi parte del proyecto)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jDesktopPanePantallas = new DAO.DesktopConFondo();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton25 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        jMenuArchiovos = new javax.swing.JMenu();
        jRadioButtonMenuItemAlmacenes = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemLineasFamilias = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemTipoProd = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemProductos = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemCierreMesValorizacion = new javax.swing.JRadioButtonMenuItem();
        jMenuCaracteristicas = new javax.swing.JMenu();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemMuestras = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemTipoServicios = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemTecnica = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemMaquina = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemGalga = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemClientes = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemProveedores = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemTransportistas = new javax.swing.JRadioButtonMenuItem();
        jMenuContabilidad = new javax.swing.JMenu();
        jRadioButtonMenuItem44 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemTipoCambio = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemUsuarios = new javax.swing.JRadioButtonMenuItem();
        jMenuConsumos = new javax.swing.JMenu();
        jRadioButtonMenuItem26 = new javax.swing.JRadioButtonMenuItem();
        jMenuOtros = new javax.swing.JMenu();
        jRadioButtonMenuItem27 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem20 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem21 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem22 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem23 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem24 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem25 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem12 = new javax.swing.JRadioButtonMenuItem();
        jMenuRegistros = new javax.swing.JMenu();
        jRadioButtonMenuItem28 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem29 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem30 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem31 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem32 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem33 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem34 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem35 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem36 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem37 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem38 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem39 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem40 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem41 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem42 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem43 = new javax.swing.JRadioButtonMenuItem();
        jMenuIngresos = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jRadioButtonMenuItem46 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem47 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem48 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem49 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem50 = new javax.swing.JRadioButtonMenuItem();
        jMenuSalidas = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jRadioButtonMenuItem54 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem45 = new javax.swing.JRadioButtonMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jRadioButtonMenuItem55 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem51 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem52 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem53 = new javax.swing.JRadioButtonMenuItem();
        jMenuTransferencias = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jRadioButtonMenuItem58 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem56 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem57 = new javax.swing.JRadioButtonMenuItem();
        jMenuRequerimientos = new javax.swing.JMenu();
        jRadioButtonMenuItem59 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem60 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem61 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem62 = new javax.swing.JRadioButtonMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jRadioButtonMenuItem63 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem64 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem65 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem66 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem67 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem68 = new javax.swing.JRadioButtonMenuItem();
        jMenuGuiasElectronicas = new javax.swing.JMenu();
        jRadioButtonMenuItem69 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem70 = new javax.swing.JRadioButtonMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jRadioButtonMenuItem80 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem81 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem82 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem83 = new javax.swing.JRadioButtonMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jRadioButtonMenuItem84 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem85 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem86 = new javax.swing.JRadioButtonMenuItem();
        jMenuProcesos = new javax.swing.JMenu();
        jRadioButtonMenuItem71 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem72 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem73 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem74 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem75 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem76 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem77 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem78 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem79 = new javax.swing.JRadioButtonMenuItem();
        jMenuVentanas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        FONDO.setBackground(new java.awt.Color(212, 227, 238));
        FONDO.setPreferredSize(null);
        FONDO.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(125, 400));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atajos.png"))); // NOI18N
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton17.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton17.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EntreArticulos.png"))); // NOI18N
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton18.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton18.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Provedores.png"))); // NOI18N
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton19.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton19.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OrdenesCompra.png"))); // NOI18N
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton20.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton20.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ConsultaKardex.png"))); // NOI18N
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton21.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton21.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar Archivo.png"))); // NOI18N
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton22.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton22.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Exportar Archivos.png"))); // NOI18N
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton23.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton23.setPreferredSize(new java.awt.Dimension(90, 90));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Transferencias de Reportes.png"))); // NOI18N
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setMaximumSize(new java.awt.Dimension(90, 90));
        jButton24.setMinimumSize(new java.awt.Dimension(90, 90));
        jButton24.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FONDO.add(jPanel2, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jDesktopPanePantallasLayout = new javax.swing.GroupLayout(jDesktopPanePantallas);
        jDesktopPanePantallas.setLayout(jDesktopPanePantallasLayout);
        jDesktopPanePantallasLayout.setHorizontalGroup(
            jDesktopPanePantallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
        );
        jDesktopPanePantallasLayout.setVerticalGroup(
            jDesktopPanePantallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1580, Short.MAX_VALUE)
        );

        FONDO.add(jDesktopPanePantallas, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarComo.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imprimir.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Excel_.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calculo.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);
        jToolBar1.add(jSeparator3);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        jButton25.setFocusable(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton25);

        FONDO.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(FONDO, java.awt.BorderLayout.CENTER);

        Menu.setBorder(new javax.swing.border.MatteBorder(null));

        jMenuArchiovos.setText("Archivos");

        jRadioButtonMenuItemAlmacenes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemAlmacenes.setSelected(true);
        jRadioButtonMenuItemAlmacenes.setText("Almacenes");
        jRadioButtonMenuItemAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemAlmacenesActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemAlmacenes);

        jRadioButtonMenuItemLineasFamilias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemLineasFamilias.setSelected(true);
        jRadioButtonMenuItemLineasFamilias.setText("Lineas y Familias");
        jRadioButtonMenuItemLineasFamilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemLineasFamiliasActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemLineasFamilias);

        jRadioButtonMenuItemTipoProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemTipoProd.setSelected(true);
        jRadioButtonMenuItemTipoProd.setText("Tipo de Producto");
        jRadioButtonMenuItemTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemTipoProdActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemTipoProd);

        jRadioButtonMenuItemProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemProductos.setSelected(true);
        jRadioButtonMenuItemProductos.setText("Productos");
        jRadioButtonMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemProductos);

        jRadioButtonMenuItemCierreMesValorizacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemCierreMesValorizacion.setSelected(true);
        jRadioButtonMenuItemCierreMesValorizacion.setText("Cierre Mes de Valorización");
        jRadioButtonMenuItemCierreMesValorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemCierreMesValorizacionActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemCierreMesValorizacion);

        jMenuCaracteristicas.setText("Caracteristicas");

        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("jRadioButtonMenuItem6");
        jMenuCaracteristicas.add(jRadioButtonMenuItem6);

        jMenuArchiovos.add(jMenuCaracteristicas);

        jRadioButtonMenuItemMuestras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemMuestras.setSelected(true);
        jRadioButtonMenuItemMuestras.setText("Muestras");
        jRadioButtonMenuItemMuestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemMuestrasActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemMuestras);

        jRadioButtonMenuItemTipoServicios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemTipoServicios.setSelected(true);
        jRadioButtonMenuItemTipoServicios.setText("Tipo de Servicios");
        jRadioButtonMenuItemTipoServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemTipoServiciosActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemTipoServicios);

        jRadioButtonMenuItemTecnica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemTecnica.setSelected(true);
        jRadioButtonMenuItemTecnica.setText("Tecnica");
        jRadioButtonMenuItemTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemTecnicaActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemTecnica);

        jRadioButtonMenuItemMaquina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemMaquina.setSelected(true);
        jRadioButtonMenuItemMaquina.setText("Maquina");
        jRadioButtonMenuItemMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemMaquinaActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemMaquina);

        jRadioButtonMenuItemGalga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemGalga.setSelected(true);
        jRadioButtonMenuItemGalga.setText("Galga");
        jRadioButtonMenuItemGalga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemGalgaActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemGalga);

        jRadioButtonMenuItemClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemClientes.setSelected(true);
        jRadioButtonMenuItemClientes.setText("Cliente");
        jRadioButtonMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemClientes);

        jRadioButtonMenuItemProveedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemProveedores.setSelected(true);
        jRadioButtonMenuItemProveedores.setText("Proveedor");
        jRadioButtonMenuItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemProveedoresActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemProveedores);

        jRadioButtonMenuItemTransportistas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemTransportistas.setSelected(true);
        jRadioButtonMenuItemTransportistas.setText("Transportista");
        jRadioButtonMenuItemTransportistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemTransportistasActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemTransportistas);

        jMenuContabilidad.setText("Contabilidad");

        jRadioButtonMenuItem44.setSelected(true);
        jRadioButtonMenuItem44.setText("jRadioButtonMenuItem44");
        jMenuContabilidad.add(jRadioButtonMenuItem44);

        jMenuArchiovos.add(jMenuContabilidad);

        jRadioButtonMenuItemTipoCambio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemTipoCambio.setSelected(true);
        jRadioButtonMenuItemTipoCambio.setText("Tipo de Cambio");
        jRadioButtonMenuItemTipoCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemTipoCambioActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemTipoCambio);

        jRadioButtonMenuItemUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItemUsuarios.setSelected(true);
        jRadioButtonMenuItemUsuarios.setText("Usuarios");
        jRadioButtonMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItemUsuarios);

        jMenuConsumos.setText("Consumos");

        jRadioButtonMenuItem26.setSelected(true);
        jRadioButtonMenuItem26.setText("jRadioButtonMenuItem26");
        jMenuConsumos.add(jRadioButtonMenuItem26);

        jMenuArchiovos.add(jMenuConsumos);

        jMenuOtros.setText("Otros");

        jRadioButtonMenuItem27.setSelected(true);
        jRadioButtonMenuItem27.setText("jRadioButtonMenuItem27");
        jMenuOtros.add(jRadioButtonMenuItem27);

        jMenuArchiovos.add(jMenuOtros);

        jRadioButtonMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem20.setSelected(true);
        jRadioButtonMenuItem20.setText("Cerrar");
        jRadioButtonMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem20ActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItem20);

        jRadioButtonMenuItem21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem21.setSelected(true);
        jRadioButtonMenuItem21.setText("Aceptar");
        jRadioButtonMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem21ActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItem21);

        jRadioButtonMenuItem22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem22.setSelected(true);
        jRadioButtonMenuItem22.setText("Grabar Como_");
        jRadioButtonMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem22ActionPerformed(evt);
            }
        });
        jMenuArchiovos.add(jRadioButtonMenuItem22);

        jRadioButtonMenuItem23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem23.setSelected(true);
        jRadioButtonMenuItem23.setText("Grabar Excel");
        jMenuArchiovos.add(jRadioButtonMenuItem23);

        jRadioButtonMenuItem24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem24.setSelected(true);
        jRadioButtonMenuItem24.setText("Refrescar");
        jMenuArchiovos.add(jRadioButtonMenuItem24);

        jRadioButtonMenuItem25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem25.setSelected(true);
        jRadioButtonMenuItem25.setText("Imprimir");
        jMenuArchiovos.add(jRadioButtonMenuItem25);

        jRadioButtonMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem10.setSelected(true);
        jRadioButtonMenuItem10.setText("Impresion Previa");
        jMenuArchiovos.add(jRadioButtonMenuItem10);

        jRadioButtonMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem11.setSelected(true);
        jRadioButtonMenuItem11.setText("Configurar Impresora");
        jMenuArchiovos.add(jRadioButtonMenuItem11);

        jRadioButtonMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem12.setSelected(true);
        jRadioButtonMenuItem12.setText("Salir");
        jMenuArchiovos.add(jRadioButtonMenuItem12);

        Menu.add(jMenuArchiovos);

        jMenuRegistros.setText("Registro");

        jRadioButtonMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem28.setSelected(true);
        jRadioButtonMenuItem28.setText("Nuevo                        F4");
        jMenuRegistros.add(jRadioButtonMenuItem28);

        jRadioButtonMenuItem29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem29.setSelected(true);
        jRadioButtonMenuItem29.setText("Modificar                   F5");
        jMenuRegistros.add(jRadioButtonMenuItem29);

        jRadioButtonMenuItem30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem30.setSelected(true);
        jRadioButtonMenuItem30.setText("Eliminar                      F6 ");
        jMenuRegistros.add(jRadioButtonMenuItem30);

        jRadioButtonMenuItem31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem31.setSelected(true);
        jRadioButtonMenuItem31.setText("Anular                         F7");
        jMenuRegistros.add(jRadioButtonMenuItem31);

        jRadioButtonMenuItem32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem32.setSelected(true);
        jRadioButtonMenuItem32.setText("Busqueda                    F2");
        jMenuRegistros.add(jRadioButtonMenuItem32);

        jRadioButtonMenuItem33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem33.setSelected(true);
        jRadioButtonMenuItem33.setText("Seleccionar");
        jMenuRegistros.add(jRadioButtonMenuItem33);

        jRadioButtonMenuItem34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem34.setSelected(true);
        jRadioButtonMenuItem34.setText("Consultar");
        jMenuRegistros.add(jRadioButtonMenuItem34);

        jRadioButtonMenuItem35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem35.setSelected(true);
        jRadioButtonMenuItem35.setText("Imprimir Registro");
        jMenuRegistros.add(jRadioButtonMenuItem35);

        jRadioButtonMenuItem36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem36.setSelected(true);
        jRadioButtonMenuItem36.setText("Marcar ");
        jMenuRegistros.add(jRadioButtonMenuItem36);

        jRadioButtonMenuItem37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem37.setSelected(true);
        jRadioButtonMenuItem37.setText("Marcar Todos");
        jMenuRegistros.add(jRadioButtonMenuItem37);

        jRadioButtonMenuItem38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem38.setSelected(true);
        jRadioButtonMenuItem38.setText("Desmarcar todos");
        jMenuRegistros.add(jRadioButtonMenuItem38);

        jRadioButtonMenuItem39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem39.setSelected(true);
        jRadioButtonMenuItem39.setText("Excel");
        jMenuRegistros.add(jRadioButtonMenuItem39);

        jRadioButtonMenuItem40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem40.setSelected(true);
        jRadioButtonMenuItem40.setText("Primero");
        jMenuRegistros.add(jRadioButtonMenuItem40);

        jRadioButtonMenuItem41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem41.setSelected(true);
        jRadioButtonMenuItem41.setText("Anterior");
        jMenuRegistros.add(jRadioButtonMenuItem41);

        jRadioButtonMenuItem42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem42.setSelected(true);
        jRadioButtonMenuItem42.setText("Siguiente");
        jMenuRegistros.add(jRadioButtonMenuItem42);

        jRadioButtonMenuItem43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem43.setSelected(true);
        jRadioButtonMenuItem43.setText("Ultimo");
        jMenuRegistros.add(jRadioButtonMenuItem43);

        Menu.add(jMenuRegistros);

        jMenuIngresos.setText("Ingresos");

        jMenu15.setText("Ingresos a");
        jMenuIngresos.add(jMenu15);

        jRadioButtonMenuItem46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem46.setSelected(true);
        jRadioButtonMenuItem46.setText("Ingresos");
        jMenuIngresos.add(jRadioButtonMenuItem46);

        jRadioButtonMenuItem47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem47.setSelected(true);
        jRadioButtonMenuItem47.setText("Guias Electronicas");
        jMenuIngresos.add(jRadioButtonMenuItem47);

        jRadioButtonMenuItem48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem48.setSelected(true);
        jRadioButtonMenuItem48.setText("Mantenimiento");
        jMenuIngresos.add(jRadioButtonMenuItem48);

        jRadioButtonMenuItem49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem49.setSelected(true);
        jRadioButtonMenuItem49.setText("Actualizar Tipo de Ingreso");
        jMenuIngresos.add(jRadioButtonMenuItem49);

        jRadioButtonMenuItem50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem50.setSelected(true);
        jRadioButtonMenuItem50.setText("Listado Ingresos Detallado");
        jMenuIngresos.add(jRadioButtonMenuItem50);

        Menu.add(jMenuIngresos);

        jMenuSalidas.setText("Salidas");

        jMenu16.setText("Salida de");

        jRadioButtonMenuItem54.setSelected(true);
        jRadioButtonMenuItem54.setText("jRadioButtonMenuItem54");
        jMenu16.add(jRadioButtonMenuItem54);

        jMenuSalidas.add(jMenu16);

        jRadioButtonMenuItem45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem45.setSelected(true);
        jRadioButtonMenuItem45.setText("Salidas");
        jMenuSalidas.add(jRadioButtonMenuItem45);

        jMenu17.setText("Ventas");

        jRadioButtonMenuItem55.setSelected(true);
        jRadioButtonMenuItem55.setText("jRadioButtonMenuItem55");
        jMenu17.add(jRadioButtonMenuItem55);

        jMenuSalidas.add(jMenu17);

        jRadioButtonMenuItem51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem51.setSelected(true);
        jRadioButtonMenuItem51.setText("Otros");
        jMenuSalidas.add(jRadioButtonMenuItem51);

        jRadioButtonMenuItem52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem52.setSelected(true);
        jRadioButtonMenuItem52.setText("Mantenimiento");
        jMenuSalidas.add(jRadioButtonMenuItem52);

        jRadioButtonMenuItem53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem53.setSelected(true);
        jRadioButtonMenuItem53.setText("Listado Salida Detallada");
        jMenuSalidas.add(jRadioButtonMenuItem53);

        Menu.add(jMenuSalidas);

        jMenuTransferencias.setText("Transferencias");

        jMenu18.setText("Transferencias");

        jRadioButtonMenuItem58.setSelected(true);
        jRadioButtonMenuItem58.setText("jRadioButtonMenuItem58");
        jMenu18.add(jRadioButtonMenuItem58);

        jMenuTransferencias.add(jMenu18);

        jRadioButtonMenuItem56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem56.setSelected(true);
        jRadioButtonMenuItem56.setText("Consulta");
        jMenuTransferencias.add(jRadioButtonMenuItem56);

        jRadioButtonMenuItem57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem57.setSelected(true);
        jRadioButtonMenuItem57.setText("Mantenimiento");
        jMenuTransferencias.add(jRadioButtonMenuItem57);

        Menu.add(jMenuTransferencias);

        jMenuRequerimientos.setText("Requerimientos");

        jRadioButtonMenuItem59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem59.setSelected(true);
        jRadioButtonMenuItem59.setText("Generar Orden de Muestra");
        jMenuRequerimientos.add(jRadioButtonMenuItem59);

        jRadioButtonMenuItem60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem60.setSelected(true);
        jRadioButtonMenuItem60.setText("Mantenimiento Orden de Muestra");
        jMenuRequerimientos.add(jRadioButtonMenuItem60);

        jRadioButtonMenuItem61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem61.setSelected(true);
        jRadioButtonMenuItem61.setText("Generar Orden de Produccion");
        jMenuRequerimientos.add(jRadioButtonMenuItem61);

        jRadioButtonMenuItem62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem62.setSelected(true);
        jRadioButtonMenuItem62.setText("Mantenimiento Orden de Produccion");
        jMenuRequerimientos.add(jRadioButtonMenuItem62);

        jMenu19.setText("Generar desde OP.");
        jMenuRequerimientos.add(jMenu19);

        jRadioButtonMenuItem63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem63.setSelected(true);
        jRadioButtonMenuItem63.setText("Generar orden de compra");
        jMenuRequerimientos.add(jRadioButtonMenuItem63);

        jRadioButtonMenuItem64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem64.setSelected(true);
        jRadioButtonMenuItem64.setText("Mantenimiento Orden de Compra");
        jMenuRequerimientos.add(jRadioButtonMenuItem64);

        jRadioButtonMenuItem65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem65.setSelected(true);
        jRadioButtonMenuItem65.setText("Requerimiento por stock minimo");
        jMenuRequerimientos.add(jRadioButtonMenuItem65);

        jRadioButtonMenuItem66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem66.setSelected(true);
        jRadioButtonMenuItem66.setText("Requerimiento por Reposicion");
        jMenuRequerimientos.add(jRadioButtonMenuItem66);

        jRadioButtonMenuItem67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem67.setSelected(true);
        jRadioButtonMenuItem67.setText("Aprobacion de RQ Compra (Usuario)");
        jMenuRequerimientos.add(jRadioButtonMenuItem67);

        jRadioButtonMenuItem68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem68.setSelected(true);
        jRadioButtonMenuItem68.setText("Aprobacion de RQ Compra (Jefatura)");
        jMenuRequerimientos.add(jRadioButtonMenuItem68);

        Menu.add(jMenuRequerimientos);

        jMenuGuiasElectronicas.setText("Guias Electronicas");

        jRadioButtonMenuItem69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem69.setSelected(true);
        jRadioButtonMenuItem69.setText("Generar Guias Electronicas");
        jMenuGuiasElectronicas.add(jRadioButtonMenuItem69);

        jRadioButtonMenuItem70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem70.setSelected(true);
        jRadioButtonMenuItem70.setText("Consultar Guias Electronicas");
        jMenuGuiasElectronicas.add(jRadioButtonMenuItem70);

        Menu.add(jMenuGuiasElectronicas);

        jMenuConsultas.setText("Consultas");

        jRadioButtonMenuItem80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem80.setSelected(true);
        jRadioButtonMenuItem80.setText("Kardex");
        jMenuConsultas.add(jRadioButtonMenuItem80);

        jRadioButtonMenuItem81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem81.setSelected(true);
        jRadioButtonMenuItem81.setText("Saldos");
        jMenuConsultas.add(jRadioButtonMenuItem81);

        jRadioButtonMenuItem82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem82.setSelected(true);
        jRadioButtonMenuItem82.setText("Ingresos");
        jMenuConsultas.add(jRadioButtonMenuItem82);

        jRadioButtonMenuItem83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem83.setSelected(true);
        jRadioButtonMenuItem83.setText("Salidas");
        jMenuConsultas.add(jRadioButtonMenuItem83);

        jMenu20.setText("Movimientos");
        jMenuConsultas.add(jMenu20);

        jRadioButtonMenuItem84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem84.setSelected(true);
        jRadioButtonMenuItem84.setText("Reporte x Antiguedad");
        jRadioButtonMenuItem84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem84ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jRadioButtonMenuItem84);

        jRadioButtonMenuItem85.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem85.setSelected(true);
        jRadioButtonMenuItem85.setText("Reporte x Antiguedad 6 Ultimos Ingresos");
        jMenuConsultas.add(jRadioButtonMenuItem85);

        jRadioButtonMenuItem86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem86.setSelected(true);
        jRadioButtonMenuItem86.setText("Reporte de Auditoria");
        jMenuConsultas.add(jRadioButtonMenuItem86);

        Menu.add(jMenuConsultas);

        jMenuProcesos.setText("Procesos");

        jRadioButtonMenuItem71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem71.setSelected(true);
        jRadioButtonMenuItem71.setText("Calcular Valorizacion");
        jMenuProcesos.add(jRadioButtonMenuItem71);

        jRadioButtonMenuItem72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem72.setSelected(true);
        jRadioButtonMenuItem72.setText("Consulta Kardex Valorizado");
        jMenuProcesos.add(jRadioButtonMenuItem72);

        jRadioButtonMenuItem73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem73.setSelected(true);
        jRadioButtonMenuItem73.setText("Kardex Anual");
        jMenuProcesos.add(jRadioButtonMenuItem73);

        jRadioButtonMenuItem74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem74.setSelected(true);
        jRadioButtonMenuItem74.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem74);

        jRadioButtonMenuItem75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem75.setSelected(true);
        jRadioButtonMenuItem75.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem75);

        jRadioButtonMenuItem76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem76.setSelected(true);
        jRadioButtonMenuItem76.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem76);

        jRadioButtonMenuItem77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem77.setSelected(true);
        jRadioButtonMenuItem77.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem77);

        jRadioButtonMenuItem78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem78.setSelected(true);
        jRadioButtonMenuItem78.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem78);

        jRadioButtonMenuItem79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMenuItem79.setSelected(true);
        jRadioButtonMenuItem79.setText("Generar Orden de Muestra");
        jMenuProcesos.add(jRadioButtonMenuItem79);

        Menu.add(jMenuProcesos);

        jMenuVentanas.setText("Ventanas");
        jMenuVentanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVentanasActionPerformed(evt);
            }
        });
        Menu.add(jMenuVentanas);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem84ActionPerformed

    private void jMenuVentanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVentanasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuVentanasActionPerformed

    private void jRadioButtonMenuItemAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemAlmacenesActionPerformed
        // TODO add your handling code here:
        InternalArchivoAlmacenes ventanaAlmacenes = new InternalArchivoAlmacenes();
        abrirVentana(ventanaAlmacenes, "Almacenes");
    }//GEN-LAST:event_jRadioButtonMenuItemAlmacenesActionPerformed

    private void jRadioButtonMenuItemLineasFamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemLineasFamiliasActionPerformed
        // TODO add your handling code here:
        InternalLineasFamilias ventanaLineaFamilia = new InternalLineasFamilias();
        abrirVentana(ventanaLineaFamilia, "Lineas Y Familias");
    }//GEN-LAST:event_jRadioButtonMenuItemLineasFamiliasActionPerformed

    private void jRadioButtonMenuItemTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemTipoProdActionPerformed
        // TODO add your handling code here:
        InternalTipoProduc ventanaTipoProduc = new InternalTipoProduc();
        abrirVentana(ventanaTipoProduc, "Tipo de productos");
    }//GEN-LAST:event_jRadioButtonMenuItemTipoProdActionPerformed

    private void jRadioButtonMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemProductosActionPerformed
        // TODO add your handling code here:
        InternalProductos ventanaProduc = new InternalProductos();
        abrirVentana(ventanaProduc, "Productos");
    }//GEN-LAST:event_jRadioButtonMenuItemProductosActionPerformed

    private void jRadioButtonMenuItemCierreMesValorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemCierreMesValorizacionActionPerformed
        // TODO add your handling code here:
        InternalCierreValorización ventanaCierre = new InternalCierreValorización();
        abrirVentana(ventanaCierre, "Cierre mes de valorización");
    }//GEN-LAST:event_jRadioButtonMenuItemCierreMesValorizacionActionPerformed

    private void jRadioButtonMenuItemMuestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemMuestrasActionPerformed
        // TODO add your handling code here:
        InternalMuestras ventanaMuestras = new InternalMuestras();
        abrirVentana(ventanaMuestras, "Muestras");
    }//GEN-LAST:event_jRadioButtonMenuItemMuestrasActionPerformed

    private void jRadioButtonMenuItemTipoServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemTipoServiciosActionPerformed
        // TODO add your handling code here:
        InternalTipoServicios ventanaTipoServ = new InternalTipoServicios();
        abrirVentana(ventanaTipoServ, "Tipo de Servicios");
    }//GEN-LAST:event_jRadioButtonMenuItemTipoServiciosActionPerformed

    private void jRadioButtonMenuItemTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemTecnicaActionPerformed
        // TODO add your handling code here:
        InternalTecnica ventanaTecnica = new InternalTecnica();
        abrirVentana(ventanaTecnica, "Tecnica");                                                                 
    }//GEN-LAST:event_jRadioButtonMenuItemTecnicaActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jRadioButtonMenuItemTransportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemTransportistasActionPerformed
        // TODO add your handling code here:
        InternalTransportista ventanaTransportista = new InternalTransportista();
        abrirVentana(ventanaTransportista, "Transportista");
    }//GEN-LAST:event_jRadioButtonMenuItemTransportistasActionPerformed

    private void jRadioButtonMenuItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemProveedoresActionPerformed
        // TODO add your handling code here:
        InternalProveedor ventanaProveedor = new InternalProveedor();
        abrirVentana(ventanaProveedor, "Proveedor");
    }//GEN-LAST:event_jRadioButtonMenuItemProveedoresActionPerformed

    private void jRadioButtonMenuItemMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemMaquinaActionPerformed
        // TODO add your handling code here:
        InternalMaquina ventanaMaquina = new InternalMaquina();
        abrirVentana(ventanaMaquina, "Maquina");
    }//GEN-LAST:event_jRadioButtonMenuItemMaquinaActionPerformed

    private void jRadioButtonMenuItemGalgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemGalgaActionPerformed
        // TODO add your handling code here:
        InternalGalga ventanaGalga = new InternalGalga();
        abrirVentana(ventanaGalga, "Galga");
    }//GEN-LAST:event_jRadioButtonMenuItemGalgaActionPerformed

    private void jRadioButtonMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemClientesActionPerformed
        // TODO add your handling code here:
        InternalCliente ventanaCliente = new InternalCliente();
        abrirVentana(ventanaCliente, "Cliente");
    }//GEN-LAST:event_jRadioButtonMenuItemClientesActionPerformed

    private void jRadioButtonMenuItemTipoCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemTipoCambioActionPerformed
        // TODO add your handling code here:
        InternalTipodeCambio ventanaTipodeCambio = new InternalTipodeCambio();
        abrirVentana(ventanaTipodeCambio, "TipodeCambio");
    }//GEN-LAST:event_jRadioButtonMenuItemTipoCambioActionPerformed

    private void jRadioButtonMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemUsuariosActionPerformed
        // TODO add your handling code here:
        InternalUsuarios ventanaUsuarios = new InternalUsuarios();
        abrirVentana(ventanaUsuarios, "Usuarios");
    }//GEN-LAST:event_jRadioButtonMenuItemUsuariosActionPerformed

    private void jRadioButtonMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem20ActionPerformed

    private void jRadioButtonMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem21ActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_jRadioButtonMenuItem21ActionPerformed

    private void jRadioButtonMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem22ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }
    
    private void abrirVentana(JInternalFrame nuevaVentana, String titulo) {
        for (JInternalFrame v : ventanasAbiertas) {
            if (v.getClass().equals(nuevaVentana.getClass())) {
                v.toFront();
                try { v.setSelected(true); } catch (Exception e) {}
                return;
            }
        }
        //Si alcanzo el maximo de ventanas abierta se cerrara la más antigua
        if (ventanasAbiertas.size() >= MAX_VENTANAS) {
            JInternalFrame ventanaMasAntigua = ventanasAbiertas.removeFirst();
            ventanaMasAntigua.dispose(); 
            jDesktopPanePantallas.remove(ventanaMasAntigua);
        }
        
        nuevaVentana.setTitle(titulo);
        nuevaVentana.setClosable(true);
        nuevaVentana.setMaximizable(true);
        nuevaVentana.setIconifiable(true);

        nuevaVentana.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                ventanasAbiertas.remove(nuevaVentana);
                actualizarMenuVentanas();
            }
        });
        
        ventanasAbiertas.add(nuevaVentana);
        jDesktopPanePantallas.add(nuevaVentana);
        nuevaVentana.setVisible(true);

        actualizarMenuVentanas();
    }

    private void actualizarMenuVentanas() {
        jMenuVentanas.removeAll(); // Aquí usamos tu variable

        for (JInternalFrame ventana : ventanasAbiertas) {
            JMenuItem item = new JMenuItem(ventana.getTitle());
            item.addActionListener(e -> {
                ventana.toFront();
                try { ventana.setSelected(true); } catch (Exception ex) {}
            });
            jMenuVentanas.add(item);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPanePantallas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenuArchiovos;
    private javax.swing.JMenu jMenuCaracteristicas;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuConsumos;
    private javax.swing.JMenu jMenuContabilidad;
    private javax.swing.JMenu jMenuGuiasElectronicas;
    private javax.swing.JMenu jMenuIngresos;
    private javax.swing.JMenu jMenuOtros;
    private javax.swing.JMenu jMenuProcesos;
    private javax.swing.JMenu jMenuRegistros;
    private javax.swing.JMenu jMenuRequerimientos;
    private javax.swing.JMenu jMenuSalidas;
    private javax.swing.JMenu jMenuTransferencias;
    private javax.swing.JMenu jMenuVentanas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem12;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem20;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem21;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem22;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem23;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem24;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem25;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem26;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem27;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem28;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem29;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem30;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem31;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem32;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem33;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem34;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem35;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem36;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem37;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem38;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem39;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem40;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem41;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem42;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem43;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem44;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem45;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem46;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem47;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem48;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem49;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem50;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem51;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem52;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem53;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem54;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem55;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem56;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem57;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem58;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem59;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem60;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem61;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem62;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem63;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem64;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem65;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem66;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem67;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem68;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem69;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem70;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem71;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem72;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem73;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem74;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem75;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem76;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem77;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem78;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem79;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem80;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem81;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem82;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem83;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem84;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem85;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem86;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemAlmacenes;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemCierreMesValorizacion;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemClientes;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemGalga;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemLineasFamilias;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMaquina;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMuestras;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemProductos;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemProveedores;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemTecnica;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemTipoCambio;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemTipoProd;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemTipoServicios;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemTransportistas;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemUsuarios;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
