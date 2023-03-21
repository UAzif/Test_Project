package com.example.spring_rest.controller;

import com.example.spring_rest.entity.News;
import com.example.spring_rest.entity.Source;
import com.example.spring_rest.entity.Themes;

import com.example.spring_rest.models.NewsBySources;
import com.example.spring_rest.models.NewsResult;
import com.example.spring_rest.models.SourceResult;
import com.example.spring_rest.models.ThemesResult;
import com.example.spring_rest.repos.NewsRepository;
import com.example.spring_rest.repos.SourceCustomRepository;
import com.example.spring_rest.repos.SourceRepository;
import com.example.spring_rest.repos.ThemesRepository;
import com.example.spring_rest.service.SourceService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class MyRestController {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private SourceRepository sourceRepository;
    @Autowired
    private ThemesRepository themesRepository;
    private NewsResult newsResult;
    private SourceCustomRepository sourceCustomRepositorys;
    private SourceService sourceService;


    @GetMapping("/news")
    public List<NewsResult> showAllNews() {
        List<News> news = newsRepository.findAll();
        List<NewsResult> newsResult = new ArrayList<>();
        for (News n : news) {
            NewsResult nextNews = new NewsResult(n.getId(), n.getNameOfNews());
            newsResult.add(nextNews);
        }
        return newsResult;
    }

    @GetMapping("/source")
    public List<SourceResult> showAllSource() {
        List<SourceResult> sourceResults = new ArrayList<>();
        List<Source> sources = sourceRepository.findAll();
        for (Source sourec : sources) {
            SourceResult sr = new SourceResult(sourec.getIdSource(), sourec.getNameOfSource());
            sourceResults.add(sr);
        }
        return sourceResults;
    }

    @GetMapping("/themes")
    public List<Themes> showAllThemes() {
        List<Themes> themes = themesRepository.findAll();
        List<ThemesResult> themesResultArrayList = themes.stream().
                map(n -> new ThemesResult(n.getId(), n.getNameOfThemes())).
                collect(Collectors.toList());
        return themesRepository.findAll();
    }


    // выводит источник по имени
    @GetMapping("news/{source}")
    public List<SourceResult> findByNameOfSource(@PathVariable("source") String source) {
        List<SourceResult> sourceResults = new ArrayList<>();
        List<Source> sources = sourceRepository.findByNameOfSource(source);
        for (Source s : sources) {
            SourceResult sr = new SourceResult(s.getIdSource(), s.getNameOfSource());
            if (s.getNameOfSource().equals(source)) {
                sourceResults.add(sr);
            }
        }
        return sourceResults;
    }

    @GetMapping("source/{id}")
    public Source getSourcesById(@PathVariable int id) {
        Source resultSource=null;
        List<Source> sources = sourceRepository.getSourcesById(id);
        for (Source s:sources){
            Source sourceResult= new Source(s.getIdSource(),s.getNameOfSource());
            if (s.getIdSource()==id){
                resultSource=sourceResult;
            }
        }
        return resultSource;
    }
}

