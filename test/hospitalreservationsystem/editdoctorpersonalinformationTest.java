/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Me
 */
public class editdoctorpersonalinformationTest {
    
    public editdoctorpersonalinformationTest() {
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


    @Test
    public void testUpdatedoctorpersonalinformation() {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "000" , "kinda" , "01552334","ciroo","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("kinda");
        expResult.add("01552334");
        expResult.add("ciroo");
        expResult.add("female");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertEquals(expResult, result);
      
    }
    
   
    @Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation2() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("","","","","","")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
      
    }
    
    
    
@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation3() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "111" ,"kinda" , "01552334","ciroo","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
        
    }




@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation4() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh6", "000" ,"kinda" , "01552334","ciroo","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
        
    }


@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation5() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("", "000" , "kinda" , "01552334","ciroo","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
        
    }

@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation6() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "" , "kinda" , "01552334","ciroo","female")    ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);}
//
@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation7() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "000" , "" , "01552334","ciroo","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
        
    }
//
@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation8() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "000" , "kinda" ,"","ciro","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
        
    }
@Test(expected=UnsupportedOperationException.class)
public void testUpdatedoctorpersonalinformation9() throws UnsupportedOperationException {
        System.out.println("updatedoctorpersonalinformation");
        editdoctorpersonalinformation instance = new editdoctorpersonalinformation("noh5", "000" , "kinda" , "015567","","female")   ;
        ArrayList<String> expResult = new ArrayList () ; 
        expResult.add("");
        expResult.add("");
        expResult.add("");
        expResult.add("");
        ArrayList result = instance.updatedoctorpersonalinformation();
        assertTrue(expResult, result);
     
    }

    private void assertTrue(ArrayList<String> expResult, ArrayList result) {
        throw new UnsupportedOperationException("Not supported yet."); }}
