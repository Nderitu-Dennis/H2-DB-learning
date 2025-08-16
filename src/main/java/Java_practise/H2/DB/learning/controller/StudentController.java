package Java_practise.H2.DB.learning.controller;

import Java_practise.H2.DB.learning.entity.Student;
import Java_practise.H2.DB.learning.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// a Controller handles HTTP requests
@RequestMapping("/students")  // base path for all endpoints


public class StudentController {
    private final StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl){
        this.studentServiceImpl=studentServiceImpl;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
//        @RequestBody → binds JSON/XML request payload into a Java object.
        return studentServiceImpl.saveStudent(student);

    }

    @GetMapping("/get-students")
  public List<Student> getAllStudents(){
        return studentServiceImpl.getAllStudents();
    }
}
