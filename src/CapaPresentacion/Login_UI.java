/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Usuario;
import CapaNegocio.UsuarioBD;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 51930
 */
public class Login_UI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_UI() {
        initComponents();
        setLocationRelativeTo(null);

    }

//     public void validarAcceso() {
//
//        if (txtDni.getText().length() > 0) {
//
//            if (txtClave.getText().length() > 0) {
//
//                String dni = txtDni.getText();
//                String clave = txtClave.getText();
//                UsuarioBD objUsuarioBD = new UsuarioBD();
//                List<Usuario> listaUsuario = objUsuarioBD.login(dni, clave);
//
//                if (listaUsuario.size() > 0) {
//
//                    String nombre = listaUsuario.get(0).getuNombre();
//                    String apellidos = listaUsuario.get(0).getuApellidos();
//                    String tipo = listaUsuario.get(0).getuTipo();
//
//                    if (tipo.equals("ADMINISTRADOR")) {
//
//                        Menu_UI menu = new Menu_UI();
//                        menu.setTitle("CONECTADO:" + nombre + " " + apellidos);
//                        menu.setVisible(true);
//                        this.setVisible(false);
//
//                    } else if (tipo.equals("VENDEDOR")) {
//
//                        Menu_UI menu = new Menu_UI();
//                        menu.setTitle("CONECTADO:" + nombre + " " + apellidos);
//                        menu.setVisible(true);
//                        this.setVisible(false);
//
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "No perteneces al sistema ");
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(null, "ingrese Clave");
//                txtClave.requestFocus();
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "ingrese dni");
//            txtDni.requestFocus();
//        }
//    }
    
    public void ingresar() {
        if (txtDni.getText().length() > 0) {

            if (txtClave.getText().length() > 0) {

                String dni = txtDni.getText().toString();
                String clave = txtClave.getText().toString();

                UsuarioBD objusuarioBD = new UsuarioBD();
                List<Usuario> listaUsuario = objusuarioBD.login(dni, clave);

                if (listaUsuario.size() > 0) {

                    String tipo = listaUsuario.get(0).getuTipo();
                    String nombre = listaUsuario.get(0).getuNombre();
                    String apellidos = listaUsuario.get(0).getuApellidos();

                    Menu_UI menu = new Menu_UI(dni);
                    if (tipo.equals("ADMINISTRADOR")) {

                        menu.setVisible(true);
                        menu.setTitle("TU EMPRESA-CONECTADO:" + apellidos + " " + nombre);

                    } else if (tipo.equals("VENDEDOR")) {
                        menu.setVisible(true);
                        menu.setTitle("TU EMPRESA-CONECTADO:" + apellidos + " " + nombre);
                        menu.menu_mantenimiento.setEnabled(false);
                        menu.btnProductos.setEnabled(false);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "No perteneces al sistema 😡");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Ingrese Clave");
                    txtClave.requestFocus();
                }

            } else {

                JOptionPane.showMessageDialog(null, "Ingrese Dni");
                txtDni.requestFocus();
            }

        }
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("PERSONAL AUTORIZADO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("CLAVE");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/USUARIOS_96PX.png"))); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/LLAVE.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacion/Imagenes/DELETE_CERRAR_1.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtClave)
                    .addComponent(txtDni))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnIngresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(428, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    ingresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
