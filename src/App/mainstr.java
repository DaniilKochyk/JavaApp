/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniil Kochyk
 */
public class mainstr extends javax.swing.JFrame {
  public static mainstr main = new mainstr();
    
    /**
     * Creates new form mainstr
     */
    public mainstr() {
        initComponents();
          tabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        reload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zajęcia");

        modbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        modbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_edit_black_24dp.png")); // NOI18N
        modbtn.setText("Modyfikować tabelę");
        modbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modbtnActionPerformed(evt);
            }
        });

        tblPlan.setBackground(new java.awt.Color(204, 204, 255));
        tblPlan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPlan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prowadzący", "Przedmiot", "Godziny", "Typ zajęć", "Grupa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPlan.setShowGrid(true);
        jScrollPane1.setViewportView(tblPlan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lista prowadzonych przedmiotów");

        reload.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_autorenew_black_24dp.png")); // NOI18N
        reload.setText("Odswież");
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\white-wood-wall-texture-background-panels-graphic-resources-149622903.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(615, 615, 615)
                .addComponent(reload))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(modbtn))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(271, 271, 271)
                .addComponent(reload)
                .addGap(29, 29, 29)
                .addComponent(modbtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbtnActionPerformed
        // TODO add your handling code here:
       
        Login.login.setVisible(true);
       super.dispose();
    }//GEN-LAST:event_modbtnActionPerformed

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        // TODO add your handling code here:
  
        
        DefaultTableModel mtab = (DefaultTableModel) tblPlan.getModel();
        mtab.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int kolumn;
        String sel = "SELECT Prowadzacy, Przedmiot, Godziny, typ, Grupa  FROM projtable WHERE obecnie = 1";
         
        try{
            Connection con = Polaczenie.getConnection();
            ps = con.prepareStatement(sel);
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            kolumn = rsmd.getColumnCount();
            
          
            
            while(rs.next()){
                Object[] str = new Object[kolumn];
                for(int i=0; i<kolumn; i++){
                    str[i] = rs.getObject(i + 1);
                }
                mtab.addRow(str);
            }
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    
    }//GEN-LAST:event_reloadActionPerformed

     private void tabela(){
        
        DefaultTableModel mtab = (DefaultTableModel) tblPlan.getModel();
        mtab.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int kolumn;
        String sel = "SELECT Prowadzacy, Przedmiot, Godziny, typ, Grupa  FROM projtable WHERE obecnie = 1";
          int[] sz = {10, 100, 100, 30, 30, 60};
            for(int i = 0; i< tblPlan.getColumnCount(); i++){ 
                tblPlan.getColumnModel().getColumn(i).setPreferredWidth(sz[i]);
            }
        try{
            Connection con = Polaczenie.getConnection();
            ps = con.prepareStatement(sel);
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            kolumn = rsmd.getColumnCount();
            
          
            
            while(rs.next()){
                Object[] str = new Object[kolumn];
                for(int i=0; i<kolumn; i++){
                    str[i] = rs.getObject(i + 1);
                }
                mtab.addRow(str);
            }
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }
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
            java.util.logging.Logger.getLogger(mainstr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainstr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainstr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainstr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainstr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modbtn;
    private javax.swing.JButton reload;
    private javax.swing.JTable tblPlan;
    // End of variables declaration//GEN-END:variables
}
