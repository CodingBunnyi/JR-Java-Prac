package com.jiangren13.demo13.services;

import com.jiangren13.demo13.dtos.StudentGetDto;
import com.jiangren13.demo13.dtos.StudentPostDto;
import com.jiangren13.demo13.entities.Student;
import com.jiangren13.demo13.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private Student mapPostDtoToEntity(StudentPostDto studentPostDto) {
        Student student = new Student();
        student.setFirstName(studentPostDto.getFirstName());
        student.setEncryptedPassword(studentPostDto.getPassword());
        return student;
    }

    private StudentGetDto mapEntityToGetDto(Student student) {
        StudentGetDto studentGetDto = new StudentGetDto();
        studentGetDto.setId(student.getId().toString());
        studentGetDto.setFirstName(student.getFirstName());
        return studentGetDto;
    }

    public StudentGetDto createStudent(StudentPostDto studentPostDto) {
        Student studentFromDB = studentRepository.save(mapPostDtoToEntity(studentPostDto));
        return mapEntityToGetDto(studentFromDB);
    }


}
