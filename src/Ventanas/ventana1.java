package Ventanas;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import Conexion.*;

public class ventana1 extends javax.swing.JInternalFrame {

    ResultSet rs;
    int cont;

    public ventana1() {
        initComponents();
    }
        void mostrardatos(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        rs = Conexion.Conectar.consulta("SELECT Idcategoria,CategoriName,FechaDeRegistro FROM Categorias");
        try {
            while (rs.next()) {                
            Vector vc = new Vector();
            vc.add(rs.getInt(1));
            vc.add(rs.getString(2));
            vc.add(rs.getString(3));
            modelo.addRow(vc);
            jTable1.setModel(modelo);    
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en los datos");
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de la Categoria :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));
        getContentPane().add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 133, -1));

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jButton2.setText("MOSTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, 210));

        jLabel2.setText("Buscar Categoria :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mostrardatos();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(txtcategoria.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Ingrese sus datos corrctamente");
        txtcategoria.setText("");
        txtcategoria.requestFocus();
        }else   {
            try {
                rs = Conexion.Conectar.consulta("SELECT COUNT(CategoriName) FROM Categorias WHERE CategoriName = '"+txtcategoria.getText()+"'");
                try {
                    while(rs.next()){
                     cont = rs.getInt(1);
                    }
                } catch (SQLException e) {
                }
                if (cont>=1){
                    JOptionPane.showMessageDialog(null, "este elemento ya existe");
                }else {
                    Procedimientos.sp_ingresocatg(txtcategoria.getText());
                    mostrardatos();
                    txtcategoria.setText("");
                    txtcategoria.requestFocus();
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error en registrar");
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtcategoria;
    // End of variables declaration//GEN-END:variables
}
