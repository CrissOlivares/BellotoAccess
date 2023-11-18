/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bellotoaccess.vistaRegistro;

/**
 *
 * @author coh_o
 */
public class RegistrarPropietario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPersona
     */
    public RegistrarPropietario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLbl_Icono = new javax.swing.JLabel();
        jtxt_propRun = new javax.swing.JTextField();
        jtxt_propNombre = new javax.swing.JTextField();
        jtxt_propApellido = new javax.swing.JTextField();
        jtxt_propEmail = new javax.swing.JTextField();
        jtxt_propTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtn_limpiarProp = new javax.swing.JButton();
        jbtn_anadirProp = new javax.swing.JButton();
        jtxtfecha = new javax.swing.JLabel();
        jtxt_propFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 236, 228));

        JLbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/pirncipalg.png"))); // NOI18N

        jtxt_propRun.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propRun.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propRun.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propRunActionPerformed(evt);
            }
        });
        jtxt_propRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propRunKeyPressed(evt);
            }
        });

        jtxt_propNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propNombre.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propNombreActionPerformed(evt);
            }
        });
        jtxt_propNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propNombreKeyPressed(evt);
            }
        });

        jtxt_propApellido.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propApellido.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propApellido.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propApellidoActionPerformed(evt);
            }
        });
        jtxt_propApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propApellidoKeyPressed(evt);
            }
        });

        jtxt_propEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propEmail.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propEmailActionPerformed(evt);
            }
        });
        jtxt_propEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propEmailKeyPressed(evt);
            }
        });

        jtxt_propTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propTelefono.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propTelefono.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propTelefonoActionPerformed(evt);
            }
        });
        jtxt_propTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propTelefonoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 91, 62));
        jLabel4.setText("RUN");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 91, 62));
        jLabel5.setText("NOMBRE");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 91, 62));
        jLabel6.setText("APELLIDO");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 91, 62));
        jLabel7.setText("EMAIL");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(53, 91, 62));
        jLabel8.setText("TELÉFONO");

        jbtn_limpiarProp.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_limpiarProp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_limpiarProp.setForeground(new java.awt.Color(53, 91, 62));
        jbtn_limpiarProp.setText("LIMPIAR");
        jbtn_limpiarProp.setBorder(null);
        jbtn_limpiarProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarPropActionPerformed(evt);
            }
        });

        jbtn_anadirProp.setBackground(new java.awt.Color(53, 91, 62));
        jbtn_anadirProp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_anadirProp.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_anadirProp.setText("AÑADIR");
        jbtn_anadirProp.setBorder(null);
        jbtn_anadirProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anadirPropActionPerformed(evt);
            }
        });

        jtxtfecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jtxtfecha.setForeground(new java.awt.Color(53, 91, 62));
        jtxtfecha.setText("FECHA");

        jtxt_propFecha.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_propFecha.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jtxt_propFecha.setForeground(new java.awt.Color(153, 153, 153));
        jtxt_propFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_propFechaActionPerformed(evt);
            }
        });
        jtxt_propFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_propFechaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtn_limpiarProp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_anadirProp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134)
                        .addComponent(JLbl_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(jtxt_propRun, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxt_propNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_propApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_propEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jtxtfecha)))
                                        .addGap(46, 46, 46)
                                        .addComponent(jtxt_propTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtxt_propFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(611, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_propRun, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxt_propNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_propApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_propEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_propTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_propFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_anadirProp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_limpiarProp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(JLbl_Icono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1060, 510));

        jPanel3.setBackground(new java.awt.Color(53, 91, 62));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AÑADIR PROPIETARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_propRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propRunActionPerformed

    private void jtxt_propRunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propRunKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propRunKeyPressed

    private void jtxt_propNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propNombreActionPerformed

    private void jtxt_propNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propNombreKeyPressed

    private void jtxt_propApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propApellidoActionPerformed

    private void jtxt_propApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propApellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propApellidoKeyPressed

    private void jtxt_propEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propEmailActionPerformed

    private void jtxt_propEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propEmailKeyPressed

    private void jtxt_propTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propTelefonoActionPerformed

    private void jtxt_propTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propTelefonoKeyPressed

    private void jbtn_limpiarPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_limpiarPropActionPerformed

    private void jbtn_anadirPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anadirPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_anadirPropActionPerformed

    private void jtxt_propFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_propFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propFechaActionPerformed

    private void jtxt_propFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_propFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_propFechaKeyPressed

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
            java.util.logging.Logger.getLogger(RegistrarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPropietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLbl_Icono;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtn_anadirProp;
    private javax.swing.JButton jbtn_limpiarProp;
    private javax.swing.JTextField jtxt_propApellido;
    private javax.swing.JTextField jtxt_propEmail;
    private javax.swing.JTextField jtxt_propFecha;
    private javax.swing.JTextField jtxt_propNombre;
    private javax.swing.JTextField jtxt_propRun;
    private javax.swing.JTextField jtxt_propTelefono;
    private javax.swing.JLabel jtxtfecha;
    // End of variables declaration//GEN-END:variables
}