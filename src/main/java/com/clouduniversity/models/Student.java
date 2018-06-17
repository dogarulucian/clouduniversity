package com.clouduniversity.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stud_id")
    private Long stud_id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @Column(name ="create_date")
    private Date create_date;
    @Column(name = "student_thesis")
    @Lob
    private  byte[] student_thesis;


}
