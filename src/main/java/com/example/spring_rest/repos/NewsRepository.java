package com.example.spring_rest.repos;

import com.example.spring_rest.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}
