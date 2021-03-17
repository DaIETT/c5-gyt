package JDBC.dao;

import JDBC.pojo.Student;

import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-17-9:01
 */
public interface studentDao {
    int insert(Student student);
    int delete(int id);
    int update(Student student);
    List<Student> queryStudents();
    Student queryStudentBySNO(String SNO);

}
