/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class doctordeletingpage extends javax.swing.JFrame {

    /**
     * Creates new form doctordeletingpage
     */
    private static int flag1=0;
    private static int flag2=0;
    private static String u="";
    public doctordeletingpage() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        deletedusername = new javax.swing.JTextField();
        checklabel = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        returnbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalreservationsystem/IMG-20221013-WA0095.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 230));

        deletedusername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        checklabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton.setText("delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        returnbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnbutton.setText("return to admin page");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(deletebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnbutton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletedusername, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(deletedusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(checklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebutton)
                    .addComponent(returnbutton))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 380, 220));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("please enter the username of the doctor you want to delete");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletedoctor(){
         checkdata();
        dele d=new dele();
        d.del(u,true);
        if(flag2==1&&flag1==0)
        {checklabel.setText("deleted successfully");
        deletedusername.setText("");}
     /*checkdata();
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        if(flag2==1&&flag1==0){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
            String sql="DELETE FROM HAGER.DOCTOR WHERE DOCTORUSERNAME='"+u+"'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();

        }
        catch(SQLException e) {

            System.out.println("error");
        }
        checklabel.setText("deleted successfully");
        deletedusername.setText("");
        }*/
    }
    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
       deletedoctor();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        adminpage p= new adminpage();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void checkdata(){
    checklabel.setText("");
    flag1=0;
    flag2=0;
    u=deletedusername.getText();
    if(u.equals("")){
        checklabel.setText("please enter the username");
        flag1=1;
    }
     String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String checku="";
         if(flag1==0){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT DOCTORUSERNAME FROM HAGER.DOCTOR" ;
           
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("DOCTORUSERNAME");
               if(checku.equals(u)){
                   flag2=1;
               }
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        if (flag2==0){
         checklabel.setText("please enter a valid username");
         }
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
            java.util.logging.Logger.getLogger(doctordeletingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctordeletingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctordeletingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctordeletingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctordeletingpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checklabel;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField deletedusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnbutton;
    // End of variables declaration//GEN-END:variables
}
