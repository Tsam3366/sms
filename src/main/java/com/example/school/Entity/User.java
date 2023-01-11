package com.example.school.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column
    private String user_role;
    @Column
    private String user_name;
    @Column
    private String user_email;
    @Column
    private String user_pwd;

    @ManyToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinTable(name = "user_course",joinColumns = @JoinColumn(name = "user_fk",referencedColumnName = "user_id"),inverseJoinColumns = @JoinColumn(name = "course_fk",referencedColumnName = "course_code"))
   private List<Course> courseList;
}
