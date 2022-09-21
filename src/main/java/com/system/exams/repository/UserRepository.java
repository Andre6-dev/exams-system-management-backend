package com.system.exams.repository;

import com.system.exams.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

}