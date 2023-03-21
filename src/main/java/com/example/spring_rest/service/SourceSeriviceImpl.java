package com.example.spring_rest.service;

import com.example.spring_rest.entity.Source;
import com.example.spring_rest.repos.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SourceSeriviceImpl implements SourceService{
    @Autowired
    private SourceRepository sourceRepository;

    @Override
    public List<Source> showAllSources() {
        List<Source> sources=sourceRepository.findAll();
        return sources;

    }


//    @Override
//    public Source getSourcesById(int id) {
//       Source source =null;
//        Optional<Source> optional=sourceRepository.findById(id);
//        if (optional.isPresent()){
//            source=optional.get();
//        }
//        return source;
//    }

}
