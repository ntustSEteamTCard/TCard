package com.TCard.demo.service;


import java.util.List;

import com.TCard.demo.Model.Role;


public interface RoleService {
    
    Role findOne(int id);
    
    Role findByName(String name);
    
    List<Role> findAll();
    
    void save(Role role);
    
    void save(String name,
              String description);
    
    void delete(Role role);
    
    void delete(String name);
    
    void delete(int id);
    
}
