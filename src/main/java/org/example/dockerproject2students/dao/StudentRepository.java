package org.example.dockerproject2students.dao;


import org.example.dockerproject2students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
