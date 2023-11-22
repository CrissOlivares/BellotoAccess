
package com.bellotoaccess.vista;
import com.bellotoaccess.controlador.RegistroArrendatario;
import com.bellotoaccess.controlador.RegistroPropietario;
import com.bellotoaccess.controlador.RegistroUser;
import com.bellotoaccess.modelo.Arrendatario;
import com.bellotoaccess.modelo.BorradorDataBaseForTest;
import com.bellotoaccess.modelo.Propietario;
import com.bellotoaccess.modelo.Usuario;
import com.bellotoaccess.utils.Utils;
import com.bellotoaccess.vistaRegistro.RegistrarArrendatario;
import com.bellotoaccess.vistaRegistro.RegistrarPropietario;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Olivares
 */
public class MenuInicial extends javax.swing.JFrame {

    private BorradorDataBaseForTest db;
    //se agregar el icono de la app
    public MenuInicial(BorradorDataBaseForTest db) {
        initComponents();
        Utils.cambiarIconoFrame(this);
        this.db = db;
        initComponents();
    }
     Arrendatario ar=new Arrendatario();
    RegistroArrendatario r=new RegistroArrendatario();
    
     Propietario pr=new Propietario();
    RegistroPropietario rp=new RegistroPropietario();
    //constructor sin parametros
    
    public MenuInicial(){
        initComponents();
         Utils.cambiarIconoFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_ar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_pr = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbtn_cerrarSesion = new javax.swing.JButton();
        jbtn_irAnadirArren = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JLbl_IconoUsuario = new javax.swing.JLabel();
        JLbl_MenPrincipal = new javax.swing.JLabel();
        JLbl_MenPrincipal4 = new javax.swing.JLabel();
        JLbl_Icono = new javax.swing.JLabel();
        jbtn_irAnadirProp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BellotoAccess - Sistema administrativo de Condominios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 236, 228));

        jtable_ar.setBackground(new java.awt.Color(53, 91, 62));
        jtable_ar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jtable_ar.setForeground(new java.awt.Color(245, 236, 228));
        jtable_ar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ARREN.", "DEPTO", "RUN", "NOMBRE", "APELLIDO", "EMAIL", "TELEFONO"
            }
        ));
        jScrollPane2.setViewportView(jtable_ar);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/Act.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jtable_pr.setBackground(new java.awt.Color(53, 91, 62));
        jtable_pr.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jtable_pr.setForeground(new java.awt.Color(245, 236, 228));
        jtable_pr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID PRO", "DEPT OW", "RUN", "NOMBRE", "APELLIDO", "EMAIL", "TELEF"
            }
        ));
        jScrollPane3.setViewportView(jtable_pr);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/Act.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 890, 510));

        jbtn_cerrarSesion.setBackground(new java.awt.Color(255, 204, 204));
        jbtn_cerrarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_cerrarSesion.setForeground(new java.awt.Color(53, 91, 62));
        jbtn_cerrarSesion.setText("SALIR");
        jbtn_cerrarSesion.setBorder(null);
        jbtn_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_cerrarSesionMouseClicked(evt);
            }
        });
        jbtn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 25));

        jbtn_irAnadirArren.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_irAnadirArren.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_irAnadirArren.setForeground(new java.awt.Color(53, 91, 62));
        jbtn_irAnadirArren.setText("ARRENDATARIO");
        jbtn_irAnadirArren.setBorder(null);
        jbtn_irAnadirArren.setOpaque(true);
        jbtn_irAnadirArren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_irAnadirArrenActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_irAnadirArren, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 25));

        jPanel3.setBackground(new java.awt.Color(53, 91, 62));

        JLbl_IconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/logoUsuario.png"))); // NOI18N

        JLbl_MenPrincipal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JLbl_MenPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        JLbl_MenPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbl_MenPrincipal.setText("MENÚ PRINCIPAL");

        JLbl_MenPrincipal4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        JLbl_MenPrincipal4.setForeground(new java.awt.Color(255, 255, 255));
        JLbl_MenPrincipal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(JLbl_MenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(JLbl_IconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(844, Short.MAX_VALUE))
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
                .addComponent(JLbl_MenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JLbl_MenPrincipal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        JLbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/pirncipalg.png"))); // NOI18N
        jPanel2.add(JLbl_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, -1));

        jbtn_irAnadirProp.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_irAnadirProp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jbtn_irAnadirProp.setForeground(new java.awt.Color(53, 91, 62));
        jbtn_irAnadirProp.setText("PROPIETARIO");
        jbtn_irAnadirProp.setBorder(null);
        jbtn_irAnadirProp.setOpaque(true);
        jbtn_irAnadirProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_irAnadirPropActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_irAnadirProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bellotoaccess/imag/buscar.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

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

        setSize(new java.awt.Dimension(748, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_irAnadirArrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_irAnadirArrenActionPerformed
       RegistrarArrendatario rear=new RegistrarArrendatario();
        rear.setVisible(true);
        rear.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtn_irAnadirArrenActionPerformed

    private void jbtn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cerrarSesionActionPerformed
         System.exit(0);
       
    }//GEN-LAST:event_jbtn_cerrarSesionActionPerformed

    private void jbtn_cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_cerrarSesionMouseClicked
      
    }//GEN-LAST:event_jbtn_cerrarSesionMouseClicked

    private void jbtn_irAnadirPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_irAnadirPropActionPerformed
       RegistrarPropietario repo=new RegistrarPropietario();
        repo.setVisible(true);
        repo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtn_irAnadirPropActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        mostrarTabla();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       mostrarTablaR();
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private void mostrarTabla() {
        //defino variables para rescatar del objeto usuario
        int id,numdept,telef;
        String nombre, apellido,run,email;
        
        DefaultTableModel modelo=(DefaultTableModel) this.jtable_ar.getModel();
        //para que no se duplique la información
        modelo.setRowCount(0);
        ArrayList<Arrendatario> lista=r.ListaArrendatario();
        for (Arrendatario arrendatario : lista) {
            id=arrendatario.getId();
            numdept=arrendatario.getNumdept();
            run=arrendatario.getRun();
            nombre=arrendatario.getNombre();
            apellido=arrendatario.getApellido();
            email=arrendatario.getEmail();
            telef=arrendatario.getTelef();
            modelo.addRow(new Object[]{id,numdept,run,nombre,apellido,email,telef});
        }
    }
    private void mostrarTablaR() {
        //defino variables para rescatar del objeto usuario
        int id,deptowner,telef;
        String nombre, apellido,run,email;
        
        DefaultTableModel modelo=(DefaultTableModel) this.jtable_pr.getModel();
        //para que no se duplique la información
        modelo.setRowCount(0);
        ArrayList<Propietario> lista=rp.ListaPropietario();
        for (Propietario Propietario : lista) {
            id=Propietario.getId();
            deptowner=Propietario.getDeptowner();
            run=Propietario.getRun();
            nombre=Propietario.getNombre();
            apellido=Propietario.getApellido();
            email=Propietario.getEmail();
            telef=Propietario.getTelef();
            modelo.addRow(new Object[]{id,deptowner,run,nombre,apellido,email,telef});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLbl_Icono;
    private javax.swing.JLabel JLbl_IconoUsuario;
    private javax.swing.JLabel JLbl_MenPrincipal;
    private javax.swing.JLabel JLbl_MenPrincipal4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtn_cerrarSesion;
    private javax.swing.JButton jbtn_irAnadirArren;
    private javax.swing.JButton jbtn_irAnadirProp;
    private javax.swing.JTable jtable_ar;
    private javax.swing.JTable jtable_pr;
    // End of variables declaration//GEN-END:variables

//     private void mostrarTabla() {
//        //defino variables para rescatar del objeto usuario
//        int identificador;
//        String nombre, apellido, cargo;
//        
//        DefaultTableModel modelo=(DefaultTableModel) this.tblUsuarios.getModel();
//        //para que no se duplique la información
//        modelo.setRowCount(0);
//        ArrayList<Usuario> lista=r.listarUsuarios();
//        for (Usuario usuario : lista) {
//            identificador=usuario.getIdentificador();
//            nombre=usuario.getNombre();
//            apellido=usuario.getApellido();
//            cargo=usuario.getCargo();
//            modelo.addRow(new Object[]{identificador,nombre,apellido,cargo});
//        }
//    }

}
