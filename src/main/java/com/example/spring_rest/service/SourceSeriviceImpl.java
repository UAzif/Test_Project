package com.example.spring_rest.service;

import com.example.spring_rest.entity.Source;
import com.example.spring_rest.repos.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



public class SourceSeriviceImpl implements SourceService{
    @Autowired
    private SourceRepository sourceRepository;

    @Override
    public List<Source> showAllSources() {
        List<Source> sources=sourceRepository.findAll();
        return sources;
    }

}
