
package com.bellotoaccess.vista;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.controlador.LoginDriver;
import com.bellotoaccess.modelo.BorradorDataBaseForTest;
import com.bellotoaccess.utils.Utils;
import com.bellotoaccess.vistaRegistro.RegistrarArrendatario;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */
public class Login extends javax.swing.JFrame {

    private BorradorDataBaseForTest db;
    //Constructor de interfaz LOGIN
    public Login() {
        initComponents();
        Utils.cambiarIconoFrame(this);
        
        this.db = new BorradorDataBaseForTest();
        db.getUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3_textoContrasena = new javax.swing.JLabel();
        jTxt_runUsuario = new javax.swing.JTextField();
        jButton1_ingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtn_registroUs = new javax.swing.JButton();
        jPasswordField2_contrasena = new javax.swing.JPasswordField();
        jLabel5_textorunUsuario = new javax.swing.JLabel();
        JBtn_conect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BellotoAccess - Sistema administrativo de Condominios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 219, 196));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/B.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 91, 62));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sistema Administrativo de Condominios");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(53, 91, 62));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BELLOTO ACCESS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(74, 74, 74))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 610, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3_textoContrasena.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3_textoContrasena.setForeground(new java.awt.Color(53, 91, 62));
        jLabel3_textoContrasena.setText("Contraseña:");

        jTxt_runUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTxt_runUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jTxt_runUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTxt_runUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_runUsuarioActionPerformed(evt);
            }
        });
        jTxt_runUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxt_runUsuarioKeyPressed(evt);
            }
        });

        jButton1_ingresar.setBackground(new java.awt.Color(2, 150, 100));
        jButton1_ingresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_ingresar.setText("INGRESAR");
        jButton1_ingresar.setBorder(null);
        jButton1_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ingresarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 91, 62));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¡Bienvenido!");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(53, 91, 62));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Inicia sesión con tus credenciales");

        jbtn_registroUs.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_registroUs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_registroUs.setForeground(new java.awt.Color(2, 150, 100));
        jbtn_registroUs.setText("REGISTRARSE");
        jbtn_registroUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registroUsActionPerformed(evt);
            }
        });

        jPasswordField2_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2_contrasenaActionPerformed(evt);
            }
        });
        jPasswordField2_contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2_contrasenaKeyPressed(evt);
            }
        });

        jLabel5_textorunUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5_textorunUsuario.setForeground(new java.awt.Color(53, 91, 62));
        jLabel5_textorunUsuario.setText("Run usuario:");

        JBtn_conect.setBackground(new java.awt.Color(255, 255, 255));
        JBtn_conect.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 8)); // NOI18N
        JBtn_conect.setForeground(new java.awt.Color(2, 150, 100));
        JBtn_conect.setText("TEST CONECT.");
        JBtn_conect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_conectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5_textorunUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn_registroUs, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3_textoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxt_runUsuario)
                        .addComponent(jPasswordField2_contrasena))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(JBtn_conect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JBtn_conect))
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(56, 56, 56)
                .addComponent(jLabel5_textorunUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_runUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3_textoContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_registroUs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        setSize(new java.awt.Dimension(1064, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_runUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioActionPerformed
      
        
    }//GEN-LAST:event_jTxt_runUsuarioActionPerformed

    private void jButton1_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ingresarActionPerformed
        String password = String.valueOf(jPasswordField2_contrasena.getPassword());
        if (jTxt_runUsuario.getText().isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales.", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
        } else { LoginDriver ld = new LoginDriver(db);
        ld.redirigirLogin(this, db, ld.validaLoginArray(Utils.obtenerInput(jTxt_runUsuario), (Utils.obtenerPassword(jPasswordField2_contrasena)), db));
        }
       
  
    }//GEN-LAST:event_jButton1_ingresarActionPerformed

    private void jbtn_registroUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registroUsActionPerformed
        RegistrarUsuario regus=new RegistrarUsuario();
        regus.setVisible(true);
        regus.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jbtn_registroUsActionPerformed

    private void jPasswordField2_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2_contrasenaActionPerformed
       
    }//GEN-LAST:event_jPasswordField2_contrasenaActionPerformed

    private void jTxt_runUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioKeyPressed
        //hace que al dar enter se simule un click
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButton1_ingresar.doClick();
        }    
    }//GEN-LAST:event_jTxt_runUsuarioKeyPressed

    private void jPasswordField2_contrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2_contrasenaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButton1_ingresar.doClick();
        } 
    }//GEN-LAST:event_jPasswordField2_contrasenaKeyPressed

    private void JBtn_conectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_conectActionPerformed
        //Probar conexion 
        try{
            Conexion con=new Conexion();
            Connection cnx=con.obtenerConexion();
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_JBtn_conectActionPerformed
    //Metodos Customizados

    
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn_conect;
    private javax.swing.JButton jButton1_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3_textoContrasena;
    private javax.swing.JLabel jLabel5_textorunUsuario;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2_contrasena;
    private javax.swing.JTextField jTxt_runUsuario;
    private javax.swing.JButton jbtn_registroUs;
    // End of variables declaration//GEN-END:variables
}
