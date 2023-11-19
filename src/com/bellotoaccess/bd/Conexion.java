package com.bellotoaccess.bd;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Cristian Olivares
 */
public class Conexion {
      //conexion phpmysql
        public Connection obtenerConexion()
    {
        Connection con = null;
        //trycatch+tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bellotoaccess", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión " + e.getMessage());
        }
        return con;
    }
        
//          //conexion con Oracle
//    private static final String WALLET_PATH = "C:/Users/USRVI-LC3/Documents/Wallet_libreria";
//    private static final String WALLET_PASSWORD = "ValeNico.2003";
//    private static final String JDBC_URL = "jdbc:oracle:thin:@libreria_high"; // - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";
//
//    public Connection obtenerConexionOracle() throws Exception {
//        // Configuración del wallet
//        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
//        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();
//
//        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
//        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
//        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
//        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
//        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);
//
//        Properties properties = new Properties();
//        properties.put("user", "admin");
//        properties.put("password", WALLET_PASSWORD);
//
//        return DriverManager.getConnection(JDBC_URL, properties);
//    }
    
   }
    

