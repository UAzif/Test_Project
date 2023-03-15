package com.example.spring_rest.repos;

import com.example.spring_rest.entity.Themes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemesRepository extends JpaRepository<Themes, Integer> {
}
