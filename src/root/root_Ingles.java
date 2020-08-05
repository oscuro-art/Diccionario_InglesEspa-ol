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
public final class root_Ingles extends javax.swing.JFrame {

    /**
     * Creates new form root
     */
    public root_Ingles() {
        initComponents();
        mostrardatos("");
    }
 void mostrardatos(String valor){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("PALABRAS");
    modelo.addColumn("DESCRIPCIÓN");
    tabla_root.setModel(modelo);
    String sql="";
     if(valor.equals(""))
    {
        sql="SELECT * FROM Ingles_Español";
    }
    else{
        sql="SELECT * FROM Ingles_Español WHERE cod='"+valor+"'";
    }
    String []datos = new String [3];
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            tabla_root.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Ingles_Español.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 public void limpiar(){
    txt_cod.setText(null);
    txt_palab.setText(null);
    txt_descrip.setText(null);
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_palab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descrip = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_root = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPopupMenu1.setToolTipText("");
        jPopupMenu1.setLabel("");
        jPopupMenu1.setName("asd"); // NOI18N
        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });
        jPopupMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPopupMenu1KeyPressed(evt);
            }
        });

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("root_Ingles");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setText("Palabra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setText("Descripción:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        getContentPane().add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, -1));
        getContentPane().add(txt_palab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, -1));

        jLabel5.setText("root Agregar palabras de ingles a español");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        txt_descrip.setColumns(20);
        txt_descrip.setRows(5);
        jScrollPane1.setViewportView(txt_descrip);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 530, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        tabla_root.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_root.setComponentPopupMenu(jPopupMenu1);
        tabla_root.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabla_root);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 780, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30413hd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // boton guardar 
         try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO Ingles_Español (cod,palabras,descripcion) VALUES (?,?,?)");
        pst.setString(1, txt_cod.getText());
        pst.setString(2, txt_palab.getText());
        pst.setString(3, txt_descrip.getText());
        pst.executeUpdate();
       dd.mostrardatos("");
       mostrardatos("");
       limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
        PreparedStatement pst = cn.prepareStatement("UPDATE Ingles_Español SET descripcion='"+txt_descrip.getText()+"',palabras='"+txt_palab.getText()+"' WHERE cod='"+txt_cod.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
        limpiar();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked
            
    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void jPopupMenu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPopupMenu1KeyPressed

    }//GEN-LAST:event_jPopupMenu1KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 //modificar datos seleccionados de la tabla_root
 int fila = tabla_root.getSelectedRow();
 if (fila>-1){
     txt_cod.setText(tabla_root.getValueAt(fila, 0 ).toString());
     txt_palab.setText(tabla_root.getValueAt(fila, 1 ).toString());
     txt_descrip.setText(tabla_root.getValueAt(fila, 2 ).toString());
 }else{
   JOptionPane.showMessageDialog(null, "NO seleccionado");  
 }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   //Elimina una fila de la tabla_root de la base de datos.
    int fila = tabla_root.getSelectedRow();
    String cod="";
    cod=tabla_root.getValueAt(fila, 0).toString();
    
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM Ingles_Español WHERE  cod='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (Exception e) {
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(root_Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(root_Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(root_Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(root_Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new root_Ingles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_root;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextArea txt_descrip;
    private javax.swing.JTextField txt_palab;
    // End of variables declaration//GEN-END:variables
Conector cc= new Conector();
    Connection cn= cc.conexion();
    Ingles_Español dd= new Ingles_Español();
  
}
