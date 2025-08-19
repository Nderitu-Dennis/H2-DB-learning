package Java_practise.H2.DB.learning.controller;

import Java_practise.H2.DB.learning.entity.Student;
import Java_practise.H2.DB.learning.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// a Controller handles HTTP requests
@RequestMapping("/students")  // base path for all endpoints


public class StudentController {
    private final StudentServiceImpl studentServiceImpl;

   @Autowired
    public StudentController(StudentServiceImpl studentServiceImpl){
        this.studentServiceImpl=studentServiceImpl;
    }

    @PostMapping("/add") //NOTE-u cant use this in a browser, browser only accepts GET requests, i know its dumb i discovered this 2day
    public Student addStudent(@RequestBody Student student){
//        @RequestBody → binds JSON/XML request payload into a Java object.
        return studentServiceImpl.saveStudent(student);

    }

    @GetMapping("/get-students")
  public List<Student> getAllStudents(){
        return studentServiceImpl.getAllStudents();
    }

    @DeleteMapping("delete-student/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long studentId) {
//       ResponseEntity<T> -> Spring class for building HTTP responses, w the body being a String msg
       studentServiceImpl.deleteStudent(studentId);
       return ResponseEntity.ok("Student deleted successfully");


}}
