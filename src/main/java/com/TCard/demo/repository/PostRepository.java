package com.TCard.demo.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.Post;
import com.TCard.demo.Model.Topic;
import com.TCard.demo.Model.User;



public interface PostRepository extends JpaRepository<Post, Integer> {
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(Topic topic);
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findTop5ByOrderByCreationDateDesc();


}
