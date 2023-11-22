
package com.bellotoaccess.controlador;

import com.bellotoaccess.bd.Conexion;
import com.bellotoaccess.modelo.BorradorDataBaseForTest;
import com.bellotoaccess.modelo.Usuario;
import com.bellotoaccess.vista.MenuInicial;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Olivares
 */

//login del array corregirlo Borrador
public class LoginDriverArray {

    private BorradorDataBaseForTest db = new BorradorDataBaseForTest();
    public LoginDriverArray() {
    }
   
    public LoginDriverArray (BorradorDataBaseForTest db){
        this.db = db;
    }
}
