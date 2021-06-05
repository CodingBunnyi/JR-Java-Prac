package com.jiangren13.demo13.controller;

import com.jiangren13.demo13.dtos.StudentGetDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class HelloController {
    @GetMapping
    public ResponseEntity<Object> hello() {
        StudentGetDto eric = new StudentGetDto();
        eric.setFirstName("tiger");
        return ResponseEntity.ok(eric);
    }
}
