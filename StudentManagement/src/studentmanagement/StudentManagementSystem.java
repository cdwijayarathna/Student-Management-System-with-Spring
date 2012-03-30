/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagement;

/**
 *
 * @author chamila
 */
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author 100596f
 */
public class StudentManagementSystem {

    private SimpleStudentRepository database;

    public StudentManagementSystem(SimpleStudentRepository simpleStudentRepository){
        database=simpleStudentRepository;
    }

    public void saveNewStudent(Student student){
        int id=student.getNumber();
        database.save(student);
    }

    public void printAllData(){
        Map<Integer,Student> data=database.getStudents();
      
        for(int i=1;i<data.size()+1;i++){
            Student student=data.get(i);
            System.out.println(student.getNumber() + "   " + student.getFirstName() + "  " + student.getLastName() + "   " + student.getAddress());
        }

    }

}
