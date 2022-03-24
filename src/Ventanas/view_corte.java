package Ventanas;

import java.sql.*;
import Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import VentanasFlotantes.*;
    
public class view_corte extends javax.swing.JInternalFrame {
    
    
    CargarDatos cd = new CargarDatos();
    String CBcodigo;
    ResultSet rs;
    String a,b,c;
    public view_corte() {
        initComponents();
        cd.consultarRoles(cbxmodeloRC, "select CodModel+'-'+[Nombre Modelo]  as codno from modelo", "codno");
        cd.consultarRoles(cbx_Color_, "select codcol from color", "codcol");
        cd.consultarRoles(cbxTalla, "select CodTalla+'-'+NombreTalla as codtalla from talla", "codtalla");
        cd.consultarRoles(cbxCorte,"select rc.CodCorte+'-'+m.[Nombre Modelo] as nombre from registro_corte as rc inner join modelo as m on m.CodModel=rc.CodModel", "nombre");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdetalleRC = new javax.swing.JTextField();
        txtcodigoRC = new javax.swing.JTextField();
        cbxmodeloRC = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        añadir_servicio = new javax.swing.JButton();
        BTN_ColoTalla = new javax.swing.JButton();
        cbxCorte = new javax.swing.JComboBox<>();
        cbx_Color_ = new javax.swing.JComboBox<>();
        cbxTalla = new javax.swing.JComboBox<>();
        txtcantida = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tbbuscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 860, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO CORTE NUEVO"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("COD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("MODELO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setText("DETALLE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel2.add(txtdetalleRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 270, -1));
        jPanel2.add(txtcodigoRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));

        cbxmodeloRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmodeloRCActionPerformed(evt);
            }
        });
        jPanel2.add(cbxmodeloRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, -1));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 90, -1));

        jButton2.setText("MOSTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE CORTES"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("COLOR:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setText("TALLA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("CORTE");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel7.setText("CANTIDAD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        añadir_servicio.setText("AÑADIR");
        añadir_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_servicioActionPerformed(evt);
            }
        });
        jPanel3.add(añadir_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, -1));

        BTN_ColoTalla.setText("N C/T");
        BTN_ColoTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ColoTallaActionPerformed(evt);
            }
        });
        jPanel3.add(BTN_ColoTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, -1));

        cbxCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCorteActionPerformed(evt);
            }
        });
        jPanel3.add(cbxCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, -1));

        cbx_Color_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_Color_ActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_Color_, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, -1));

        cbxTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTallaActionPerformed(evt);
            }
        });
        jPanel3.add(cbxTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, -1));
        jPanel3.add(txtcantida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, -1));

        jButton5.setText("MOSTRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 80, -1));

        jButton6.setText("LIMPIAR");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 370, 120));

        jLabel8.setText("BUSCAR POR CODIGO CORTE :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        tbbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbbuscarMouseReleased(evt);
            }
        });
        jPanel1.add(tbbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, -1));

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            cd.MostrarRegistroCorte(jTable1);
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = txtcodigoRC.getText();
        String deta   = txtdetalleRC.getText();
        int con = 0;
        if (txtcodigoRC.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Codigo Vacio");
            txtcodigoRC.setText("");
            txtcodigoRC.requestFocus();
        }else {
            try {
                rs = Conexion.Conectar.consulta("select COUNT(CodCorte) from registro_corte where CodCorte = '" + codigo + "'");
                try {
                    while (rs.next()) {
                    con = rs.getInt(1);  
                    }    
                } catch (SQLException e) {                    
                }
                if (con >=1){
                    JOptionPane.showMessageDialog(null, "El Registro ya existe");
                }else {
                    Procedimientos.sp_InsertRegistro(codigo, deta, CBcodigo);
                    cd.MostrarRegistroCorte(jTable1);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "  "+e);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxmodeloRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmodeloRCActionPerformed
       String linea = cbxmodeloRC.getSelectedItem().toString();
       String cadena []= linea.split("-");
       CBcodigo = cadena[0];
       
    }//GEN-LAST:event_cbxmodeloRCActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cd.MostrarServicio(jTable1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void añadir_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_servicioActionPerformed
        int cant = Integer.parseInt(txtcantida.getText());
        
        try {
            Procedimientos.sp_InsertTC1(a, b, c, cant);
            cd.MostrarServicio(jTable1);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error \n"+e);
        }
    }//GEN-LAST:event_añadir_servicioActionPerformed

    private void cbx_Color_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_Color_ActionPerformed
       String color = cbx_Color_.getSelectedItem().toString();
       a = color;
        System.out.println(a);
    }//GEN-LAST:event_cbx_Color_ActionPerformed

    private void cbxTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTallaActionPerformed
       String talla = cbxTalla.getSelectedItem().toString();
       String cadena []= talla.split("-");
       b = cadena[0];
        System.out.println("talla ----->  "+b);
    }//GEN-LAST:event_cbxTallaActionPerformed

    private void cbxCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCorteActionPerformed
        String corte = cbxCorte.getSelectedItem().toString();
        String cadena [] = corte.split("-");
        c = cadena[0];
         System.out.println("corte ----->  "+c);
        
    }//GEN-LAST:event_cbxCorteActionPerformed

    private void tbbuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbuscarMouseReleased
        
    }//GEN-LAST:event_tbbuscarMouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String datos = tbbuscar.getText();
        try {
            cd.buscarEnTC(jTable1, datos);
        } catch (SQLException ex) {
            Logger.getLogger(view_corte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BTN_ColoTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ColoTallaActionPerformed
        Tabla_RE ter = new Tabla_RE();
        Ventanas.vistaAdmin.escritorio.add(ter);
        ter.setVisible(true);
        
    }//GEN-LAST:event_BTN_ColoTallaActionPerformed

    void limpiar (){
    txtdetalleRC.setText("");
    txtcodigoRC.setText("");
    cbxmodeloRC.setSelectedIndex(0);
    txtcodigoRC.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ColoTalla;
    private javax.swing.JButton añadir_servicio;
    private javax.swing.JComboBox<String> cbxCorte;
    private javax.swing.JComboBox<String> cbxTalla;
    private javax.swing.JComboBox<String> cbx_Color_;
    private javax.swing.JComboBox<String> cbxmodeloRC;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tbbuscar;
    private javax.swing.JTextField txtcantida;
    private javax.swing.JTextField txtcodigoRC;
    private javax.swing.JTextField txtdetalleRC;
    // End of variables declaration//GEN-END:variables
}
