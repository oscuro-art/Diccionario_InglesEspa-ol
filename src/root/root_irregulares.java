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
public class root_irregulares extends javax.swing.JFrame {

    /**
     * Creates new form root_irregulares
     */
    public root_irregulares() {
        initComponents();
        mostrardatoscuatro("");
       
    }
 public void mostrardatoscuatro(String valor){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("VERBO ESPAÑOL");
    modelo.addColumn("VERBO INGLES");
    modelo.addColumn("PASADO SIMPLE");
    modelo.addColumn("PARTICIPIO");
    tabla_irregulares_root.setModel(modelo);
    String sql="";
     if(valor.equals(""))
    {
        sql="SELECT * FROM verbos_irregulares";
    }
    else{
        sql="SELECT * FROM verbos_irregulares WHERE verbo_español='"+valor+"'";
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
            tabla_irregulares_root.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Ingles_Español.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 public void Limpiar(){
     txt_codigo.setText(null);
     txt_verboEspa.setText(null);
     txt_verboIngl.setText(null);
     txt_pasadoSimp.setText(null);
     txt_partici.setText(null);
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_verboEspa = new javax.swing.JTextField();
        txt_verboIngl = new javax.swing.JTextField();
        txt_pasadoSimp = new javax.swing.JTextField();
        txt_partici = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_irregulares_root = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, -1, -1));

        jLabel2.setText("verbo español:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        jLabel3.setText("verbo ingles:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, -1, -1));

        jLabel4.setText("pasado simple:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));

        jLabel5.setText("participio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, -1, -1));
        getContentPane().add(txt_verboEspa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, -1));
        getContentPane().add(txt_verboIngl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, -1));
        getContentPane().add(txt_pasadoSimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, -1));
        getContentPane().add(txt_partici, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, -1));
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        tabla_irregulares_root.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_irregulares_root.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabla_irregulares_root);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 800, 260));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30413hd.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO verbos_irregulares (codi,verbo_español,verbo_ingles,pasado_simple,participio) VALUES (?,?,?,?,?)");
        pst.setString(1, txt_codigo.getText());
        pst.setString(2, txt_verboEspa.getText());
        pst.setString(3, txt_verboIngl.getText());
        pst.setString(4, txt_pasadoSimp.getText());
        pst.setString(5, txt_partici.getText());
        pst.executeUpdate();
       
      mostrardatoscuatro("");
      Limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
        PreparedStatement pst = cn.prepareStatement("UPDATE verbos_irregulares SET participio='"+txt_partici.getText()+"',pasado_simple='"+txt_pasadoSimp.getText()+"',verbo_ingles='"+txt_verboIngl.getText()+"',verbo_español='"+txt_verboEspa.getText()+"' WHERE codi='"+txt_codigo.getText()+"'");
        pst.executeUpdate();
        mostrardatoscuatro("");
        Limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
 //modificar tabla  
 int fila = tabla_irregulares_root.getSelectedRow();
 if (fila>-1){
     txt_codigo.setText(tabla_irregulares_root.getValueAt(fila, 0 ).toString());
     txt_verboEspa.setText(tabla_irregulares_root.getValueAt(fila, 1 ).toString());
     txt_verboIngl.setText(tabla_irregulares_root.getValueAt(fila, 2 ).toString());
     txt_pasadoSimp.setText(tabla_irregulares_root.getValueAt(fila, 3 ).toString());
     txt_partici.setText(tabla_irregulares_root.getValueAt(fila, 4 ).toString());
 }else{
   JOptionPane.showMessageDialog(null, "NO seleccionado");  
 }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       //Elimina una fila de la tabla_root_español de la base de datos.
    int fila =    tabla_irregulares_root.getSelectedRow();
    String codE="";
    codE=   tabla_irregulares_root.getValueAt(fila, 0).toString();
    
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM verbos_irregulares WHERE  codE='"+codE+"'");
        pst.executeUpdate();
        mostrardatoscuatro("");
    } catch (Exception e) {
    }
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(root_irregulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(root_irregulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(root_irregulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(root_irregulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new root_irregulares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_irregulares_root;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_partici;
    private javax.swing.JTextField txt_pasadoSimp;
    private javax.swing.JTextField txt_verboEspa;
    private javax.swing.JTextField txt_verboIngl;
    // End of variables declaration//GEN-END:variables

Conector cc= new Conector();
    Connection cn= cc.conexion();
}
