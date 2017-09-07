/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author sistems
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        
        
        
        this.setUndecorated(true);
        //inicializar componentes
        initComponents();
        this.setLocationRelativeTo(null); //centrar formulario
        //redondear bordes
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
        
        
        ImageIcon fot = new ImageIcon("src/imagenes/logoTn.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(icoConfi2.getWidth(), icoConfi2.getHeight(), Image.SCALE_DEFAULT));
        icoConfi2.setIcon(icono);
        this.repaint();
        
      





        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        icoConfi8 = new javax.swing.JLabel();
        icoConfi7 = new javax.swing.JLabel();
        icoConfi4 = new javax.swing.JLabel();
        icoConfi1 = new javax.swing.JLabel();
        icoConfi3 = new javax.swing.JLabel();
        icoConfi6 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JButton();
        btnModulos = new javax.swing.JButton();
        icoConfi5 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        icoConfi2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInicio = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        RdId = new javax.swing.JRadioButton();
        RdProducto = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("( USUARIO )");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        btnMinimizar.setBackground(new java.awt.Color(255, 102, 0));
        btnMinimizar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 102, 0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setVerifyInputWhenFocusTarget(false);
        btnMinimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        btnCerrar.setBackground(new java.awt.Color(255, 102, 0));
        btnCerrar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 102, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 35));

        jPanel3.setBackground(new java.awt.Color(248, 249, 249));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprar.setBackground(new java.awt.Color(255, 102, 0));
        btnComprar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(51, 153, 255));
        btnComprar.setText("Comprar");
        btnComprar.setBorder(null);
        btnComprar.setContentAreaFilled(false);
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setVerifyInputWhenFocusTarget(false);
        btnComprar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 80));

        btnVender.setBackground(new java.awt.Color(255, 102, 0));
        btnVender.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnVender.setForeground(new java.awt.Color(51, 153, 255));
        btnVender.setText("Vender");
        btnVender.setBorder(null);
        btnVender.setContentAreaFilled(false);
        btnVender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVender.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jPanel3.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 80));

        btnStock.setBackground(new java.awt.Color(255, 102, 0));
        btnStock.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnStock.setForeground(new java.awt.Color(51, 153, 255));
        btnStock.setText("Stock");
        btnStock.setBorder(null);
        btnStock.setContentAreaFilled(false);
        btnStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStock.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        jPanel3.add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 100, 80));

        btnEditarPerfil.setBackground(new java.awt.Color(255, 102, 0));
        btnEditarPerfil.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnEditarPerfil.setForeground(new java.awt.Color(51, 153, 255));
        btnEditarPerfil.setText("Editar perfil");
        btnEditarPerfil.setBorder(null);
        btnEditarPerfil.setContentAreaFilled(false);
        btnEditarPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarPerfil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 110, 70));

        icoConfi8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        icoConfi8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprar50.png"))); // NOI18N
        jPanel3.add(icoConfi8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 50));

        icoConfi7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender50.png"))); // NOI18N
        jPanel3.add(icoConfi7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 50));

        icoConfi4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stock50.png"))); // NOI18N
        jPanel3.add(icoConfi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 50, 50));

        icoConfi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte50.png"))); // NOI18N
        jPanel3.add(icoConfi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

        icoConfi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajuste50.png"))); // NOI18N
        jPanel3.add(icoConfi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, 50));

        icoConfi6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BACKUP64.png"))); // NOI18N
        jPanel3.add(icoConfi6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 80, 50));

        btnBackup.setBackground(new java.awt.Color(255, 102, 0));
        btnBackup.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnBackup.setForeground(new java.awt.Color(51, 153, 255));
        btnBackup.setText("Backup");
        btnBackup.setBorder(null);
        btnBackup.setContentAreaFilled(false);
        btnBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBackup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });
        jPanel3.add(btnBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 90, 80));

        btnModulos.setBackground(new java.awt.Color(255, 102, 0));
        btnModulos.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnModulos.setForeground(new java.awt.Color(51, 153, 255));
        btnModulos.setText("Modulos");
        btnModulos.setBorder(null);
        btnModulos.setContentAreaFilled(false);
        btnModulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModulos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 100, 80));

        icoConfi5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/material-de-oficina.png"))); // NOI18N
        jPanel3.add(icoConfi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, 60));

        btnReporte.setBackground(new java.awt.Color(255, 102, 0));
        btnReporte.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(51, 153, 255));
        btnReporte.setText("Reporte");
        btnReporte.setBorder(null);
        btnReporte.setContentAreaFilled(false);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel3.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 90, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, 90));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derechos-de-autor (1).png"))); // NOI18N
        jLabel4.setText("COPYRIGHT 2017");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 160, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, 1060, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icoConfi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoTn.png"))); // NOI18N
        jPanel5.add(icoConfi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 150));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("VERSIÓN 1.0");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 90, 30));

        jLabel10.setBackground(new java.awt.Color(255, 102, 0));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("TRONOS INVENTORY SYSTEM");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 250, 380));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("( USUARIO )");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("( USUARIO )");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        TableInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableInicio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 720, 170));

        jLabel6.setBackground(new java.awt.Color(255, 102, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("EXISTENCIA BAJA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1060, 4));

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 102, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/binoculares.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 30, 20));

        RdId.setBackground(new java.awt.Color(255, 255, 255));
        RdId.setText("ID");
        jPanel1.add(RdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        RdProducto.setBackground(new java.awt.Color(255, 255, 255));
        RdProducto.setSelected(true);
        RdProducto.setText("Producto");
        jPanel1.add(RdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 180, 20));

        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, 10));

        jButton10.setBackground(new java.awt.Color(255, 102, 0));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 102, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda24.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerifyInputWhenFocusTarget(false);
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 30, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 255, 0));
        btnBuscar.setForeground(new java.awt.Color(0, 51, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        // TODO add your handling code here:
               frmEditarPerfil verformulario =new frmEditarPerfil(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario.setVisible(true); 
         this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        
            frmCompra verformulario =new frmCompra(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario.setVisible(true); 
          this.setVisible(false);//oculta el jFrame que estes usando
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulosActionPerformed
        // TODO add your handling code here:
                         //línea 1-instanciamos un objeto de la clase Formulario2.java
         frmModulos verformulario2 =new frmModulos(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
        //  this.setVisible(false);//oculta el jFrame que estes usando
         this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnModulosActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        
                frmInventario verformulario2 =new frmInventario(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
        //  this.setVisible(false);//oculta el jFrame que estes usando
         this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        
                                 //línea 1-instanciamos un objeto de la clase Formulario2.java
       
         frmReporteGeneral ir = new frmReporteGeneral();
         //línea 2-hacemos visible el formulario que queremos llamar 
     
         ir.setVisible(true);
        //  this.setVisible(false);//oculta el jFrame que estes usando
         this.setVisible(false);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        
         frmVenta verformulario =new frmVenta(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario.setVisible(true); 
          this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        
    

        this.setVisible(false);//oculta el jFrame que estes usando
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        // TODO add your handling code here:
        
         frmBackUp verformulario =new frmBackUp(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario.setVisible(true); 
          
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

       
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdId;
    private javax.swing.JRadioButton RdProducto;
    private javax.swing.JTable TableInicio;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnModulos;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icoConfi1;
    private javax.swing.JLabel icoConfi2;
    private javax.swing.JLabel icoConfi3;
    private javax.swing.JLabel icoConfi4;
    private javax.swing.JLabel icoConfi5;
    private javax.swing.JLabel icoConfi6;
    private javax.swing.JLabel icoConfi7;
    private javax.swing.JLabel icoConfi8;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}