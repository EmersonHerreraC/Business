/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import java.awt.Dimension;

/**
 *
 * @author 51930
 */
public class Menu_UI extends javax.swing.JFrame {

    String dni_global;

    public Menu_UI() {
        initComponents();
    }

    public Menu_UI(String dni) {
        initComponents();
        dni_global = dni;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        btnProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_mantenimiento = new javax.swing.JMenu();
        menu_item_Categoria = new javax.swing.JMenuItem();
        menu_item_Marca = new javax.swing.JMenuItem();
        menu_item_Producto = new javax.swing.JMenuItem();
        menu_item_Correlativo = new javax.swing.JMenuItem();
        menu_item_Cliente = new javax.swing.JMenuItem();
        menu_item_Usuario = new javax.swing.JMenuItem();
        menu_ventas = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menu_reportes = new javax.swing.JMenu();
        menu_item_ReporteVentas = new javax.swing.JMenuItem();
        menu_item_reporteProductos = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jToolBar1.setRollover(true);

        btnProductos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/caja_1.png"))); // NOI18N
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);
        jToolBar1.add(jSeparator1);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/carrito.png"))); // NOI18N
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        menu_mantenimiento.setText("MATENIMIENTO");

        menu_item_Categoria.setText("Categoria");
        menu_item_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_CategoriaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_Categoria);

        menu_item_Marca.setText("Marca");
        menu_item_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_MarcaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_Marca);

        menu_item_Producto.setText("Producto");
        menu_mantenimiento.add(menu_item_Producto);

        menu_item_Correlativo.setText("Correlativo");
        menu_mantenimiento.add(menu_item_Correlativo);

        menu_item_Cliente.setText("Cliente");
        menu_mantenimiento.add(menu_item_Cliente);

        menu_item_Usuario.setText("Usuarios");
        menu_item_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_UsuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_Usuario);

        jMenuBar1.add(menu_mantenimiento);

        menu_ventas.setText("VENTAS");

        jMenuItem9.setText("Realizar Venta");
        menu_ventas.add(jMenuItem9);

        jMenuItem10.setText("Anular Venta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menu_ventas.add(jMenuItem10);

        jMenuBar1.add(menu_ventas);

        menu_reportes.setText("REPORTES");

        menu_item_ReporteVentas.setText("Reporte de Ventas");
        menu_reportes.add(menu_item_ReporteVentas);

        menu_item_reporteProductos.setText("Reporte de Productos");
        menu_reportes.add(menu_item_reporteProductos);

        jMenuBar1.add(menu_reportes);

        menu_salir.setText("SALIR");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/cross.png"))); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menu_salir.add(jMenuItem11);

        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        setBounds(0, 0, 825, 516);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Login_UI frmae = new Login_UI();
        frmae.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void menu_item_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_UsuarioActionPerformed
        Usuario_UI frame = new Usuario_UI();
        escritorio.add(frame);
        Dimension desktopane = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopane.width - FrameSize.width) / 2, (desktopane.height) / 100);
        frame.show();
    }//GEN-LAST:event_menu_item_UsuarioActionPerformed

    private void menu_item_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_MarcaActionPerformed
        Marca_UI frame = new Marca_UI();
        escritorio.add(frame);
        Dimension desktopane = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopane.width - FrameSize.width) / 2, (desktopane.height) / 100);
        frame.show();
    }//GEN-LAST:event_menu_item_MarcaActionPerformed

    private void menu_item_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_CategoriaActionPerformed
        Categoria_UI frame = new Categoria_UI();
        escritorio.add(frame);
        Dimension desktopane = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopane.width - FrameSize.width) / 2, (desktopane.height) / 100);
        frame.show();
    }//GEN-LAST:event_menu_item_CategoriaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnVentas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menu_item_Categoria;
    private javax.swing.JMenuItem menu_item_Cliente;
    private javax.swing.JMenuItem menu_item_Correlativo;
    private javax.swing.JMenuItem menu_item_Marca;
    private javax.swing.JMenuItem menu_item_Producto;
    private javax.swing.JMenuItem menu_item_ReporteVentas;
    private javax.swing.JMenuItem menu_item_Usuario;
    private javax.swing.JMenuItem menu_item_reporteProductos;
    public javax.swing.JMenu menu_mantenimiento;
    public javax.swing.JMenu menu_reportes;
    private javax.swing.JMenu menu_salir;
    public javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
