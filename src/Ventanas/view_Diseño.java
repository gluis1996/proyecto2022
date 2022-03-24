package Ventanas;

import Conexion.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class view_Diseño extends javax.swing.JInternalFrame {

    /**
     * Creates new form view_Diseño
     */
    CargarDatos cd = new CargarDatos();
    ResultSet rs;
    int con;
    String ins;
    ButtonGroup btr;
    DefaultTableModel model=new DefaultTableModel (); 
    TableRowSorter<DefaultTableModel> sorter;
    public view_Diseño() {
        initComponents();
        cd.consultarRoles(jComboBox1, "select CodApli+'-'+nombreApli as codnom from tipo_aplicacion ", "codnom");
        btr = new ButtonGroup();
        btr.add(RbActivo);
        btr.add(RbDesactivo);
        model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("TIPO APLI");
        model.addColumn("FECHA REGIST");
        model.addColumn("ESTADO");
        jTable1.setModel(model);
        sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RbActivo = new javax.swing.JRadioButton();
        RbDesactivo = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        txtbusca = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "TIPO APLICA", "FECHA REGIS", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 490, 170));

        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 100, -1));

        jLabel1.setText("CODIGO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("TIPO APLICACION :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel1.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, -1));

        jButton2.setText("INSERTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, -1));

        jLabel4.setText("ESTADO :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        RbActivo.setText("ACITVO");
        jPanel1.add(RbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        RbDesactivo.setText("DESACTIVO");
        jPanel1.add(RbDesactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 100, -1));

        txtbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaActionPerformed(evt);
            }
        });
        txtbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscaKeyReleased(evt);
            }
        });
        jPanel1.add(txtbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 140, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cd.mostrardatosDiseño(jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed

    }//GEN-LAST:event_txtcodActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cod = txtcod.getText();
        String nom = txtnombre.getText();

        if (txtcod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "verifique el que tenga el codigo");
            txtcod.setText("");
            txtcod.requestFocus();
        } else {
            try {
                rs = Conexion.Conectar.consulta("select COUNT(CodDiseño) from diseño where CodDiseño =  '" + cod + "'");
                try {
                    while (rs.next()) {
                        con = rs.getInt(1);
                    }
                } catch (SQLException e) {
                }
                if (con >= 1) {
                    JOptionPane.showMessageDialog(null, "El Diseño Existe");
                } else {
                    Procedimientos.sp_InsertDiseño(cod, nom, ins);
                    cd.mostrardatosDiseño(jTable1);
                    txtcod.setText("");
                    txtcod.requestFocus();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en procesar la insercion" + e);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String linea = jComboBox1.getSelectedItem().toString();
        String[] cadena = linea.split("-");
        ins = cadena[0];        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
               
        if (jTable1.getSelectedRow()>=0){
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            String codigo = String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));
            String nombre = String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),1));
            String tipoApli = String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),2));
            String Estado = String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),4));
             
            
            txtcod.setText(codigo);
            txtnombre.setText(nombre);
            
            if(Estado.equals("1")){
                RbActivo.setSelected(true);
            }else if (Estado.equals("0")){
                RbDesactivo.setSelected(true);
            }
            } catch (Exception e) {
            }
     
        }else {
            JOptionPane.showMessageDialog(null, "Error en el Jtable");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cod = txtcod.getText();
        int estado;
        if (RbActivo.isSelected() == true) {
            estado = 1;
        } else if (RbDesactivo.isSelected() == true) {
            estado = 0;
        } else {
            estado = 0;
        }
        try {

            Procedimientos.sp_UpdateDiseño(cod, estado);
           cd.mostrardatosDiseño(jTable1);
            JOptionPane.showMessageDialog(null, "Cambio Realizado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro en Actulizar");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyReleased
        try {
        sorter.setRowFilter(RowFilter.regexFilter(txtbusca.getText()));
    } catch (Exception e) {
    }
        
        
    }//GEN-LAST:event_txtbuscaKeyReleased

    private void txtbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbActivo;
    private javax.swing.JRadioButton RbDesactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
