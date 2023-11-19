
package com.bellotoaccess.utils;

import com.bellotoaccess.modelo.BorradorDataBaseForTest;
import com.bellotoaccess.vista.Login;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */
public class Utils {
    //metodo que genera el icono en el launcher de java
    private static final String RUTA_CAMINO_FRAME = "/com/bellotoaccess/imag/B.png";
        public static void cambiarIconoFrame (JFrame frame){
            try {
                ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA_CAMINO_FRAME));
                frame.setIconImage(icono.getImage());
            } catch (Exception e) {
           ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage()); }
        }
        
        //inputs login
    public static String obtenerInput(JTextField campo){
        return campo.getText();//getText es para run email etc
    }
    public static String obtenerPassword (JPasswordField campo){
        return String.valueOf(campo.getPassword());
    }
     
    public static void cambiarPanel(JFrame frame, JPanel panelPadre,JButton boton,JPanel panelHijo){
        
        
        switch (boton.getName()) {
            case "jBtn_limp_buscar":
                limpiarPanelPadre(panelPadre);
                activarPanelHijo(panelHijo, panelPadre);
                
                break;   
            case "jBtn_limp_modificar":
                limpiarPanelPadre(panelPadre);
                activarPanelHijo(panelHijo, panelPadre);
                
                break;    
            case "JBtn_cerrarSesion":
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Cerrar Sesión?", "Salir", 2, JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_NO_OPTION){
                    frame.dispose();
                    Login login = new Login();
                    login.setVisible(true);
                }
                
                break;  
            default:    
                throw new AssertionError();
        }
    }
   //resetea el panel padre
    public static void limpiarPanelPadre(JPanel panel){
        panel.removeAll();
    }
    //Activar PanelHijo 
    public static void activarPanelHijo(JPanel panelHijo, JPanel panelPadre){
        panelPadre.add(panelHijo);
        panelPadre.repaint();
        panelPadre.revalidate();
        
        //set del boton
        
    }

}
