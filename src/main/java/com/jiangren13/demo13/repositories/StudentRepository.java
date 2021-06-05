package com.jiangren13.demo13.repositories;

import com.jiangren13.demo13.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
