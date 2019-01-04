package com.TCard.demo.service;

import com.TCard.demo.Model.UserProfile;

public interface UserProfileService {
    
    public UserProfile findOne(int userId);
    
    public UserProfile findOne(String username);
    
}
