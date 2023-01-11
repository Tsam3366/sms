package com.example.school.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Table
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_code;
    @Column
    private String course_name;
    @Column
    private String course_desc;
    @Column
    private Date course_start;
    @Column
    private Date course_end;

    @ManyToMany(mappedBy = "courseList")
    private List<User> userList;


}
