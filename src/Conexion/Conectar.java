package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {

    static Connection con = null;
    public static String usuario;
    public static String password;
    public static boolean status = false;

    public static Connection getConexion() {
        status = false;

        String url = "jdbc:sqlserver://192.168.100.5:1433;databaseName=VentaDeRopa";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "error al conectar " + e);
        }

        try {
            con = DriverManager.getConnection(url, Conectar.usuario, Conectar.password);
            status = true;
            JOptionPane.showMessageDialog(null, "conexion Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }
        return con;

    }

    public static void setCuenta(String usu, String pas) {
        usuario = usu;
        password = pas;
    }
    
    public static boolean getStatus() {
        return status;
    }
    
    public static ResultSet consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al obtener datos");
        }
        return null;
    }
}
