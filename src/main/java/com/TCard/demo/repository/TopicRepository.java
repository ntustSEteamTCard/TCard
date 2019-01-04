package com.TCard.demo.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.Section;
import com.TCard.demo.Model.Topic;
import com.TCard.demo.Model.User;


public interface TopicRepository extends JpaRepository<Topic, Integer> {
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findByUser(User user);
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findTop5ByOrderByCreationDateDesc();


    
    
}
