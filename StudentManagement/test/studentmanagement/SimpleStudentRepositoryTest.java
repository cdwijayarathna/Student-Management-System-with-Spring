/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagement;

import java.util.Map;
import junit.framework.Assert;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100596f
 */
public class SimpleStudentRepositoryTest {
     SimpleStudentRepository instance ;
    public SimpleStudentRepositoryTest() {
        instance = new SimpleStudentRepository();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {



    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        Student S596=new Student("Chamila","Dilshan",3,"Galle");
        instance.save(S596);
    }

    @After
    public void tearDown() {

    }

    /**
     * Test of update method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.update(null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class SimpleStudentRepository.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");

        instance.edit(null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudents() {
        System.out.println("findStudents");
        Student getS=instance.find(3);
        try{
            System.out.println(getS.getFirstName());

        }catch(NullPointerException e){
            Assert.fail("Wrong execute");
        }
    }

    /**
     * Test of save method, of class SimpleStudentRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Student S596=new Student("Chamila","Dilshan",3,"Galle");
        instance.save(S596);
        if(instance.find(3).equals(null)){
           Assert.fail("Wrong execute");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllData method, of class SimpleStudentRepository.
     */
    @Test
    public void testGetAllData() {
        System.out.println("getAllData");
        SimpleStudentRepository instance = new SimpleStudentRepository();
        ArrayList expResult = null;
        Map result = instance.getStudents();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}