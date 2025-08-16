package Java_practise.H2.DB.learning.repository;

import Java_practise.H2.DB.learning.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
