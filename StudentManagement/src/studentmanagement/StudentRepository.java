/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagement;

/**
 *
 * @author 100552T
 */
public interface  StudentRepository {
    public void save(Student student);
    public void edit(Student student);
    public void update(Student student);
    public Student find(int number);
}
