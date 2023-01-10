package com.example.school.smsmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String user_role;
    private String user_name;
    private String user_email;
    private String user_pwd;
    @OneToMany(targetEntity=UserToCourse.class,cascade = CascadeType.ALL)
    @JoinColumn(name="user_fk",referencedColumnName = "user_id")
    private List<UserToCourse> userToCourseList;
    @OneToMany(targetEntity=Grades.class,cascade = CascadeType.ALL)
    @JoinColumn(name="user_fk",referencedColumnName = "user_id")
    private List<Grades> gradesList;
}
