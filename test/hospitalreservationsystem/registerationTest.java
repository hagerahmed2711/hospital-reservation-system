
package hospitalreservationsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.client.am.SqlException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class registerationTest {
    
    public registerationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
   
    @AfterClass
    public static void tearDownClass() {
        System.out.println("done");
        String url="jdbc:derby://localhost:1527/HOSPITALRESERVATIONSYSTEMDATABASE";
        String user="HAGER";
        String password="HAGER";
        
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
            String sql="DELETE FROM HAGER.PATIENT WHERE PATIENTUSERNAME='hager2'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();

        }
        catch(SQLException e) {

            System.out.println("error");
        }
    }

   
    
   
    @Test
    public void testRegister1() {
        System.out.println("test case 1 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRegister2() {
        System.out.println("test case 2 for register function");
        
        String ppn = "01022245953";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister3() {
        System.out.println("test case 3 for register function");
        
        String ppn = "";
        String pnid = "29956622522822";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister4() {
        System.out.println("test case 4 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "1234";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister5() {
        System.out.println("test case 5 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "hager";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister6() {
        System.out.println("test case 6 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "cairo ,egypt";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister7() {
        System.out.println("test case 7 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "female";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py, connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister8() {
        System.out.println("test case 8 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "hager2711";
        String pd = "";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister9() {
        System.out.println("test case 9 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "20";
        String pm = "";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister10() {
        System.out.println("test case 10 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "december";
        String py = "";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegister11() {
        System.out.println("test case 11 for register function");
        
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "2000";
        boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRegister12() {
        System.out.println("test case 12 for register function");
        
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "20";
        String pm = "december";
        String py = "1999";
        boolean connected =true;
       boolean expectedoutput = true;
       boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRegister13() {
        System.out.println("test case 13 for register function");
        
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager22";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
        boolean connected =false;
        boolean expectedoutput = false;
        boolean result= registeration.register( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testcheckdata1() {
        System.out.println("test case 1 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
       boolean expectedoutput = false;
        boolean connected =true;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata2() {
        System.out.println("test case 2 for checkdata function");
        String ppn = "01022245953";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata3() {
        System.out.println("test case 3 for checkdata function");
        String ppn = "";
        String pnid = "29956622522822";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata4() {
        System.out.println("test case 4 for checkdata function");
        String ppn = "";
        String pnid = "";
        String pp = "1234";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata5() {
        System.out.println("test case 5 for checkdata function");
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "hager";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata6() {
        System.out.println("test case 6 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "cairo ,egypt";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata7() {
        System.out.println("test case 7 for checkdata function");
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "female";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata8() {
        System.out.println("test case 8 for checkdata function");
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "hager2711";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testcheckdata8i() {
        System.out.println("test case 8 for checkdata function");
        String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "hager2";
        String pd = "";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata9() {
        System.out.println("test case 9 for checkdata function");
         String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "20";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata10() {
        System.out.println("test case 10 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "december";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata11() {
        System.out.println("test case 11 for checkdata function");
         String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "2000";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testcheckdata12() {
        System.out.println("test case 12 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager23";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = true;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testcheckdata13() {
        System.out.println("test case 13 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "day";
        String pm = "month";
        String py = "year";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testcheckdata13i() {
        System.out.println("test case 13 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "day";
        String pm = "";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testcheckdata14() {
        System.out.println("test case 14 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "month";
        String py = "";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testcheckdata15() {
        System.out.println("test case 15 for checkdata function");
       String ppn = "";
        String pnid = "";
        String pp = "";
        String pn = "";
        String paddress = "";
        String pg = "";
        String pu = "";
        String pd = "";
        String pm = "";
        String py = "year";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testcheckdata16() {
        System.out.println("test case 16 for checkdata function");
        String ppn = "";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata17() {
        System.out.println("test case 17 for checkdata function");
        String ppn = "01022265849";
        String pnid = "";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata18() {
        System.out.println("test case 18 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata19() {
        System.out.println("test case 19 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata20() {
        System.out.println("test case 20 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata21() {
        System.out.println("test case 21 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "nada";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "nada25";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testcheckdata22() {
        System.out.println("test case 22 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata23() {
        System.out.println("test case 23 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "day";
        String pm = "december";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata24() {
        System.out.println("test case 24 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "month";
        String py = "1999";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata25() {
        System.out.println("test case 25 for checkdata function");
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager2";
        String pd = "monday";
        String pm = "december";
        String py = "year";
         boolean connected =true;
       boolean expectedoutput = false;
       boolean result= registeration.checkdata( ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
       assertEquals(expectedoutput, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testcheckdata26() {
        System.out.println("test case 26 for checkdata function");
        
        String ppn = "01022265849";
        String pnid = "29912200166899";
        String pp = "1234";
        String pn = "hager";
        String paddress = "cairo,egypt";
        String pg = "female";
        String pu = "hager22";
        String pd = "monday";
        String pm = "december";
        String py = "1999";
        boolean connected =false;
        boolean expectedoutput = false;
        boolean result= registeration.checkdata(ppn, pnid, pp, pn, paddress, pg, pu, pd, pm, py,connected);
        assertEquals(expectedoutput, result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
