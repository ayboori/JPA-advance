package com.sparta.jpaadvance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sparta.jpaadvance.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
