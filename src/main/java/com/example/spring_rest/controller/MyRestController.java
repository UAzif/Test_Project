package com.example.spring_rest.controller;

import com.example.spring_rest.entity.News;
import com.example.spring_rest.entity.Source;
import com.example.spring_rest.entity.Themes;
import com.example.spring_rest.models.NewsResult;
import com.example.spring_rest.repos.NewsRepository;
import com.example.spring_rest.repos.SourceRepository;
import com.example.spring_rest.repos.ThemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
   // private List<News> allNews;


    @GetMapping("/news")
    public List<News> showAllNews() {
        List<News> newNews = null;
        List<News> news = newsRepository.findAll();
        for (int i = 0; i < news.size(); i++) {
            new newsResult.;
            newsResult.add(n);
        }
        return newsResult;
    }

    @GetMapping("/news/{id}")
    public News getNews(@PathVariable int id) {
        News news = null;
        Optional<News> optional = newsRepository.findById(id);
        if (optional.isPresent()) {
            news = optional.get();
        }
        return news;
    }

    @GetMapping("/source")
    public List<Source> showAllSource() {

        return sourceRepository.findAll();
    }

    @GetMapping("/themes")
    public List<Themes> showAllThemes() {
        return themesRepository.findAll();
    }

}
