package com.TCard.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCard.demo.Model.Section;
import com.TCard.demo.repository.SectionRepository;
import com.TCard.demo.service.SectionService;


@Service
public class SectionServiceImpl implements SectionService {
    
    @Autowired
    private SectionRepository sectionRepository;
    
    @Override
    public List<Section> findAll() {
        return sectionRepository.findAll();
    }
    
    @Override
    public Section findOne(int id) {
        return sectionRepository.findById(id).orElse(null);
    }
    
    @Override
    public Section findByName(String name) {
        return sectionRepository.findByName(name);
    }
    
    @Override
    public Section save(Section section) {
        return sectionRepository.save(section);
    }
    
    @Override
    public void delete(int id) {
        delete(findOne(id));
    }
    
    @Override
    public void delete(Section section) {
        sectionRepository.delete(section);
    }
    
}
