
package com.bellotoaccess.utils;

import com.bellotoaccess.modelo.DataBase;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */
public class Utils {
    //metodo que genera el icono en el launcher de java
    private static final String RUTA_CAMINO_FRAME = "/com/bellotoaccess/imag/log1.png";
        public static void cambiarIconoFrame (JFrame frame){
            try {
                ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA_CAMINO_FRAME));
                frame.setIconImage(icono.getImage());
            } catch (Exception e) {
           ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage()); }
        }
        
    public static String obtenerInput(JTextField campo){
        return campo.getText();
    }
 
     
}
