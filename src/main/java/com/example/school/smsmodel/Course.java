package com.example.school.smsmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_code;
    private String course_name;
    private String course_desc;
    private Date course_start;
    private Date course_end;
    @OneToMany(targetEntity=UserToCourse.class,cascade = CascadeType.ALL)
    @JoinColumn(name="course_fk",referencedColumnName = "course_code")
    private List<UserToCourse> userToCourseList;
    @OneToMany(targetEntity=Grades.class,cascade = CascadeType.ALL)
    @JoinColumn(name="course_fk",referencedColumnName = "course_code")
    private List<Grades> gradesList;
}
