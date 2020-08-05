/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import Palabras.Ingles_Español;
import clases.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class root_regulares extends javax.swing.JFrame {

    /**
     * Creates new form root_regulares
     */
    public root_regulares() {
        initComponents();
        mostrardatostres("");
    }
    
   public void mostrardatostres(String valor){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("INFINITIVO");
    modelo.addColumn("PASADO_PARTICIPIO");
    modelo.addColumn("PRONUNCIACION");
    modelo.addColumn("ESPAÑOL");
    Tabla_verbos_regulares.setModel(modelo);
    String sql="";
     if(valor.equals(""))
    {
        sql="SELECT * FROM verbos_regulares";
    }
    else{
        sql="SELECT * FROM verbos_regulares WHERE codR='"+valor+"'";
    }
    String []datos = new String [5];
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                modelo.addRow(datos);
            }
            Tabla_verbos_regulares.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Ingles_Español.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void limpiar(){
    txt_codigo.setText(null);
    txt_infiniti.setText(null);
    txt_pasa_partic.setText(null);
    txt_pronuncia.setText(null);
    txt_españ.setText(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        txt_infiniti = new javax.swing.JTextField();
        txt_pasa_partic = new javax.swing.JTextField();
        txt_pronuncia = new javax.swing.JTextField();
        txt_españ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_verbos_regulares = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificar);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_infiniti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, -1));
        getContentPane().add(txt_pasa_partic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, -1));
        getContentPane().add(txt_pronuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, -1));
        getContentPane().add(txt_españ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, -1));

        jLabel1.setText("Infinitivo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setText("Pasado y participio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Español:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setText("Pronunciación:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setText("Codigo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        Tabla_verbos_regulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_verbos_regulares.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(Tabla_verbos_regulares);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 790, 220));

        jButton2.setText("recargar tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30413hd.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO verbos_regulares (codR,infinitivo,pasado_participio,pronunciacion,español) VALUES (?,?,?,?,?)");
        pst.setString(1, txt_codigo.getText());
        pst.setString(2, txt_infiniti.getText());
        pst.setString(3, txt_pasa_partic.getText());
        pst.setString(4, txt_pronuncia.getText());
        pst.setString(5, txt_españ.getText());
        pst.executeUpdate();
       
      mostrardatostres("");
      limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrardatostres("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
        PreparedStatement pst = cn.prepareStatement("UPDATE verbos_regulares SET español='"+txt_españ.getText()+"',pronunciacion='"+txt_pronuncia.getText()+"',pasado_participio='"+txt_pasa_partic.getText()+"',infinitivo='"+txt_infiniti.getText()+"' WHERE codR='"+txt_codigo.getText()+"'");
        pst.executeUpdate();
        mostrardatostres("");
        limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
     int fila =  Tabla_verbos_regulares.getSelectedRow();
 if (fila>-1){
     txt_codigo.setText( Tabla_verbos_regulares.getValueAt(fila, 0 ).toString());
     txt_infiniti.setText( Tabla_verbos_regulares.getValueAt(fila, 1 ).toString());
      txt_pasa_partic.setText( Tabla_verbos_regulares.getValueAt(fila, 2 ).toString());
     txt_pronuncia.setText( Tabla_verbos_regulares.getValueAt(fila, 3 ).toString());
     txt_españ.setText( Tabla_verbos_regulares.getValueAt(fila, 4 ).toString());
 }else{
   JOptionPane.showMessageDialog(null, "NO seleccionado");  
 }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       int fila =  Tabla_verbos_regulares.getSelectedRow();
    String codR="";
    codR=   Tabla_verbos_regulares.getValueAt(fila, 0).toString();
    
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM verbos_regulares WHERE  codR='"+codR+"'");
        pst.executeUpdate();
        mostrardatostres("");
    } catch (Exception e) {
    }
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(root_regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(root_regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(root_regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(root_regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new root_regulares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_verbos_regulares;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_españ;
    private javax.swing.JTextField txt_infiniti;
    private javax.swing.JTextField txt_pasa_partic;
    private javax.swing.JTextField txt_pronuncia;
    // End of variables declaration//GEN-END:variables
Conector cc= new Conector();
    Connection cn= cc.conexion();
}
