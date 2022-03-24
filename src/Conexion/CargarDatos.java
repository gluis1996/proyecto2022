package Conexion;

import java.sql.*;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
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
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
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
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
        }
    }
    
    public void MostrarRegistroCorte(JTable jtabla){
        DefaultTableModel modelo ;
        String cabecera[]={"codigo","Detalle","modelo","Fecha "};
        String data[][]={};
        modelo = new DefaultTableModel(data,cabecera);
        jtabla.setModel(modelo);
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("select *from registro_corte");
        
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
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
        }     
    }
    public void MostrarServicio(JTable tabla){
        DefaultTableModel modelo;
        String cabecera []={"Color","Modelo","Color","Talla","Cantidad"};
        String data [][]={};
        modelo = new DefaultTableModel(data,cabecera);
        tabla.setModel(modelo);
        rs = Conexion.Conectar.consulta("{call sp_MostrarTC1}");
        try {
            while(rs.next()){
                Vector vc = new Vector();
                vc.add(rs.getString(1));
                vc.add(rs.getString(2));
                vc.add(rs.getString(3));
                vc.add(rs.getString(4));
                vc.add(rs.getInt(5));
                modelo.addRow(vc);
                tabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
        }
    
    }
    
    public void buscarEnTC(JTable tabla, String dato) throws SQLException{
        DefaultTableModel modelo;
        String cabecera []={"Color","Modelo","Color","Talla","Cantidad"};
        String data [][]={};
        modelo = new DefaultTableModel(data,cabecera);
        tabla.setModel(modelo);
        rs = Conectar.consulta("{call sp_MostrarTC1}");        
        try {
            while(rs.next()){
                if (rs.getString(1).equals(dato)){
                Vector vc = new Vector();
                vc.add(rs.getString(1));
                vc.add(rs.getString(2));
                vc.add(rs.getString(3));
                vc.add(rs.getString(4));
                vc.add(rs.getInt(5));
                modelo.addRow(vc);
                tabla.setModel(modelo);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
        }
    }
    
    
    public void buscarEnSev(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e) throws SQLException{
        String dato = a.getText();
        rs = Conectar.consulta("select *from servicio");        
            while(rs.next()){
                if (rs.getString(1).equals(dato)){
                b.setText(rs.getString(5));
                c.setText(rs.getString(6));
                d.setText(rs.getString(2));
                e.setText(rs.getString(4));
                }
            }
        
    }
    public void MostrarEntregaservicio (JTable tabla){
    DefaultTableModel modelo ;
    String cabecea []={"Codigo","Fecha Entrega","Fecha Estimada Retorno","Fecha de Retorno", "trabajador","CodCorte","Descripcion"};
    String data[][]={};
    modelo = new DefaultTableModel(data,cabecea);
    tabla.setModel(modelo);
    rs = Conectar.consulta("select *from servicio");
        try {
            while (rs.next()){
                Vector vc = new Vector();
                vc.add(rs.getString(1));
                vc.add(rs.getDate(2));
                vc.add(rs.getDate(3));
                vc.add(rs.getDate(4));
                vc.add(rs.getString(5));
                vc.add(rs.getString(6));
                vc.add(rs.getString(7));
                modelo.addRow(vc);
                tabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos \n" +e);
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
