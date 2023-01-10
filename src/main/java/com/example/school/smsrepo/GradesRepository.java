package com.example.school.smsrepo;

import com.example.school.smsmodel.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends JpaRepository<Grades,Integer>
{
}
