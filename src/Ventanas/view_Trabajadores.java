package Ventanas;

import Conexion.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class view_Trabajadores extends javax.swing.JInternalFrame {

    ResultSet rs;
    int con;
    ButtonGroup brt;
    CargarDatos cd = new CargarDatos();

    public view_Trabajadores() {
        initComponents();
        // consultarRoles(combo1);
        brt = new ButtonGroup();
        brt.add(RBactivo);
        brt.add(RBinactivo);
        brt.add(RBretirado);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BTNMOSTRAR = new javax.swing.JButton();
        BTN_INSENTAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RBactivo = new javax.swing.JRadioButton();
        RBinactivo = new javax.swing.JRadioButton();
        RBretirado = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, -1));

        jLabel2.setText("Correo :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 330, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELIIDO", "EDAD", "CORREO", "CIUDAD", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(20);
            jTable2.getColumnModel().getColumn(1).setMinWidth(100);
            jTable2.getColumnModel().getColumn(2).setMinWidth(100);
            jTable2.getColumnModel().getColumn(3).setMinWidth(5);
            jTable2.getColumnModel().getColumn(4).setMinWidth(200);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 590, 180));

        BTNMOSTRAR.setText("CARGAR");
        BTNMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMOSTRARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNMOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, -1));

        BTN_INSENTAR.setText("INSENTAR");
        BTN_INSENTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INSENTARActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_INSENTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 90, -1));

        jLabel5.setText("Dni :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 140, -1));

        jLabel6.setText("Apellido :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, -1));

        jLabel7.setText("Edad :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 40, -1));

        jLabel8.setText("Ciudad :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        jPanel1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, -1));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 90, -1));

        jLabel3.setText("Estado :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        RBactivo.setText("Activo");
        jPanel1.add(RBactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        RBinactivo.setText("Inactivo");
        jPanel1.add(RBinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        RBretirado.setText("Retirado");
        jPanel1.add(RBretirado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMOSTRARActionPerformed
        cd.MostrarTrabajador(jTable2);
    }//GEN-LAST:event_BTNMOSTRARActionPerformed

    private void BTN_INSENTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INSENTARActionPerformed
        /*String nombre = txtnombre.getText();
        String pass = txtpassword.getText();
        int rol = combo1.getSelectedIndex();
      
        
        if (txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verfique sus datos bien coño");
            txtnombre.setText("");
            txtnombre.requestFocus();
        }else {
            
        try {
            rs = Conexion.Conectar.consulta("select COUNT(usuario) from Trabajadores where usuario = '"+txtnombre.getText()+"'");
            try {
                while (rs.next()){
                    con = rs.getInt(1);
                }
            } catch (SQLException e) {
            }
            if (con >= 1){
                JOptionPane.showMessageDialog(null, "El Usuario Existe");
            }else {
                Procedimientos.sp_InsertJob(nombre,pass,rol);
                cargardatos();
                txtnombre.setText("");
                txtnombre.requestFocus();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en procesar la insercion"+e);
        }
        
        }
        
         */

    }//GEN-LAST:event_BTN_INSENTARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dni = txtdni.getText();
        String correo = txtcorreo.getText();
        String Estado = null;
        if (RBactivo.isSelected()== true) {
            Estado = "Activo";
        } else if (RBinactivo.isSelected() == true) {
            Estado = "Inactivo";
        } else if (RBretirado.isSelected() == true) {
            Estado = "Retirado";
        } 
        System.out.println(Estado);
        try {
            Procedimientos.sp_UpdateTrabajador(dni, correo, Estado);
            cd.MostrarTrabajador(jTable2);
            JOptionPane.showMessageDialog(null, "Update Exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Update" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        try {
            int fila = jTable2.getSelectedRow();
            String id = (String) jTable2.getValueAt(fila, 0);
            String nombre = (String) jTable2.getValueAt(fila, 1);
            String apellido = (String) jTable2.getValueAt(fila, 2);
            String edad = (String) jTable2.getValueAt(fila, 3);
            String ciudad = (String) jTable2.getValueAt(fila, 5);
            String correo = (String) jTable2.getValueAt(fila, 4);
            Connection con = Conexion.Conectar.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT Dni,nombreTra,Apellidos,Edad,Correo,Cuidad,Estado  FROM trabajador where Dni = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtdni.setText(String.valueOf(id));
                txtnombre.setText(String.valueOf(nombre));
                txtapellido.setText(String.valueOf(apellido));
                txtedad.setText(String.valueOf(edad));
                txtciudad.setText(String.valueOf(ciudad));
                txtcorreo.setText(String.valueOf(correo));
                if (rs.getString("Estado").equals("Activo")) {
                    RBactivo.setSelected(true);
                } else if (rs.getString("Estado").equals("Inactivo")) {
                    RBinactivo.setSelected(true);
                } else if (rs.getString("Estado").equals("Retirado")) {
                    RBretirado.setSelected(true);
                } else {
                    RBactivo.setSelected(false);
                    RBinactivo.setSelected(false);
                    RBretirado.setSelected(false);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en mostrar datos \n" + ex);
        }


    }//GEN-LAST:event_jTable2MouseClicked
    void consultarRoles(JComboBox combo) {
        try {
            Conexion.Conectar.getConexion();
            rs = Conexion.Conectar.consulta("select Usuario from TipoUsuario");
            combo.addItem("Seleccionar");
            while (rs.next()) {
                combo.addItem(rs.getString("Usuario"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en cargar combo");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNMOSTRAR;
    private javax.swing.JButton BTN_INSENTAR;
    private javax.swing.JRadioButton RBactivo;
    private javax.swing.JRadioButton RBinactivo;
    private javax.swing.JRadioButton RBretirado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
