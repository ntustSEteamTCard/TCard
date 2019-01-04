package com.TCard.demo.service;



import java.util.List;

import com.TCard.demo.Model.Section;



public interface SectionService {
    
    List<Section> findAll();
    
    Section findOne(int id);
    
    Section findByName(String name);
    
    Section save(Section section);
    
    void delete(int id);
    
    void delete(Section section);
    
}
