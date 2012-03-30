/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 100596F
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        SimpleStudentRepository sip1 = (SimpleStudentRepository)context.getBean("stdRep");
        //System.out.println(sip1.find(2).getFirstName());
        StudentManagementSystem studentManagementSystem=new StudentManagementSystem(sip1);
        studentManagementSystem.printAllData();
        //studentManagementSystem.saveNewStudent(new Student())
        context.stop();
    }

}
