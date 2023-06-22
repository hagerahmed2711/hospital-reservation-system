package hospitalreservationsystem;
import java.sql.SQLException;
public class addingdoctor {
    public static boolean adding(String dpn, String dnid , String dp , String dn, String daddress , String dg , String du , String ds, boolean connected){
        addingdoctor h = new addingdoctor();
        doctoraddingpage p = new doctoraddingpage();
        boolean checking= false;
        checking=h.checkdata( dpn,  dnid ,  dp ,  dn,  daddress , dg , du ,  ds, true);
        if(checking){
        try{
            if (connected==false){
                throw new SQLException();
            
            }
            databaseconnection.doctorinsertion(dpn, dnid, dp, dn, daddress, dg, du, ds);

         }
          catch(SQLException e) {

            System.out.println("error");
            return false ;
          }
        
          return true;
          }
        
         else {
            return false;
        
         }
    
     }
    
    public static boolean checkdata(String dpn, String dnid , String dp , String dn, String daddress , String dg , String du , String ds , boolean connected){
        int flag1=0;
        int flag2=0;
        int flag3=0;
        int flag4=0;
        int flag5=0;
        int flag6=0;
        int flag7=0;
        int flag8=0;        
        
        if(dpn.equals("")){
            
            flag1=1;
        }
        if(ds.equals("select")){
            
            flag3=1;
        }
        
        if(dnid.equals("")){
            
            flag2=1;
        }
        
        if(dp.equals("")){
            
            flag4=1;
        }
        if(dn.equals("")){
            
            flag5=1;
        }
        if(daddress.equals("")){
            
            flag6=1;
        }
        
        if(du.equals("")){
           
            flag7=1;
        }
        String checku="";
         if(flag7==0){
        try{
            if (connected==false){
                throw new SQLException();
            
            }
            flag8=databaseconnection.isexist(du);
          
        }
        catch(SQLException e) {
            
            System.out.println("error");
            return false;
        }
        }
         if(flag1==0&&flag2==0&&flag3==0&&flag4==0&&flag5==0&&flag6==0&&flag7==0&&flag8==0)
             return true;
         else 
             return false;
    }
  
}
