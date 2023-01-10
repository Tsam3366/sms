package com.example.school.smsrepo;

import com.example.school.smsmodel.UserToCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserToCourseRepository extends JpaRepository<UserToCourse,Integer>
{
}
