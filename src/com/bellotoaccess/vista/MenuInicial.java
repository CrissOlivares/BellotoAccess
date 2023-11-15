
package com.bellotoaccess.vista;
import com.bellotoaccess.modelo.DataBase;
import com.bellotoaccess.utils.Utils;
import javax.swing.JButton;

/**
 *
 * @author Cristian Olivares
 */
public class MenuInicial extends javax.swing.JFrame {

    private DataBase db;
    //se agregar el icono de la app
    public MenuInicial(DataBase db) {
        initComponents();
        Utils.cambiarIconoFrame(this);
        
        this.db = db;
        initComponents();
    }
    //constructor sin parametros
    public MenuInicial(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTxt_runUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JBtn_Buscar = new javax.swing.JButton();
        JBtn_CerrarSesion = new javax.swing.JButton();
        JBtn_Anadir = new javax.swing.JButton();
        JBtn_Modificar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JLbl_IconoUsuario = new javax.swing.JLabel();
        JLbl_MenPrincipal = new javax.swing.JLabel();
        JLbl_MenPrincipal3 = new javax.swing.JLabel();
        JLbl_MenPrincipal4 = new javax.swing.JLabel();
        JLbl_Icono = new javax.swing.JLabel();
        JBtn_Eliminar_arren = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BellotoAccess - Sistema administrativo de Condominios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 236, 228));

        jTxt_runUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTxt_runUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jTxt_runUsuario.setForeground(new java.awt.Color(153, 153, 153));
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

        jLabel3.setForeground(new java.awt.Color(53, 91, 62));
        jLabel3.setText("BUSCAR POR:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxt_runUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_runUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 900, 510));

        JBtn_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        JBtn_Buscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JBtn_Buscar.setForeground(new java.awt.Color(53, 91, 62));
        JBtn_Buscar.setText("BUSCAR");
        JBtn_Buscar.setBorder(null);
        JBtn_Buscar.setOpaque(true);
        JBtn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtn_BuscarMouseClicked(evt);
            }
        });
        JBtn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(JBtn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 80, 140, 25));

        JBtn_CerrarSesion.setBackground(new java.awt.Color(255, 204, 204));
        JBtn_CerrarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JBtn_CerrarSesion.setForeground(new java.awt.Color(53, 91, 62));
        JBtn_CerrarSesion.setText("CERRAR SESIÓN");
        JBtn_CerrarSesion.setBorder(null);
        JBtn_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtn_CerrarSesionMouseClicked(evt);
            }
        });
        JBtn_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_CerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(JBtn_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 480, 140, 25));

        JBtn_Anadir.setBackground(new java.awt.Color(255, 255, 255));
        JBtn_Anadir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JBtn_Anadir.setForeground(new java.awt.Color(53, 91, 62));
        JBtn_Anadir.setText("AÑADIR");
        JBtn_Anadir.setBorder(null);
        JBtn_Anadir.setOpaque(true);
        JBtn_Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_AnadirActionPerformed(evt);
            }
        });
        jPanel2.add(JBtn_Anadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 120, 140, 25));

        JBtn_Modificar.setBackground(new java.awt.Color(255, 255, 255));
        JBtn_Modificar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JBtn_Modificar.setForeground(new java.awt.Color(53, 91, 62));
        JBtn_Modificar.setText("MODIFICAR");
        JBtn_Modificar.setBorder(null);
        JBtn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(JBtn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 160, 140, 25));

        jPanel3.setBackground(new java.awt.Color(53, 91, 62));

        JLbl_IconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/logoUsuario.png"))); // NOI18N

        JLbl_MenPrincipal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JLbl_MenPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        JLbl_MenPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbl_MenPrincipal.setLabelFor(JBtn_Buscar);
        JLbl_MenPrincipal.setText("MENÚ PRINCIPAL");

        JLbl_MenPrincipal3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JLbl_MenPrincipal3.setForeground(new java.awt.Color(255, 255, 255));
        JLbl_MenPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbl_MenPrincipal3.setLabelFor(JBtn_Buscar);
        JLbl_MenPrincipal3.setText("TEXTOEJEMPLO");

        JLbl_MenPrincipal4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JLbl_MenPrincipal4.setForeground(new java.awt.Color(255, 255, 255));
        JLbl_MenPrincipal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbl_MenPrincipal4.setLabelFor(JBtn_Buscar);
        JLbl_MenPrincipal4.setText("USUARIO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(JLbl_MenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(JLbl_MenPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(JLbl_IconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(JLbl_MenPrincipal4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(732, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLbl_IconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLbl_MenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLbl_MenPrincipal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JLbl_MenPrincipal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        JLbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/pirncipalg.png"))); // NOI18N
        jPanel2.add(JLbl_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 160, -1));

        JBtn_Eliminar_arren.setBackground(new java.awt.Color(255, 255, 255));
        JBtn_Eliminar_arren.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JBtn_Eliminar_arren.setForeground(new java.awt.Color(53, 91, 62));
        JBtn_Eliminar_arren.setText("ELIMINAR");
        JBtn_Eliminar_arren.setBorder(null);
        JBtn_Eliminar_arren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_Eliminar_arrenActionPerformed(evt);
            }
        });
        jPanel2.add(JBtn_Eliminar_arren, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 250, 140, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1064, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBtn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtn_ModificarActionPerformed

    private void JBtn_AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_AnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtn_AnadirActionPerformed

    private void JBtn_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_CerrarSesionActionPerformed
        
       
    }//GEN-LAST:event_JBtn_CerrarSesionActionPerformed

    private void jTxt_runUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioKeyPressed

    }//GEN-LAST:event_jTxt_runUsuarioKeyPressed

    private void jTxt_runUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioActionPerformed

    }//GEN-LAST:event_jTxt_runUsuarioActionPerformed

    private void JBtn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_BuscarActionPerformed

    }//GEN-LAST:event_JBtn_BuscarActionPerformed

    private void JBtn_Eliminar_arrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_Eliminar_arrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtn_Eliminar_arrenActionPerformed

    private void JBtn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtn_BuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtn_BuscarMouseClicked

    private void JBtn_CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtn_CerrarSesionMouseClicked
      
    }//GEN-LAST:event_JBtn_CerrarSesionMouseClicked

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
//            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuInicial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn_Anadir;
    private javax.swing.JButton JBtn_Buscar;
    private javax.swing.JButton JBtn_CerrarSesion;
    private javax.swing.JButton JBtn_Eliminar_arren;
    private javax.swing.JButton JBtn_Modificar;
    private javax.swing.JLabel JLbl_Icono;
    private javax.swing.JLabel JLbl_IconoUsuario;
    private javax.swing.JLabel JLbl_MenPrincipal;
    private javax.swing.JLabel JLbl_MenPrincipal3;
    private javax.swing.JLabel JLbl_MenPrincipal4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxt_runUsuario;
    // End of variables declaration//GEN-END:variables
}
