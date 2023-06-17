/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Lenovo
 */
public class HospitalReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         homepage p= new homepage();
            p.setVisible(true);
            
    }
    
}
class dele{

    public String del(String doctorusrname,boolean conn)
        {
         String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String u=doctorusrname;
        try{  if(conn==false){throw new SQLException();}
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
               return doctorusrname;
    }
}
