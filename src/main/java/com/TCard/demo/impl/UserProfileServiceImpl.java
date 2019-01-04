package com.TCard.demo.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCard.demo.Model.User;
import com.TCard.demo.Model.UserProfile;
import com.TCard.demo.service.PostService;
import com.TCard.demo.service.TopicService;
import com.TCard.demo.service.UserProfileService;
import com.TCard.demo.service.UserService;



@Service
public class UserProfileServiceImpl implements UserProfileService {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private PostService postService;
    
    @Autowired
    private TopicService topicService;
    
    @Override
    public UserProfile findOne(int userId) {
        UserProfile userProfile = new UserProfile();
        User user = userService.findOne(userId);
        userProfile.setUser(user);
        userProfile.setPosts(postService.findByUser(user));
        userProfile.setTopics(topicService.findByUser(user));
        return userProfile;
    }
    
    @Override
    public UserProfile findOne(String username) {
        return findOne(userService.findByUsername(username).getId());
    }
    
}
