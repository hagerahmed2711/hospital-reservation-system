
package hospitalreservationsystem;

import java.sql.SQLException;


public class registeration {
  

 
   
     public static boolean register(String ppn ,String pnid,String pp,String pn,String paddress,String pg,String pu,String pd,String pm,String py, boolean connected) {
       registerationpage rp =new registerationpage();
        registeration rr= new registeration();
        boolean checking= false;
        checking= rr.checkdata(ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py , true);
        if(checking){
        try{
            if (connected==false){
                throw new SQLException();
            
            }
            databaseconnection.patientinsertion(ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py);

        }
        catch(SQLException e) {

            System.out.println("error");
            return false;
        }
        
        return true;
        }
        else {
            return false;
        }
    }
     
     
     public static boolean checkdata(String ppn ,String pnid,String pp,String pn,String paddress,String pg,String pu,String pd,String pm,String py , boolean connected){
       
        
        int flag1=0;
        int flag2=0;
        int flag3=0;
        int flag4=0;
        int flag5=0;
        int flag6=0;
        int flag7=0;
        int flag8=0;
        if(ppn.equals("")){
            
            flag1=1;
        }
        if(pd.equals("day")||pm.equals("month")||py.equals("year")){
            
            flag3=1;
        }
        
        if(pnid.equals("")){
            
            flag2=1;
        }
        
        if(pp.equals("")){
           
            flag4=1;
        }
        if(pn.equals("")){
            
            flag5=1;
        }
        if(paddress.equals("")){
            
            flag6=1;
        }
        
        if(pu.equals("")){
           
            flag7=1;
        }
        
         if(flag7==0){
        try{
            if (connected==false){
                throw new SQLException();
            
            }
            flag8=databaseconnection.isexist(pu);
         
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
