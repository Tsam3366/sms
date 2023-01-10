package com.example.school.models;

import jakarta.persistence.*;
import lombok.*;
import java.security.PrivateKey;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="courses")
public class Courses {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int course_id;
    private String course_name;
    private String course_description;
    private String course_start;
    private String course_end;

}
