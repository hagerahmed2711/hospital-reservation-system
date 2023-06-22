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

/**
 *
 * @author Lenovo
 */
public class databaseconnection {
    
    public static Statement getstatment() throws SQLException{
       Connection con =getconnection();
       Statement st= con.createStatement();
       return st;
    }
   
  
    public static Connection getconnection() throws SQLException{
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }
    public static int isexist(String u )throws SQLException{
        databaseconnection d= new databaseconnection();
        Statement st= d.getstatment();
        ResultSet rs= null;
        String checku="";
        int flag=0;
        String s="SELECT PATIENTUSERNAME FROM HAGER.PATIENT" ;
        rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("PATIENTUSERNAME");
               if(checku.equals(u)){
                   flag=1;
               }
           }
        s="SELECT DOCTORUSERNAME FROM HAGER.DOCTOR" ;
        rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("DOCTORUSERNAME");
               if(checku.equals(u)){
                   flag=1;
               }
           }
        s="SELECT ADMINUSERNAME FROM HAGER.ADMIN" ;
        rs=st.executeQuery(s);
           while(rs.next()){
             checku=  rs.getString("ADMINUSERNAME");
               if(checku.equals(u)){
                   flag=1;
               }
           }
        
       return flag; 
    }
    public static void doctorinsertion(String dpn,String  dnid ,String  dp , String dn,String  daddress ,String dg ,String du ,String  ds)throws SQLException{
        String sql= "INSERT INTO HAGER.DOCTOR(DOCTORPHONENUMBER,DOCTORNATIONAlID,DOCTORPASSWORD,DOCTORNAME,DOCTORADDRESS,DOCTORGENDER,DOCTORUSERNAME,DOCTORSPECIALIZATION) VALUES('"+dpn+"','"+dnid+"','"+dp+"','"+dn+"','"+daddress+"','"+dg+"','"+du+"','"+ds+"')";
           Connection con =databaseconnection.getconnection();
           Statement st=databaseconnection.getstatment();
            st.executeUpdate(sql);
            st.close();
            con.close();
    }
    
    public static void patientinsertion(String ppn ,String pnid,String pp,String pn,String paddress,String pg,String pu,String pd,String pm,String py)throws SQLException{
        String sql= "INSERT INTO HAGER.PATIENT(PATIENTPHONENUMBER,PATIENTNATIONAlID,PATIENTPASSWORD,PATIENTNAME,PATIENTADDRESS,PATIENTGENDER,PATIENTUSERNAME,PATIENTBIRTHDAY,PATIENTBIRTHMONTH,PATIENTBIRTHYEAR) VALUES('"+ppn+"','"+pnid+"','"+pp+"','"+pn+"','"+paddress+"','"+pg+"','"+pu+"','"+pd+"','"+pm+"','"+py+"')";
           Connection con =databaseconnection.getconnection();
           Statement st=databaseconnection.getstatment();
            st.executeUpdate(sql);
            st.close();
            con.close();
    }
    
}
