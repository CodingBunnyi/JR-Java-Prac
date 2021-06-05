package com.jiangren13.demo13.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



@Entity
@Getter
@Setter
@Table(name = "student")

public class Student {

