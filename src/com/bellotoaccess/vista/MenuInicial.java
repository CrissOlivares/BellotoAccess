
package com.bellotoaccess.vista;
import com.bellotoaccess.modelo.DataBase;
import com.bellotoaccess.utils.Utils;

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
        jButton1_ingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTxt_runUsuario = new javax.swing.JTextField();
        jButton1_ingresar1 = new javax.swing.JButton();
        jButton1_ingresar2 = new javax.swing.JButton();
        jButton1_ingresar3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BellotoAccess - Sistema administrativo de Condominios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_ingresar.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_ingresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1_ingresar.setForeground(new java.awt.Color(53, 91, 62));
        jButton1_ingresar.setText("BUSCAR");
        jButton1_ingresar.setBorder(null);
        jButton1_ingresar.setOpaque(true);
        jButton1_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ingresarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 147, 25));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 91, 62));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 49, -1, -1));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(628, Short.MAX_VALUE)
                .addComponent(jTxt_runUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTxt_runUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 900, 510));

        jButton1_ingresar1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_ingresar1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1_ingresar1.setForeground(new java.awt.Color(53, 91, 62));
        jButton1_ingresar1.setText("ELIMINAR");
        jButton1_ingresar1.setBorder(null);
        jButton1_ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ingresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 147, 25));

        jButton1_ingresar2.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_ingresar2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1_ingresar2.setForeground(new java.awt.Color(53, 91, 62));
        jButton1_ingresar2.setText("AÑADIR");
        jButton1_ingresar2.setBorder(null);
        jButton1_ingresar2.setOpaque(true);
        jButton1_ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ingresar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_ingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 147, 25));

        jButton1_ingresar3.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_ingresar3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1_ingresar3.setForeground(new java.awt.Color(53, 91, 62));
        jButton1_ingresar3.setText("MODIFICAR");
        jButton1_ingresar3.setBorder(null);
        jButton1_ingresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ingresar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_ingresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 147, 25));

        jPanel3.setBackground(new java.awt.Color(53, 91, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/logoUsuario.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Menu principal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 841, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/pirncipalg.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

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

    private void jTxt_runUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioActionPerformed

    }//GEN-LAST:event_jTxt_runUsuarioActionPerformed

    private void jTxt_runUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_runUsuarioKeyPressed
        
    }//GEN-LAST:event_jTxt_runUsuarioKeyPressed

    private void jButton1_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ingresarActionPerformed
        

    }//GEN-LAST:event_jButton1_ingresarActionPerformed

    private void jButton1_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ingresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_ingresar1ActionPerformed

    private void jButton1_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ingresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_ingresar2ActionPerformed

    private void jButton1_ingresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ingresar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_ingresar3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_ingresar;
    private javax.swing.JButton jButton1_ingresar1;
    private javax.swing.JButton jButton1_ingresar2;
    private javax.swing.JButton jButton1_ingresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxt_runUsuario;
    // End of variables declaration//GEN-END:variables
}
