/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

import Palabras.Ingles_Español;
import clases.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Medellin
 */
public class Expresiones_ideomaticas extends javax.swing.JFrame {

    /**
     * Creates new form Expresiones_ideomaticas
     */
    public Expresiones_ideomaticas() {
        initComponents();
         mostrarExpresiones("");
    }
public void mostrarExpresiones(String valor){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("EXPRESION");
    modelo.addColumn("SIGNIFICADO");
    modelo.addColumn("EJEMPLO INGLES");
    modelo.addColumn("EJEMPLO ESPAÑOL");
    expresiones_ideomaticas1.setModel(modelo);
    String sql="";
     if(valor.equals(""))
    {
        sql="SELECT * FROM Expresiones_Ideomaticas";
    }
    else{
        sql="SELECT * FROM Expresiones_Ideomaticas WHERE Expresion ='"+valor+"'";
       
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
            expresiones_ideomaticas1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expresiones_ideomaticas1 = new javax.swing.JTable();
        buscar_expresion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expresiones Ideomaticas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        expresiones_ideomaticas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(expresiones_ideomaticas1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1330, 250));

        buscar_expresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_expresionActionPerformed(evt);
            }
        });
        buscar_expresion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscar_expresionKeyReleased(evt);
            }
        });
        getContentPane().add(buscar_expresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_expresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_expresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_expresionActionPerformed

    private void buscar_expresionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_expresionKeyReleased
        String[] titulos = {"CODIGO", "EXPRESION","SIGNIFICADO", "EJEMPLO_INGLES", "EJEMPLO_ESPAÑOL"};
            String[] registros = new String[50];

            String sql = "SELECT *FROM Expresiones_Ideomaticas WHERE Expresion LIKE '%" + buscar_expresion.getText() + "%' "
                    + "OR CodEI LIKE '%" + buscar_expresion.getText() + "%'"
                    + "OR Expresion LIKE '%" + buscar_expresion.getText() + "%'"
                    + "OR Significados LIKE '%" + buscar_expresion.getText() + "%'"
                    + "OR Ejemplo_Ingles LIKE '%" + buscar_expresion.getText() + "%'"
                    + "OR Ejemplo_Español LIKE '%" + buscar_expresion.getText() + "%'";
           DefaultTableModel modelo= new DefaultTableModel(null,titulos);
            //modelo = new DefaultTableModel(null, titulos);
           
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
            expresiones_ideomaticas1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_buscar_expresionKeyReleased

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
            java.util.logging.Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expresiones_ideomaticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expresiones_ideomaticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar_expresion;
    private javax.swing.JTable expresiones_ideomaticas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
Conector cc= new Conector();
Connection cn= cc.conexion();
}