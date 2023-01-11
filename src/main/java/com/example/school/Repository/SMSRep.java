package com.example.school.Repository;

import com.example.school.Entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSRep extends JpaRepository<User, Integer> {
}
