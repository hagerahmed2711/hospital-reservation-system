/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author river
 */
public class reservation {
    public String code="";
    
    public String generatecode(boolean conn ){
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
       String check="";
       
        try{   if(conn==false){   throw new SQLException();}
            Connection con = DriverManager.getConnection(url, user, password);
            String a="SELECT RESERVATIONCODE FROM HAGER.APPOINTMENTS";
           // System.out.println("connected");
           Statement st= con.createStatement();
           ResultSet rs= null;
           rs=st.executeQuery(a);
           while(rs.next()){
             check=  rs.getString("RESERVATIONCODE");
               
           }
           rs.close();
           st.close();
           con.close();
         
        }
        catch(SQLException e) {
            
            System.out.println("error");
            return "-1";
                    }
        int h= Integer.parseInt(check);
        h=h+1;
        code = h+"";
        
        return code;
    
    }
    public String reservation(boolean conn, int flag1,int flag2,int flag3,int flag4, String time ,String day,String month,String year,String patientusername,String doctorusername){
        
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
         code = generatecode(true);
        if(flag1==0&&flag2==0&&flag3==0&&flag4==0){
            try{    if(conn==false){throw new SQLException();}
            Connection con = DriverManager.getConnection(url, user, password);
            
            String sql= "INSERT INTO HAGER.APPOINTMENTS(DOCTORUSERNAME,PATIENTUSERNAME,RESERVATIONYEAR,RESERVATIONMONTH,RESERVATIONDAY,RESERVATIONCODE,RESERVATIONTIME,RESERVATIONATTENDANCE) VALUES('"+doctorusername+"','"+patientusername+"','"+year+"','"+month+"','"+day+"','"+code+"','"+time+"','false')";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();

        }
        catch(SQLException e) {

            System.out.println("error");
            return "-1";
        }
    
        }
        return code;
}
}



