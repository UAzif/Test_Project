package com.example.spring_rest.service;

import com.example.spring_rest.entity.News;

import java.util.List;

public interface NewsService {
    public List<News> showAllNews();
    public News getNews(int id);

}
