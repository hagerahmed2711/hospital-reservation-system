package hospitalreservationsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class Edit_patient_information {
    
   editpatientinformationpage object1 = new editpatientinformationpage();
   
    
    private  String pnp=""; // patient new password
    private  String pop=""; // patient old password
    private  String pu=""; //patient username 
    private  String pn=""; //patient name
    private  String paddress=""; // patient address
    private  String ppn=""; //patientphone number
    private  String pg=""; //patient gender
      
    
    private  int flag1=0;
    private  int flag2=0;
    private  int flag3=0;
    private  int flag4=0;
    private  int flag5=0;
    private  int flag6=0;
    private  int flag7=0;
    private  int flag8=0;
    //constractor
    Edit_patient_information(String pnp,String pop,String pu,String paddress,String ppn, String pn, boolean connected){
          this.pnp=pnp;
        this.pop=pop;
         this.pu=paddress;
         this.pu=ppn;
         this.pg=pg;
         this.pn=pn;
         this.connected =connected ;
      
    }
    
       
 
      String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        boolean connected ;
   
      public static boolean check_data(String ppn , String pop , String pnp , String pn , String paddress ,String pu,boolean connected){
      int flag1=0;
      int  flag2=0;
      int flag3=0;
      int  flag4=0;
      int  flag5=0;
      int  flag6=0;
      int  flag7=0;
      int  flag8=0;
      
       if(ppn.equals("")){
             flag1=1;
             System.out.println("please enter a valid phone number");
        }
        if(pop.equals("")){
             flag2=1;
                  System.out.println("please choose a password");
        }
        if(pnp.equals("")){
             flag8=1;
                  System.out.println("please choose a password");
        }
        if(pn.equals("")){
             flag3=1;
                  System.out.println("please enter doctor's name");
        }
        if(paddress.equals("")){
             flag4=1;
                  System.out.println("please enter doctor's address");
        }
        
        if(pu.equals("")){
             flag5=1;
                  System.out.println("please choose a username");
        }
        
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String checku="";
        String check="";
        
         
         if(flag5==0){   //if patient username is entered and not empty
        try{
            
            if(connected==false){
            throw new SQLException ();
            }
            
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
          throw new SQLException("ERROR");
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        }
         if(flag6==0){
             System.out.println("unvalid user name");
         }
           if(check.equals(pop)){
           flag7=1;
        }
        
         if (flag2==0&&flag5==0&&flag6==1){
        
            try{
                
            if(connected==false){
            throw new SQLException ();
            }
                
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
          throw new SQLException("ERROR");
        }
        catch(SQLException e) {
            
            System.out.println("error");
        }
        if(check.equals(pop)){
           flag7=1;
        }
        else
        {  System.out.println("wrong password ,please try again");
        }
        }
         if (flag6==1&&flag1==0 &&flag3==0&&flag8==0&&flag4==0&&flag7==1&&flag2==0&&flag5==0){  // verifying that patient enter a passord(not empty) and valid username in db
        try{
            
            if(connected==false){
            throw new SQLException ();
            }
            
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
           
          
        //  throw new SQLException("ERROR");
          return true ;
        }
        catch(SQLException e) {
            
            System.out.println("error");
            return false ;
        }
       
        }
         else
          System.out.println("wrong password ,please try again");
        
         return false ;
    }
      
      public  boolean EditPatientInformation(String pnp,String pop,String pu,String paddress,  String ppn,  String pg){
    
        boolean checking=false ;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        if(checking==true){
              String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        String sql1="UPDATE HAGER.PATIENT SET PATIENTNAME='"+pn+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql2="UPDATE HAGER.PATIENT SET PATIENTADDRESS='"+paddress+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql3="UPDATE HAGER.PATIENT SET PATIENTPHONENUMBER='"+ppn+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql4="UPDATE HAGER.PATIENT SET PATIENTGENDER='"+pg+"'WHERE PATIENTUSERNAME='"+pu+"'";
        String sql5="UPDATE HAGER.PATIENT SET PATIENTPASSWORD='"+pnp+"'WHERE PATIENTUSERNAME='"+pu+"'";
       try{
           /*if(connected == false){
          throw new SQLException ();
           }
           */
           Connection con = DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            st.executeUpdate(sql5);
            st.close();
            con.close();

           
            throw new SQLException("ERROR");
           }
    
           
        
        
        catch(SQLException e) {

            System.out.println("error");
          
              return false ;
        }
      // return true ;
        }
     else
      return false ;
          }
    
    
 

     
      public static void main (String args[]){
    
     String pnp=""; // patient new password
     String pop=""; // patient old password
     String pu=""; //patient username 
     String pn=""; //patient name
     String paddress=""; // patient address
     String ppn=""; //patientphone number
     String pg=""; //patient gender
       boolean connected = true ;
          
       // System.out.println("output of check data "+ Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected));
        Edit_patient_information object = new  Edit_patient_information(pnp, pop, pnp, pu, paddress, ppn, true);
         //System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation(pnp, pop, pu, paddress, ppn, pn, connected));
         
         // System.out.println("Output of EditPatientInformation function "+object.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg));
     System.out.println("output of check data "+ Edit_patient_information.check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true));

      }

}
 