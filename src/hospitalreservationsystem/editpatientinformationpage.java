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
public class editpatientinformationpage extends javax.swing.JFrame {

    /**
     * Creates new form editpatientinformationpage
     */
     private static int flag1=0;
    private static int flag2=0;
   private static int flag3=0;
    private static int flag4=0;
    private static int flag5=0;
    private static int flag6=0;
   private static int flag7=0;
   private static int flag8=0;
 
    
    private static String ppn=""; // patient phone number
   
    private static String pnp=""; // patient new password
    private static String pop=""; // patient old password
    private static String pn=""; //patient name
    private static String paddress=""; //patient address address
    private static String pg=""; //patient gender
    private static String pu=""; // patient user name
    public editpatientinformationpage() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        genderlist = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        confirmbutton = new javax.swing.JButton();
        returnbutton = new javax.swing.JButton();
        oldpassword = new javax.swing.JPasswordField();
        checkusername = new javax.swing.JLabel();
        checkoldpassword = new javax.swing.JLabel();
        checkname = new javax.swing.JLabel();
        checkaddress = new javax.swing.JLabel();
        checkphonenumber = new javax.swing.JLabel();
        confirmation = new javax.swing.JLabel();
        resetbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        newpassword = new javax.swing.JPasswordField();
        checknewpassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalreservationsystem/services.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 560));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("enter your current user name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("enter your current password");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("modify your personal data");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("phone number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("gender");

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        genderlist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "female", "male" }));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        phonenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        confirmbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmbutton.setText("confirm");
        confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttonActionPerformed(evt);
            }
        });

        returnbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnbutton.setText("return to patient page");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        oldpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        confirmation.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        confirmation.setForeground(new java.awt.Color(255, 51, 51));

        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbutton.setText("reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("enter your new password");

        newpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(123, 123, 123)
                        .addComponent(name))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetbutton)
                        .addGap(68, 68, 68)
                        .addComponent(returnbutton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkusername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoldpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkphonenumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                        .addComponent(oldpassword)
                                        .addComponent(newpassword, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderlist, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(checknewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(checkusername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oldpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkoldpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checknewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(genderlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetbutton)
                        .addComponent(returnbutton))
                    .addComponent(confirmbutton))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatepatientinformation(){
        checkdata();
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String sql1="UPDATE HAGER.PATIENT SET PATIENTNAME='"+pn+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql2="UPDATE HAGER.PATIENT SET PATIENTADDRESS='"+paddress+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql3="UPDATE HAGER.PATIENT SET PATIENTPHONENUMBER='"+ppn+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql4="UPDATE HAGER.PATIENT SET PATIENTGENDER='"+pg+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql5="UPDATE HAGER.PATIENT SET PATIENTPASSWORD='"+pnp+"'WHERE PATIENTUSERNAME='"+pu+"'";
        if(flag1==0&&flag2==0&&flag3==0&&flag4==0&&flag5==0&&flag6==1&&flag7==1&&flag8==0){
             
        
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            st.executeUpdate(sql5);
            st.close();
            con.close();

        }
        catch(SQLException e) {

            System.out.println("error");
        }
        confirmation.setText("the information is updated successfully");
        reset();
        }
    
    }
   private void checkdata(){
        flag1=0;
        flag2=0;
        flag3=0;
        flag4=0;
        flag5=0;
        flag6=0;
        flag7=0;
        flag8=0;
           confirmation.setText("");
        checkphonenumber.setText("");
         checkoldpassword.setText("");
         checknewpassword.setText("");
         checkname.setText("");
         checkaddress.setText("");
         checkusername.setText("");
        ppn= phonenumber.getText();
        pg= genderlist.getSelectedItem().toString();
        pop= oldpassword.getText();
        pnp= newpassword.getText();
        pn=name.getText();
        paddress=address.getText();
        pu=username.getText();
        if(ppn.equals("")){
            checkphonenumber.setText("please enter a valid phone number");
            flag1=1;
        }
        if(pop.equals("")){
            checkoldpassword.setText("please choose a password");
            flag2=1;
        }
        if(pnp.equals("")){
            checknewpassword.setText("please choose a password");
            flag8=1;
        }
        if(pn.equals("")){
            checkname.setText("please enter doctor's name");
            flag3=1;
        }
        if(paddress.equals("")){
            checkaddress.setText("please enter doctor's address");
            flag4=1;
        }
        
        if(pu.equals("")){
            checkusername.setText("please choose a username");
            flag5=1;
        }
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String checku="";
        String check="";
         if(flag5==0){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT PATIENTUSERNAME FROM HAGER.PATIENT" ;
           
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("PATIENTUSERNAME");
               if(checku.equals(pu)){
                   flag6=1;
               }
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        }
         if(flag6==0){
             checkusername.setText("unvalid user name");
         }
         if (flag2==0&&flag5==0&&flag6==1){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT PATIENTPASSWORD FROM HAGER.PATIENT WHERE PATIENTUSERNAME = '"+pu+"'";
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             check=  rs.getString("PATIENTPASSWORD");
               System.out.println(check);
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        if(check.equals(pop)){
           flag7=1;
        }
        else
        {  checkoldpassword.setText("wrong password ,please try again");
        }
        }
    }
    private void reset(){
     name.setText("");
        address.setText("");
        username.setText("");
        oldpassword.setText("");
        newpassword.setText("");
        
        phonenumber.setText("");
        genderlist.setSelectedIndex(0);
    }
    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
        updatepatientinformation();
    }//GEN-LAST:event_confirmbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        patientpage p = new patientpage();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(editpatientinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editpatientinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editpatientinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editpatientinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editpatientinformationpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel checkaddress;
    private javax.swing.JLabel checkname;
    private javax.swing.JLabel checknewpassword;
    private javax.swing.JLabel checkoldpassword;
    private javax.swing.JLabel checkphonenumber;
    private javax.swing.JLabel checkusername;
    private javax.swing.JLabel confirmation;
    private javax.swing.JButton confirmbutton;
    private javax.swing.JComboBox<String> genderlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField newpassword;
    private javax.swing.JPasswordField oldpassword;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton returnbutton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
