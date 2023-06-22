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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class addingdoctorTest {
    
    public addingdoctorTest() {
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
            String sql="DELETE FROM HAGER.DOCTOR WHERE DOCTORUSERNAME='zena2'";
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
    public void testAdding1() {
        System.out.println("test case 1 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding2() {
        System.out.println("test case 2 for adding function");
        String dpn = "010266695786";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding3() {
        System.out.println("test case 3 for adding function");
        String dpn = "";
        String dnid = "29945533622866";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding4() {
        System.out.println("test case 4 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "1234";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding5() {
        System.out.println("test case 5 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "zena";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding6() {
        System.out.println("test case 1 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "cairo";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding7() {
        System.out.println("test case 7 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "female";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding8() {
        System.out.println("test case 8 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "mariam2711";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding9() {
        System.out.println("test case 9 for adding function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testAdding10() {
        System.out.println("test case 10 for adding function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = true;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdding11() {
        System.out.println("test case 9 for adding function");
       String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena22";
        String ds = "surgery";
        boolean connected = false;
        boolean expResult = false;
        boolean result = addingdoctor.adding(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testCheckdata1() {
        System.out.println("test case 1 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata2() {
        System.out.println("test case 2 for checkdata function");
       String dpn = "010266695786";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata3() {
        System.out.println("test case 3 for checkdata function");
       String dpn = "";
        String dnid = "29945533622866";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata4() {
        System.out.println("test case 4 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "1234";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata5() {
        System.out.println("test case 5 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "zena";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata6() {
        System.out.println("test case 6 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "cairo";
        String dg = "";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata7() {
        System.out.println("test case 7 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "female";
        String du = "";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata8() {
        System.out.println("test case 8 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "mariam2";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckdata8i() {
        System.out.println("test case 8 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "mariam2711";
        String ds = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata9() {
        System.out.println("test case 9 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata10() {
        System.out.println("test case 10 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena23";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = true;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckdata11() {
        System.out.println("test case 11 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = false;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckdata12() {
        System.out.println("test case 12 for checkdata function");
        String dpn = "";
        String dnid = "";
        String dp = "";
        String dn = "";
        String daddress = "";
        String dg = "";
        String du = "";
        String ds = "select";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata13() {
        System.out.println("test case 13 for checkdata function");
        String dpn = "";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata14() {
        System.out.println("test case 14 for checkdata function");
        String dpn = "01022265986";
        String dnid = "";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata15() {
        System.out.println("test case 1 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata16() {
        System.out.println("test case 16 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata17() {
        System.out.println("test case 17 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "";
        String dg = "female";
        String du = "zena2";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata18() {
        System.out.println("test case 18 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "mariam2711";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckdata19() {
        System.out.println("test case 14 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata20() {
        System.out.println("test case 20 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "zena";
        String daddress = "cairo";
        String dg = "female";
        String du = "zena2";
        String ds = "select";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata21() {
        System.out.println("test case 21 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "hager";
        String daddress = "cairo";
        String dg = "female";
        String du = "hager2711";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckdata22() {
        System.out.println("test case 22 for checkdata function");
        String dpn = "01022265986";
        String dnid = "29965533266588";
        String dp = "1234";
        String dn = "mariam";
        String daddress = "cairo";
        String dg = "female";
        String du = "ADMIN";
        String ds = "surgery";
        boolean connected = true;
        boolean expResult = false;
        boolean result = addingdoctor.checkdata(dpn, dnid, dp, dn, daddress, dg, du, ds, connected);
        assertEquals(expResult, result);
        
    }
    
}
