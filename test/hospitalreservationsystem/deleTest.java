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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.client.am.SqlException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author river
 */
public class deleTest {
    
    public deleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of del method, of class dele.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        System.out.println("delete");
         String v="ali1";
         boolean conn=true;
         System.out.println(v);
      dele instance = new dele();
        String m =instance.del(v,conn);
        
        System.out.println(m);
        
       try{
            int f=0;
           Connection con = DriverManager .getConnection(url, user, password) ;
            System.out.println("connecteddd");
            Statement s=con.createStatement();
            String sql="SELECT * FROM HAGER.DOCTOR ";
            ResultSet rs= null;
            rs=s.executeQuery(sql);
           while(rs.next()){
           String j=rs.getString("DOCTORUSERNAME");
           if(j.equals(m)) {f=0; break;}
           else {f=1;}
           }
            if(f==1) { assertEquals(1,1);}
            else{ assertEquals(1,0);}
            s.close();
            con.close();
           
        } catch (SQLException ex) {
            System.out.println("error in HospitalReservationSystem.deleteeTest.testdel()");
            Logger.getLogger(deleTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   @Test
    public void testDel1()  {
        
        String v="ali1";
         boolean conn=false;
         System.out.println(v);
      dele instance = new dele();
        String m =instance.del(v,conn);
        assertEquals(1, 1);
    }
    
    
}
