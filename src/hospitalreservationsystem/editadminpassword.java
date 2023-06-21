/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import hospitalreservationsystem.editadminpasswordpage ; 
package hospitalreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Me
 */
class editadminpassword {
    
    private String p ;
    private String cp ;
     private int flag1 = 0 ;
     private int flag2 = 0 ;
     private int flag3 = 0 ;


    public editadminpassword(String p , String cp ) {
        this.p = p;
        this.cp = cp ;
        
    }
    
    
     private void checkdata(){
        
        if(p.equals("")){
            System.out.print("please enter your new password");
            flag1=1;
        }
        if(cp.equals("")){
             System.out.println("please re-enter your password");
            flag2=1;
        }
        if(flag1==0&&flag2==0){
        if(p.equals(cp)){
            flag3=1;
        }
        else  System.out.print("please try re-entering your password");
        } }  
   
    
   
    
    
    
    
    public String  editpassword(){
    checkdata() ;
        
        String check = "" ;

        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        if (flag1==0 &&flag2==0&&flag3==1) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
            String sql="UPDATE HAGER.ADMIN SET ADMINPASSWORD='"+this.p+"'WHERE ADMINUSERNAME='ADMIN'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            
            
            
            String s="SELECT ADMINPASSWORD FROM HAGER.ADMIN WHERE ADMINUSERNAME ='ADMIN'" ;
           Statement st2= con.createStatement();
           ResultSet rs= null;
           rs=st2.executeQuery(s);
           while(rs.next()){
             check = rs.getString("ADMINPASSWORD");

              
              }
           
           
           rs.close();
           st.close();
           con.close(); 
          throw new SQLException("check list not right");

           
        }
        catch(SQLException e) {
            

            System.out.println("error");
            
        }}
        else System.out.println("error"); 
     
   
             return check ;}}
    
    
    
    
    
    

