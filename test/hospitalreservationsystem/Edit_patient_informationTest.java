/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the EditPatientInformationor.
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
 * @author HP
 */
public class Edit_patient_informationTest {
    
    public Edit_patient_informationTest() {
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
     * Test of check_data method, of class Edit_patient_information.
     */
    
 
    @Test
    public void testCheck_data1() {
         System.out.println("check_data,TC#1");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = true;
        boolean result =    Edit_patient_information.check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);
        assertEquals(expResult, result);
         
    }
 
    @Test
    public void testCheck_data2() {
         System.out.println("check_data,TC#2");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCheck_data3() {
    //  System.out.println("output of check data "+ Edit_patient_information.check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true));

         System.out.println("check_data,TC#3");
        String ppn = "01030";
        String pop = "";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", " ", "asmaa", "asmaa", "giza", "asmaa", true);
        assertEquals(expResult, result);
    }
      
    @Test
    public void testCheck_data4() {
         System.out.println("check_data,TC#4");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", " asmaa", " ", "asmaa", "giza", "asmaa", true);
        assertEquals(expResult, result);
    }
    
     
    @Test
    public void testCheck_data5() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#5");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", " asmaa", " asmaa", "", "giza", "asmaa", true);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCheck_data6() {
         System.out.println("check_data,TC#6");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", " asmaa", " asmaa", "asmaa", " ", "asmaa", true);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCheck_data7() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#7");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", " asmaa", " asmaa", "asmaa", "giza ", "", true);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCheck_data8() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#8");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data( "01030","nora", "nora11", "nona", "kom",  "nora", true);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheck_data9() {
         System.out.println("check_data,TC#9");
        String ppn = "01030";
        String pop = "";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCheck_data10() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#10");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheck_data11() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#11");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheck_data12() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#112");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testCheck_data13() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#13");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "";
        boolean connected = true;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
    }
    
    @Test
     public void testCheck_data14() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#14");
        String ppn = "01030";
        String pop = "nooo";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //(flag2==0&&flag5==0&&flag6==1&&flag1==0&&flag3==0&&flag8==0&&flag4==0&&flag7==1)
    
    @Test
     public void testCheck_data15() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#15");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
    
     @Test
     public void testCheck_data16() {
         System.out.println("check_data,TC#16");
        String ppn = "";
        String pop = "";
        String pnp = "";
        String pn = "";
        String paddress = "";
        String pu = "";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
       
    }
     
       
     @Test
     public void testCheck_data17() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#17");
        String ppn = "";
        String pop = "";
        String pnp = "";
        String pn = "";
        String paddress = "";
        String pu = "";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
     public void testCheck_data18() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#18");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora2";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
     public void testCheck_data19() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#19");
        String ppn = "01030";
        String pop = "nora5";  //wrong old password
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
       
     
     
     
     @Test
     public void testCheck_data21() {
         System.out.println("check_data,TC#21");
        String ppn = "01030";
        String pop = "";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
       
    }
     @Test
     public void testCheck_data22() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#22");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      
       @Test
     public void testCheck_data25() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#25");
        String ppn = "01030";
        String pop = "";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora89";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      @Test
     public void testCheck_data26() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#26");
        String ppn = "01030";
        String pop = "";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 @Test
     public void testCheck_data27() {
        // System.out.println("output of EditPatientInformation function = "+  object.EditPatientInformation( "01030", "nora", "nora11", "nona", "kom", "nora", true));
        System.out.println("check_data,TC#27");
        String ppn = "01030";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "";
        boolean connected = false;
        boolean expResult = false;
        boolean result = Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 

      
     @Test
    public void testCheck_data33() {
         System.out.println("check_data,TC#27");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data("01020563258", "", "", "", "", "", true);
        assertEquals(expResult, result);
    }
    
    
      @Test
    public void testCheck_data28() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#28");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", "asmaa11", "", "", "", "", true);
        assertEquals(expResult, result);
    }
    
    
       @Test
    public void testCheck_data29() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#29");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", " ", "asmaa", "", "", "", true);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheck_data30() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#30");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", " ", " ", "asmaa", "", "", true);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCheck_data31() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#30");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", " ", " ", " ", "giza", "", true);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testCheck_data32() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#30");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = true;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", " ", " ", " ", "", "asmaa", true);
        assertEquals(expResult, result);
    }
    
     
         @Test
    public void testCheck_data35() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#30");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", " ", " ", " ", "", "asmaa", false);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheck_data34() {
        //   check_data("01020563258", "asmaa11", "asmaa", "asmaa", "giza", "asmaa", true);

         System.out.println("check_data,TC#30");
        String ppn = "";
        String pop = "nora";
        String pnp = "nora11";
        String pn = "nona";
        String paddress = "kom";
        String pu = "nora";
        boolean connected = false;
        boolean expResult = false;
        boolean result =    Edit_patient_information.check_data(" ", "asmaa11", "", " ", "", "asmaa", false);
        assertEquals(expResult, result);
    }
    /**
     * Test of EditPatientInformation method, of class Edit_patient_information.
     */
    
    
    @Test
    public void testEdit2() {
        System.out.println("EditPatientInformation,TC2");
         String pnp = "nora11";
        String pop = "nora";
        String pu = "nora";
        String pn = "nora";
        String paddress = "kom";
        String ppn = "01030";
        String pg = "female";
          boolean checking=false;
          boolean connected=false;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        
        Edit_patient_information instance = new Edit_patient_information(pnp, pop, pu, paddress, ppn, pg, connected);
        boolean expResult = false;
        boolean result = instance.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    
      
        @Test
    public void testEdit3() {
        System.out.println("EditPatientInformation,TC3");
        String pnp = "nora11";
        String pop = "";
        String pu = "nora";
        String pn = "nora";
        String paddress = "kom";
        String ppn = "01030";
        String pg = "female";
          boolean checking=false ;
          boolean connected=true;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        
        Edit_patient_information instance = new Edit_patient_information(pnp, pop, pu, paddress, ppn, pg, connected);
        boolean expResult = false;
        boolean result = instance.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg);
        assertEquals(expResult, result);
    
    }
    @Test
    public void testEdit4() {
      //  nora11 ,nora,nora,nora,kom,01030,female
//EditPatientInformation(String pnp,String pop,String pu,String paddress,  String ppn,  String pg,boolean connected){
    
        System.out.println("EditPatientInformation,TC4");
        String pnp = "nora11";
        String pop = "";
        String pu = "nora";
        String pn = "nora";
        String paddress = "kom";
        String ppn = "01030";
        String pg = "female";
          boolean checking=false ;
          boolean connected=false;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        
        Edit_patient_information instance = new Edit_patient_information(pnp, pop, pu, paddress, ppn, pg, connected);
        boolean expResult = false;
        boolean result = instance.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    @Test
    public void testEdit1() {
      
    
        System.out.println("EditPatientInformation1");
        String pnp = "nora11";
        String pop = "nora11";
        String pu = "nora";
        String pn = "female";
        String paddress = "kom";
        String ppn = "01030";
        String pg = "female";
          boolean checking=true ;
          boolean connected=true;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        
        Edit_patient_information instance = new Edit_patient_information(pnp, pop, pu, paddress, ppn, pg, connected);
        boolean expResult = true;
        boolean result = instance.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testEdit5() {
     
    
        System.out.println("EditPatientInformation5");
        String pnp = "nora11";
        String pop = "nora11";
        String pu = "nora";
        String pn = "female";
        String paddress = "kom";
        String ppn = "01030";
        String pg = "female";
          boolean checking=true ;
          boolean connected=false;
        checking=Edit_patient_information.check_data(ppn, pop, pnp, pn, paddress, pu, connected);
        
        Edit_patient_information instance = new Edit_patient_information(pnp, pop, pu, paddress, ppn, pg, connected);
        boolean expResult = false;
        boolean result = instance.EditPatientInformation(pnp, pop, pu, paddress, ppn, pg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
