package com.example.spring_rest.repos;

import com.example.spring_rest.entity.News;
import com.example.spring_rest.models.NewsResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}
