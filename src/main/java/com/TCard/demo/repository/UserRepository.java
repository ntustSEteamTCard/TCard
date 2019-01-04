package com.TCard.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
    
    User findByEmail(String email);


    
}
