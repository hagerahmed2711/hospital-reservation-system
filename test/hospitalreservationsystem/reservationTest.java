/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

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
public class reservationTest {
    
    public reservationTest() {
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
     * Test of generatecode method, of class reservation.
     */
    @Test
    public void testGeneratecode() {
        System.out.println("generatecode");
        boolean conn = true;
        reservation instance = new reservation();
        String expResult = "24";
        String result = instance.generatecode(conn);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGeneratecode1() {
        System.out.println("generatecode");
        boolean conn = false;
        reservation instance = new reservation();
        String expResult = "-1";
        String result = instance.generatecode(conn);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of reservation method, of class reservation.
     */
    @Test
    public void testReservation1() {
        System.out.println("reservation1");
        boolean conn = false;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "-1";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
      System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testReservation() {
        System.out.println("reservation");
        boolean conn = true;
        int flag1 = 1;
        int flag2 = 1;
        int flag3 = 1;
        int flag4 = 1;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "25";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
   @Test
    public void testReservation2() {
        System.out.println("reservation2");
        boolean conn = true;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "24";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
       System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   @Test
    public void testReservation3() {
        System.out.println("reservation3");
        boolean conn = true;
        int flag1 = 0;
        int flag2 = 1;
        int flag3 = 1;
        int flag4 = 1;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "25";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   @Test
    public void testReservation4() {
        System.out.println("reservation4");
        boolean conn = true;
        int flag1 = 1;
        int flag2 = 0;
        int flag3 = 1;
        int flag4 = 1;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "25";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   @Test
    public void testReservation5() {
        System.out.println("reservation5");
        boolean conn = true;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 1;
        int flag4 = 0;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "25";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   @Test
    public void testReservation6() {
        System.out.println("reservation6");
        boolean conn = true;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 1;
        String time = "10:00";
        String day = "1";
        String month = "febrauary";
        String year = "2024";
        String patientusername = "salma";
        String doctorusername = "sagda";
        reservation instance = new reservation();
        String expResult = "25";
        String result = instance.reservation(conn, flag1, flag2, flag3, flag4, time, day, month, year, patientusername, doctorusername);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   
}
