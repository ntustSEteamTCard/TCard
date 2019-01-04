package com.TCard.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.Section;


public interface SectionRepository extends JpaRepository<Section, Integer> {
    
    Section findByName(String name);


    
}
