package Conexion;

import java.sql.*;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CargarDatos {
    ResultSet rs;
    
    
    public void MostrarModelo(JTable jTable1){
        DefaultTableModel modelo ;        
        String cabecera []={"id","nombre","Fecha Registro","Nombre Diseño","asasas"};
        String data [][]={};        
        modelo = new DefaultTableModel(data, cabecera);
        jTable1.setModel(modelo);  
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("{call sp_mostrarmodelo}"); 
        try {
            while (rs.next()) {                
            Vector vc = new Vector();
            vc.add(rs.getString(1));
            vc.add(rs.getString(2));
            vc.add(rs.getString(3));
            vc.add(rs.getString(4));
            vc.add(rs.getString(5));
            modelo.addRow(vc);
            jTable1.setModel(modelo);    
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos");
        }
        }
    
    public void mostrardatosDiseño(JTable jTable1){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel() ;
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("{call sp_MostrarDiseño}");
        try {
            while (rs.next()) {                
            Vector vc = new Vector();
            vc.add(rs.getString(1));
            vc.add(rs.getString(2));
            vc.add(rs.getString(3));
            vc.add(rs.getString(4));
            vc.add(rs.getString(5));
            modelo.addRow(vc);
            jTable1.setModel(modelo);    
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos");
        }
        }
    
    public void MostrarTrabajador(JTable jTable1){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("{call sp_mostrarJob}");
        
        try {
            while (rs.next()) {
                Vector vc = new Vector();
                vc.add(rs.getString(1));
                vc.add(rs.getString(2));
                vc.add(rs.getString(3));
                vc.add(rs.getString(4));
                vc.add(rs.getString(5));
                vc.add(rs.getString(6));
                vc.add(rs.getString(7));
                modelo.addRow(vc);
                jTable1.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos");
        }
    }
    
    public void MostrarRegistroCorte(JTable jtabla){
        DefaultTableModel modelo = (DefaultTableModel) jtabla.getModel();
        
        
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("{call sp_MostrarDiseño}");
        
        try {
            while (rs.next()) {
                Vector vc = new Vector();
                vc.add(rs.getString(1));
                vc.add(rs.getString(2));
                vc.add(rs.getString(3));
                vc.add(rs.getString(4));
                modelo.addRow(vc);
                jtabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos");
        }
        
        
    }
    
     public void consultarRoles (JComboBox combo, String conulta,String columna){
        try {
            Conexion.Conectar.getConexion();
            rs = Conexion.Conectar.consulta(""+conulta+"");
            combo.addItem("Seleccionar");
            while(rs.next()){
                combo.addItem(rs.getString(""+columna+""));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en cargar combo");
        }
    
    }
}
