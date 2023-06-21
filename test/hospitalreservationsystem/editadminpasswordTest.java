/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

import java.sql.SQLException;
import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.ComparisonFailure;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;

/**
 *
 * @author Me
 */
public class editadminpasswordTest {
    
    public editadminpasswordTest() {
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
    public void testEditpassword1() {

        System.out.println("editpassword");
        editadminpassword instance = new editadminpassword("jona" ,"jona" ) ;
        
        
        String expResult = "jona";
        String result = instance.editpassword();
        assertEquals(expResult, result);
        System.out.println(result);

    }
    
    
    @Test(expected=ComparisonFailure.class)
    public void testEditpassword2() throws ComparisonFailure {

        System.out.println("editpassword");
        editadminpassword instance = new editadminpassword("" ,"" ) ;
        
        
        String expResult = "jana";
        String result = instance.editpassword();
        assertEquals(expResult, result);
        System.out.println(result);

    }
    
    @Test(expected=ComparisonFailure.class)
    public void testEditpassword3() throws ComparisonFailure {

        System.out.println("editpassword");
        editadminpassword instance = new editadminpassword("jana" ,"" ) ;
        
        
        String expResult = "jana";
        String result = instance.editpassword();
        assertEquals(expResult, result);
        System.out.println(result);

    }
    
      @Test(expected=ComparisonFailure.class)
    public void testEditpassword4() throws ComparisonFailure {

        System.out.println("editpassword");
        editadminpassword instance = new editadminpassword("","jana" ) ;
        
        
        String expResult = "jana";
        String result = instance.editpassword();
        assertEquals(expResult, result);
        System.out.println(result);

    }
 
      @Test(expected=ComparisonFailure.class)
    public void testEditpassword5() throws ComparisonFailure {

        System.out.println("editpassword");
        editadminpassword instance = new editadminpassword("jana","jana1" ) ;
        
        
        String expResult = "jana";
        String result = instance.editpassword();
        assertEquals(expResult, result);
        System.out.println(result);

    }

    
  

}
