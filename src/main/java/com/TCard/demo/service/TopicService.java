package com.TCard.demo.service;


import java.util.List;
import java.util.Set;

import com.TCard.demo.Model.Section;
import com.TCard.demo.Model.Topic;
import com.TCard.demo.Model.User;



public interface TopicService {
    
    List<Topic> findAll();
    
    Topic findOne(int id);
    
    Set<Topic> findRecent();
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findBySection(String sectionName);
    
    Topic save(Topic topic);
    
    Set<Topic> findBySection(int id);
    
    Set<Topic> findByUser(User user);
    
    void delete(int id);
    
    void delete(Topic topic);
    
}
