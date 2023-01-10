package com.example.school.models;
import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="usertocourse")
public class UserToCourses {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private int user_id;
    private int course_id;
}
