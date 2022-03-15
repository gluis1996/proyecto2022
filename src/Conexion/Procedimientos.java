package Conexion;
import java.sql.*;
public class Procedimientos {
    public static void sp_InsertModelo (String a) throws SQLException{
     CallableStatement cs = Conectar.getConexion().prepareCall("{call agregarcategoria (?)}");
     cs.setString(1, a);
     cs.execute();    
    }
    
    public static void sp_InsertJob (String a,String b,int c) throws SQLException{
    CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_InsertJob (?,?,?)}");
    cs.setString(1, a);
    cs.setString(2, b);
    cs.setInt(3, c);
    cs.execute();
    }
    
    public static void sp_InsertDiseño (String a,String b,String c) throws SQLException{
    CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_InsertDiseño(?,?,?)}");
    cs.setString(1, a);
    cs.setString(2, b);
    cs.setString(3, c);
    cs.execute();        
    }
    
    public static void sp_UpdateDiseño (String a, int b) throws SQLException{
    CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_UpdateDiseño(?,?)}");
    cs.setString(1, a);
    cs.setInt(2, b);
    cs.execute();
    }
    
    public static void sp_UpdateTrabajador (String a, String b, String c) throws SQLException{
    CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_UpdateTrabajador(?,?,?)}");
    cs.setString(1, a);
    cs.setString(2, b);
    cs.setString(3, c);
    cs.execute();
    }
    
    
}
