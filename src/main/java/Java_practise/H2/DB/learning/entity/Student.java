package Java_practise.H2.DB.learning.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private Long studentId;

   @Column(name = "first_name", nullable = false) //enforce data integrity
    private String firstName;

   @Column(name = "last_name", nullable = false)
    private String lastName;

   private int age;

}
