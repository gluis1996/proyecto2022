package Conexion;
import java.sql.*;
public class Procedimientos {
    public static void sp_InsertModelo (String a,String b,String c,String d) throws SQLException{
     CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_IsertModelo (?,?,?,?)}");
     cs.setString(1, a);
     cs.setString(2, b);
     cs.setString(3, c);
     cs.setString(4, d);
     cs.execute();    
    }
    
    public static void sp_InsertJob (String a,String b,String c,String d,String e,String f,String g) throws SQLException{
    CallableStatement cs = Conectar.getConexion().prepareCall("{call sp_InsertJob (?,?,?,?,?,?,?)}");
    cs.setString(1, a);
    cs.setString(2, b);
    cs.setString(3, c);
    cs.setString(4, d);
    cs.setString(5, e);
    cs.setString(6, f);
    cs.setString(7, g);
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
