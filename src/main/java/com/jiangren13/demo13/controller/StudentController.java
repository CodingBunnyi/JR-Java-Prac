package com.jiangren13.demo13.controller;

import com.jiangren13.demo13.dtos.StudentGetDto;
import com.jiangren13.demo13.dtos.StudentPostDto;
import com.jiangren13.demo13.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentGetDto> createStudent(@RequestBody StudentPostDto studentPostDto) {
        StudentGetDto studentGetDto = studentService.createStudent(studentPostDto);
        return ResponseEntity.ok(studentGetDto);
    }
}
