/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Daniil Kochyk
 */
public class Wykladowcy extends javax.swing.JFrame {

    public static Wykladowcy Wykladowcy = new Wykladowcy();
    ButtonGroup btnGr;
    
    public Wykladowcy() {
        initComponents();
        txtId.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(rbWyklad);
        btnGr.add(rbLab);
        tabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtImie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrzedmiot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGodziny = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbWyklad = new javax.swing.JRadioButton();
        rbLab = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtGrupa = new javax.swing.JTextField();
        btnDodac = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnUsunac = new javax.swing.JButton();
        btnWyczyscic = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plan");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Prowadzone przedmioty");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 44, 217, 22);

        tblPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Prowadzący", "Przedmiot", "Godziny", "Typ zajęć", "Grupa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 72, 545, 344);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dane", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Prowadzący:");

        txtImie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Przedmiot:");

        txtPrzedmiot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrzedmiotActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ilość godzin:");

        txtGodziny.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Typ zajęć:");

        rbWyklad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbWyklad.setText("Wykład");

        rbLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbLab.setText("Ćwiczenia/Lab");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Grupa:");

        txtGrupa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDodac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDodac.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_add_circle_outline_black_24dp.png")); // NOI18N
        btnDodac.setText("Dodać");
        btnDodac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodacActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMod.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_edit_black_24dp.png")); // NOI18N
        btnMod.setText("Modyfikować");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnUsunac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUsunac.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_delete_black_24dp.png")); // NOI18N
        btnUsunac.setText("Usunąć");
        btnUsunac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunacActionPerformed(evt);
            }
        });

        btnWyczyscic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnWyczyscic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_clear_black_24dp.png")); // NOI18N
        btnWyczyscic.setText("Wyczyścić pola");
        btnWyczyscic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyczyscicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImie, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtPrzedmiot)
                            .addComponent(txtGodziny)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbWyklad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbLab)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGrupa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsunac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWyczyscic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGodziny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbWyklad)
                    .addComponent(rbLab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGrupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodac)
                    .addComponent(btnMod))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsunac)
                    .addComponent(btnWyczyscic))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(580, 50, 346, 380);

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\outline_logout_black_24dp.png")); // NOI18N
        logout.setText("Wylogować się");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(10, 460, 143, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniil Kochyk\\Documents\\NetBeansProjects\\finProject\\img\\196-1963020_website-backgrounds-website-login-page-background.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, -16, 1000, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrzedmiotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrzedmiotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrzedmiotActionPerformed

    private void btnDodacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodacActionPerformed
       String prowadzacy = txtImie.getText();
       String przedmiot = txtPrzedmiot.getText();
       int godziny = Integer.parseInt(txtGodziny.getText());
       
       String typ;
       if(rbWyklad.isSelected() == true){
           typ = "Wykład";
       } else if(rbLab.isSelected() == true){
           typ="Lab/Ćw";
       } else {
           typ = "Wykład";
       }
       String grupa = txtGrupa.getText();
       String ins=("INSERT INTO projtable (Prowadzacy, Przedmiot, Godziny, typ, Grupa, obecnie) VALUES (?,?,?,?,?,?)");
       try {
           Connection con = Polaczenie.getConnection();
           PreparedStatement ps = con.prepareStatement(ins);
           ps.setString(1, prowadzacy);
           ps.setString(2, przedmiot);
           ps.setInt(3, godziny);
           ps.setString(4, typ);
           ps.setString(5, grupa);
           ps.setInt(6, 1);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Dodano do planu");
           wyczysc();
           tabela();
       } catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnDodacActionPerformed

    private void tblPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlanMouseClicked
        // TODO add your handling code here:
        try{
            int sz = tblPlan.getSelectedRow();
            int id = Integer.parseInt(tblPlan.getValueAt(sz, 0).toString());
             PreparedStatement ps;
        ResultSet rs;

                Connection con = Polaczenie.getConnection();
            ps = con.prepareStatement("SELECT Prowadzacy, Przedmiot, Godziny, typ, Grupa  FROM projtable WHERE id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                txtId.setText(String.valueOf(id));
                txtImie.setText(rs.getString("Prowadzacy"));
                txtPrzedmiot.setText(rs.getString("Przedmiot"));
                txtGodziny.setText(rs.getString("Godziny"));
                txtGrupa.setText(rs.getString("Grupa"));
                if(rs.getString("typ").equals("Wykład")){
                    rbWyklad.setSelected(true);
                } else if(rs.getString("typ").equals("Lab/Ćw")){
                    rbLab.setSelected(true);
                } 
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_tblPlanMouseClicked

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        String prowadzacy = txtImie.getText();
       String przedmiot = txtPrzedmiot.getText();
       int godziny = Integer.parseInt(txtGodziny.getText());
       
       String typ;
       if(rbWyklad.isSelected() == true){
           typ = "Wykład";
       } else if(rbLab.isSelected() == true){
           typ="Lab/Ćw";
       } else {
           typ = "Wykład";
       }
       String grupa = txtGrupa.getText();
       String upd=("UPDATE projtable SET Prowadzacy=?, Przedmiot=?, Godziny=?, typ=?, Grupa=?  WHERE id=?");
       try {
           Connection con = Polaczenie.getConnection();
           PreparedStatement ps = con.prepareStatement(upd);
           ps.setString(1, prowadzacy);
           ps.setString(2, przedmiot);
           ps.setInt(3, godziny);
           ps.setString(4, typ);
           ps.setString(5, grupa);
           ps.setInt(6, id);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Zmodyfikowano");
           wyczysc();
           tabela();
       } catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnUsunacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunacActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
 
       String del=("UPDATE projtable SET obecnie = 0 WHERE id=?");
       try {
           Connection con = Polaczenie.getConnection();
           PreparedStatement ps = con.prepareStatement(del);
        
           ps.setInt(1, id);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Usunięto");
           wyczysc();
           tabela();
       } catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnUsunacActionPerformed

    private void btnWyczyscicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyczyscicActionPerformed
        // TODO add your handling code here:
        wyczysc();
    }//GEN-LAST:event_btnWyczyscicActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        mainstr.main.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_logoutActionPerformed
   
    
    private void wyczysc(){
        txtId.setText("");
        txtImie.setText("");
        txtPrzedmiot.setText("");
        txtGodziny.setText("");
        txtGrupa.setText("");
        btnGr.clearSelection();
    }
   
    private void tabela(){
        
        DefaultTableModel mtab = (DefaultTableModel) tblPlan.getModel();
        mtab.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int kolumn;
        String sel = "SELECT id, Prowadzacy, Przedmiot, Godziny, typ, Grupa  FROM projtable WHERE obecnie = 1";
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
            java.util.logging.Logger.getLogger(Wykladowcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wykladowcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wykladowcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wykladowcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wykladowcy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodac;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnUsunac;
    private javax.swing.JButton btnWyczyscic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton rbLab;
    private javax.swing.JRadioButton rbWyklad;
    private javax.swing.JTable tblPlan;
    private javax.swing.JTextField txtGodziny;
    private javax.swing.JTextField txtGrupa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImie;
    private javax.swing.JTextField txtPrzedmiot;
    // End of variables declaration//GEN-END:variables
}
