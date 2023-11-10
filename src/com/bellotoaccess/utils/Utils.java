
package com.bellotoaccess.utils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */
public class Utils {
    
    private static final String RUTA_CAMINO_FRAME = "/com/bellotoaccess/imag/log1.png";
        public static void cambiarIconoFrame (JFrame frame){
            try {
                ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA_CAMINO_FRAME));
                frame.setIconImage(icono.getImage());
            } catch (Exception e) {
           ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage()); }
        }
    private String obtenerInput(JTextField campo){
        return campo.getText();
    }
 
}
