package Java_practise.H2.DB.learning.service;

import Java_practise.H2.DB.learning.entity.Student;
import Java_practise.H2.DB.learning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    //private → only accessible inside this class.
    //final → must be assigned once (either directly or via the constructor) and can’t be reassigned later.
    private final StudentRepository studentRepository;

    @Autowired
//   this is the constructor-constructor injection
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override //tells the compiler this method is intended to replace a method from a parent class or interface
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(Long studentId){
        return studentRepository.findById(studentId);
    }

    @Override
    public void deleteStudent(Long studentId){
        if (studentRepository.existsById(studentId)) {
            studentRepository.deleteById(studentId);
        }
        else{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Student with id " + studentId + " not found");
                    }

    }





}
