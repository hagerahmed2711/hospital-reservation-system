/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Me
 */
public class editdoctorpersonalinformation {
    private  int flag1=0;
    private  int flag2=0;
    private  int flag3=0;
    private  int flag4=0;
    private  int flag5=0;
    private  int flag6=0;
    private  int flag7=0;
    private  String dpn=""; //dpn: doctor phone number
    private  String dp=""; // doctot password
    private  String dn=""; //doctorname
    private  String daddress=""; //doctor address
    private  String dg=""; //doctor gender
    private  String du="";
    
    public editdoctorpersonalinformation(String du , String dp ,String dn ,String dpn ,String daddress,String dg) {
        this.dp = dp ; 
        this.du = du ; 
        this.dpn = dpn ;
        this.dn = dn ;
        this.daddress = daddress ;
        this.dg = dg ; }
    
    public int check() {
        
       if(dpn.equals("")){
            System.out.println("please enter a valid phone number");
            flag1=1;
            System.out.println(flag1); //done

        }
        if(dp.equals("")){
            System.out.println("please choose a password");
            flag2=1;
        }
        if(dn.equals("")){
            System.out.println("please enter doctor's name");
            flag3=1;
            System.out.println(flag3); //done

        }
        if(daddress.equals("")){
            System.out.println("please enter doctor's address");
            flag4=1;
            System.out.println(flag4); //done

        }
        
        if(du.equals("")){
            System.out.println("please choose a username");
            flag5=1;
        }
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String checku="";
        String check="";
        
        if(flag5==0) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT DOCTORUSERNAME FROM HAGER.DOCTOR" ;
           
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             checku= rs.getString("DOCTORUSERNAME");
               if(checku.equals(du)){
                   flag6=1;
               }
           }
           rs.close();
           st.close();
           con.close();
           throw new SQLException("check list not right");

         
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        }
        if(flag6==0){
             System.out.print("unvalid user name");
        }
        
        if (flag2==0&&flag5==0&&flag6==1){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT DOCTORPASSWORD FROM HAGER.DOCTOR WHERE DOCTORUSERNAME = '"+du+"'";
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             check=  rs.getString("DOCTORPASSWORD");
               System.out.println(check);
           }
           rs.close();
           st.close();
           con.close();
           throw new SQLException("check list not right");

         
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        if(check.equals(dp)){
           flag7=1;
        }
        else
        {  System.out.println("wrong password ,please try again");
        }
        
        
        }
        return 0 ;}

    public ArrayList updatedoctorpersonalinformation(){
        check();
         
        ArrayList<String> ls = new ArrayList<String>();

        String checkname= "" ;
        String checkaddress = "" ; 
        String checkphone = " " ; 
        String checkgender = "" ; 
        
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        
        String sql1="UPDATE HAGER.DOCTOR SET DOCTORNAME='"+this.dn+"'WHERE DOCTORUSERNAME='"+du+"'"; //
        String sql2="UPDATE HAGER.DOCTOR SET DOCTORADDRESS='"+this.daddress+"'WHERE DOCTORUSERNAME='"+du+"'";
        String sql3="UPDATE HAGER.DOCTOR SET DOCTORPHONENUMBER='"+this.dpn+"'WHERE DOCTORUSERNAME='"+du+"'";
        String sql4="UPDATE HAGER.DOCTOR SET DOCTORGENDER='"+this.dg+"'WHERE DOCTORUSERNAME='"+du+"'";
        if(flag1==0&&flag2==0&&flag3==0&&flag4==0&&flag5==0&&flag6==1&&flag7==1){
            try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            System.out.println("iam here");
            String dinformation="SELECT DOCTORNAME , DOCTORADDRESS ,DOCTORPHONENUMBER,DOCTORGENDER FROM HAGER.DOCTOR WHERE DOCTORUSERNAME = '"+du+"'";
           
            ResultSet rs1= null;
            rs1=st.executeQuery(dinformation);

            while(rs1.next()){
             checkname =  rs1.getString("DOCTORNAME");
             ls.add(checkname) ;
             checkphone = rs1.getString("DOCTORPHONENUMBER") ;
             ls.add(checkphone) ;
             checkaddress = rs1.getString("DOCTORADDRESS");
             ls.add(checkaddress) ;
             
             checkgender = rs1.getString("DOCTORGENDER");
             ls.add(checkgender) ; 
             
             System.out.println(checkname);
             System.out.println(checkaddress);
             System.out.println(checkphone);
             System.out.println(checkgender);


            }
           rs1.close();
           st.close();
           con.close();
           throw new SQLException("sql error");  
            }
           catch(SQLException e) {
               
            
            System.out.println("error3");
            
           }
       
        }
        System.out.print("the information is updated successfully");
         
       
        
    return  ls ; 
    }
    
    
     
//     public static void main(String args[]) { 
//    editdoctorpersonalinformation a = new editdoctorpersonalinformation("noh5", "000" , "sheim" , "01552334" ,"ciroo","female") ; //String du , String dp ,String dpn ,String dn ,String daddress,String dg
//    
//    System.out.print(a.updatedoctorpersonalinformation());
//     
//     
//
//
//    
//    }
//    
    
}
        
    
    

