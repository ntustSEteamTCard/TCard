package com.TCard.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    
    Role findByName(String name);

    
}
