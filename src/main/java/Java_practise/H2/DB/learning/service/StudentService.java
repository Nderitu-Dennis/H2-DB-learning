package Java_practise.H2.DB.learning.service;

import Java_practise.H2.DB.learning.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

//    save student
    Student saveStudent(Student student);

//    list students
    List<Student> getAllStudents();

//    find a student
    Optional<Student> findStudentById(Long studentId);

//    delete student
    void deleteStudent(Long studentId);





}
