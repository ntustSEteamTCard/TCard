package com.TCard.demo.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCard.demo.Model.Role;
import com.TCard.demo.repository.RoleRepository;
import com.TCard.demo.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public Role findOne(int id) {
        return roleRepository.findById(id).orElse(null);
    }
    
    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
    
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
    
    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }
    
    @Override
    public void save(String name,
                     String description) {
        save(new Role(name, description));
    }
    
    @Override
    public void delete(Role role) {
        roleRepository.delete(role);
    }
    
    @Override
    public void delete(String name) {
        delete(findByName(name));
    }
    
    @Override
    public void delete(int id) {
        delete(findOne(id));
    }
    
}
