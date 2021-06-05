package com.jiangren13.demo13.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @Column(name = "first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "encrypted_password", nullable = false)
    private String encryptedPassword;
}

