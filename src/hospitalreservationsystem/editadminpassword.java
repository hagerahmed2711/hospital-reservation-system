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
    private String newpassword ;
    
    public editadminpassword(String newpassword) {
        this.newpassword = newpassword;
    }
    
    
    
    public String  editpassword(){
        String check = " " ; 
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
            String sql="UPDATE HAGER.ADMIN SET ADMINPASSWORD='"+this.newpassword+"'WHERE ADMINUSERNAME='ADMIN'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            //st.close();
            //con.close();
            
            
            //Connection con = DriverManager.getConnection(url, user, password);
            String s="SELECT ADMINPASSWORD FROM HAGER.ADMIN WHERE ADMINUSERNAME ='ADMIN'" ;
           // System.out.println("connected");
           Statement st2= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(s);
           while(rs.next()){
             check=  rs.getString("ADMINPASSWORD");

              //System.out.println(check);
              

           }
           
           
           rs.close();
           st.close();
           con.close();
           
        }


        
        catch(SQLException e) {

            System.out.println("error");
        }
        
        return check ; 

    }
    
    
    public static void main(String args[]) { 
    editadminpassword a = new editadminpassword("Ahd1234") ;
     System.out.println(a.editpassword()) ; 
    
    }
    
    
    
    
    
    
}
