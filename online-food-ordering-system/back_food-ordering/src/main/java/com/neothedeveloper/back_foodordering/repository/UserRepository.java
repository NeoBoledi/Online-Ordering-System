package com.neothedeveloper.back_foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neothedeveloper.back_foodordering.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String username);
}
