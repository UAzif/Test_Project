package com.example.spring_rest.repos;

import com.example.spring_rest.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Integer> {
}
