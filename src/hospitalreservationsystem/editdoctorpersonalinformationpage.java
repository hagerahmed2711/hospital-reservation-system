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
public class editdoctorpersonalinformationpage extends javax.swing.JFrame {

    /**
     * Creates new form editdoctorpersonalinformationpage
     */
     private static int flag1=0;
    private static int flag2=0;
   private static int flag3=0;
    private static int flag4=0;
    private static int flag5=0;
    private static int flag6=0;
   private static int flag7=0;
 
    
    private static String dpn=""; //dpn: doctor phone number
   
    private static String dp=""; // doctot password
    private static String dn=""; //doctorname
    private static String daddress=""; //doctor address
    private static String dg=""; //doctor gender
    private static String du=""; // doctor user name
    
    public editdoctorpersonalinformationpage() {
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
        password = new javax.swing.JPasswordField();
        checkusername = new javax.swing.JLabel();
        checkpassword = new javax.swing.JLabel();
        checkname = new javax.swing.JLabel();
        checkaddress = new javax.swing.JLabel();
        checkphonenumber = new javax.swing.JLabel();
        confirmation = new javax.swing.JLabel();
        resetbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalreservationsystem/2022-12-18 (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 550, 560));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("enter your current user name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("enter your current password");

        jLabel4.setFont(new java.awt.Font("Harrington", 3, 24)); // NOI18N
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
        returnbutton.setText("return to doctor page");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        confirmation.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        confirmation.setForeground(new java.awt.Color(255, 51, 51));

        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbutton.setText("reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkusername, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderlist, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phonenumber, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name)
                                    .addComponent(address))
                                .addGap(62, 62, 62))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmbutton)
                                .addGap(43, 43, 43)
                                .addComponent(resetbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(returnbutton)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(checkaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(checkphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(genderlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmation, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmbutton)
                    .addComponent(returnbutton)
                    .addComponent(resetbutton))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkdata(){
        flag1=0;
        flag2=0;
        flag3=0;
        flag4=0;
        flag5=0;
        flag6=0;
        flag7=0;
        confirmation.setText("");
        checkphonenumber.setText("");
         checkpassword.setText("");
         checkname.setText("");
         checkaddress.setText("");
         checkusername.setText("");
        dpn= phonenumber.getText();
        dg= genderlist.getSelectedItem().toString();
        dp= password.getText();
        dn=name.getText();
        daddress=address.getText();
        du=username.getText();
        if(dpn.equals("")){
            checkphonenumber.setText("please enter a valid phone number");
            flag1=1;
            System.out.println(flag1); //done

        }
        if(dp.equals("")){
            checkpassword.setText("please choose a password");
            flag2=1;
        }
        if(dn.equals("")){
            checkname.setText("please enter doctor's name");
            flag3=1;
                        System.out.println(flag3); //done

        }
        if(daddress.equals("")){
            checkaddress.setText("please enter doctor's address");
            flag4=1;
            System.out.println(flag4); //done

        }
        
        if(du.equals("")){
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
            String s="SELECT DOCTORUSERNAME FROM HAGER.DOCTOR" ;
           
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("DOCTORUSERNAME");
               if(checku.equals(du)){
                   flag6=1;
               }
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error1");
        }
        }
         if(flag6==0){
             checkusername.setText("unvalid user name");
         }
         if (flag2==0&&flag5==0&&flag6==1){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT DOCTORPASSWORD FROM HAGER.DOCTOR WHERE DOCTORUSERNAME = '"+du+"'";
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             check=  rs.getString("DOCTORPASSWORD"); //to show password by f2,f5,f6
               System.out.println(check);
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error2");
        }
        if(check.equals(dp)){
           flag7=1;
            System.out.println(flag7); //done
        }
        else
        {  checkpassword.setText("wrong password ,please try again");
        }
        }
    }
    private void updatedoctorpersonalinformation(){
        checkdata();
        editdoctorpersonalinformation a = new editdoctorpersonalinformation(this.du, this.dp , this.dn , this.dpn ,this.daddress,this.dg) ; //String du , String dp ,String dpn ,String dn ,String daddress,String dg
        a.updatedoctorpersonalinformation();
        /*String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        
         //String sql="UPDATE HAGER.ADMIN SET ADMINPASSWORD='"+this.newpassword+"'WHERE ADMINUSERNAME='ADMIN'";
        String sql1="UPDATE HAGER.DOCTOR SET DOCTORNAME='"+this.dn+"'WHERE DOCTORUSERNAME='"+du+"'";
        String sql2="UPDATE HAGER.DOCTOR SET DOCTORADDRESS='"+this.daddress+"'WHERE DOCTORUSERNAME='"+du+"'";
        String sql3="UPDATE HAGER.DOCTOR SET DOCTORPHONENUMBER='"+this.dpn+"'WHERE DOCTORUSERNAME='"+du+"'";
        String sql4="UPDATE HAGER.DOCTOR SET DOCTORGENDER='"+this.dg+"'WHERE DOCTORUSERNAME='"+du+"'";
        if(flag1==0&&flag2==0&&flag3==0&&flag4==0&&flag5==0&&flag6==1&&flag7==1){
             
        
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            st.close();
            con.close();
            System.out.println("iam here");
        }
        catch(SQLException e) {
            
            System.out.println("error3");
        } 
        */
        confirmation.setText("the information is updated successfully");
        reset(); 
        }
    
    
    private void reset(){
     name.setText("");
        address.setText("");
        username.setText("");
        password.setText("");
        phonenumber.setText("");
        genderlist.setSelectedIndex(0);
        
    }
    
    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
        updatedoctorpersonalinformation();
    }//GEN-LAST:event_confirmbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        doctorpage p = new doctorpage();
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
            java.util.logging.Logger.getLogger(editdoctorpersonalinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editdoctorpersonalinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editdoctorpersonalinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editdoctorpersonalinformationpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editdoctorpersonalinformationpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel checkaddress;
    private javax.swing.JLabel checkname;
    private javax.swing.JLabel checkpassword;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton returnbutton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
