package Ventanas;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import Conexion.*;

public class view_Modelo extends javax.swing.JInternalFrame {

    ResultSet rs;
    int cont;
    CargarDatos cd = new CargarDatos();
    String valorCombo;

    public view_Modelo() {
        initComponents();
        
        cd.consultarRoles(cbxDiseño, "select CodDiseño+'-'+nombreDi  as nombre_diseño from diseño", "nombre_diseño");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        BTN_Agregar_ = new javax.swing.JButton();
        BTN_Mostrar_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxDiseño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        BTM_Limpiar_ = new javax.swing.JButton();
        BTN_Update_ = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE MODELO :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 20));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));

        jLabel1.setText("CODIGO MODEL :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 20));
        jPanel1.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 90, -1));

        BTN_Agregar_.setText("AGREGAR");
        BTN_Agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Agregar_ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_Agregar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 100, -1));

        BTN_Mostrar_.setText("MOSTRAR");
        BTN_Mostrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Mostrar_ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_Mostrar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha Registro", "Nombre Diseñp", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 720, 230));

        cbxDiseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiseñoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDiseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));

        jLabel3.setText("DESCRIPCION :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, -1));

        jLabel4.setText("DISEÑO :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 390, -1));

        BTM_Limpiar_.setText("LIMPIAR");
        jPanel1.add(BTM_Limpiar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 100, -1));

        BTN_Update_.setText("UPDATE");
        jPanel1.add(BTN_Update_, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Mostrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Mostrar_ActionPerformed
        cd.MostrarModelo(jTable1);

    }//GEN-LAST:event_BTN_Mostrar_ActionPerformed

    private void BTN_Agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Agregar_ActionPerformed
        if (txtmodelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Ingrese sus datos corrctamente");
            txtmodelo.setText("");
            txtmodelo.requestFocus();
        } else {
            try {
                rs = Conexion.Conectar.consulta("select COUNT(CodModel) from modelo where CodModel = '" + txtmodelo.getText() + "'");
                try {
                    while (rs.next()) {
                        cont = rs.getInt(1);
                    }
                } catch (SQLException e) {
                }
                if (cont >= 1) {
                    JOptionPane.showMessageDialog(null, "este elemento ya existe");
                } else {
                    Procedimientos.sp_InsertModelo(txtmodelo.getText(), txtnombre.getText(), valorCombo, txtDescripcion.getText());
                    cd.MostrarModelo(jTable1);
                    limpiar();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error en registrar");
            }

        }
    }//GEN-LAST:event_BTN_Agregar_ActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cbxDiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiseñoActionPerformed
       String linea = cbxDiseño.getSelectedItem().toString();
       String cadena [] = linea.split("-");
       valorCombo = cadena[0];
        System.out.println(valorCombo);

    }//GEN-LAST:event_cbxDiseñoActionPerformed

void limpiar(){
txtmodelo.setText("");
txtnombre.setText("");
cbxDiseño.setSelectedIndex(0);
txtDescripcion.setText("");
txtmodelo.requestFocus();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTM_Limpiar_;
    private javax.swing.JButton BTN_Agregar_;
    private javax.swing.JButton BTN_Mostrar_;
    private javax.swing.JButton BTN_Update_;
    private javax.swing.JComboBox<String> cbxDiseño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
