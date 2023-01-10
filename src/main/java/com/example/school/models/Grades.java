package com.example.school.models;
import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="grades")
public class Grades {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private int user_id;
    private int course_id;
    private String grade;

}
