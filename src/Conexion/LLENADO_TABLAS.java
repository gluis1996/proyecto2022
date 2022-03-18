/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS
 */
public class LLENADO_TABLAS {
    
    
    public static void tabla1(JTable tabla){
        DefaultTableModel modelo ;
        
        String cabecera []={"id","nombre"};
        String data [][]={};
        
        modelo = new DefaultTableModel(data, cabecera);
        tabla.setModel(modelo);
                
    }
    public static void llenado_tablaModelo(JTable tabla2){
        DefaultTableModel modelo ;        
        String cabecera []={"id","nombre","Fecha Registro","Nombre Diseño","asasas"};
        String data [][]={};        
        modelo = new DefaultTableModel(data, cabecera);
        tabla2.setModel(modelo);      
    }
}
