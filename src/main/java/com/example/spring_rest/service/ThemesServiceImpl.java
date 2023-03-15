package com.example.spring_rest.service;

import com.example.spring_rest.entity.Themes;
import com.example.spring_rest.repos.ThemesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ThemesServiceImpl implements ThemesService{
    @Autowired
    private ThemesRepository themesRepository;
    @Override
    public List<Themes> showAllThemes() {
        List<Themes> themes= themesRepository.findAll();
        return themes;
    }
}
