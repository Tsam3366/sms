package com.example.school.models;
import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="user")
public class User {
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Id
    private int user_id;
    private String role;
    private String email;
    private String password;
}
