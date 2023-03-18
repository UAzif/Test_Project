package com.example.spring_rest.service;

import com.example.spring_rest.repos.NewsRepository;
import com.example.spring_rest.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;


    @Override
    public List<News> showAllNews() {
        List<News> news=newsRepository.findAll();
        return news;
    }

    @Override
    public News getNews(int id) {
        News news =null;
        Optional<News> optional=newsRepository.findById(id);
        if (optional.isPresent()){
            news=optional.get();
        }
        return news;
    }


}
