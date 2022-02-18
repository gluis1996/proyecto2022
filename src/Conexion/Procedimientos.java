package Conexion;
import java.sql.*;
public class Procedimientos {
    public static void sp_ingresocatg (String a) throws SQLException{
     CallableStatement cs = Conectar.getConexion().prepareCall("{call agregarcategoria (?)}");
     cs.setString(1, a);
     cs.execute();    
    }
}
