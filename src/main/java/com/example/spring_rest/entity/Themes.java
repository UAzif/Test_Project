package com.example.spring_rest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Themes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name="name_of_themes")
    private String nameOfThemes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "themes")
    private List<News> news;

    public Themes() {
    }

    public Themes(int id, String nameOfThemes) {
        this.id = id;
        this.nameOfThemes = nameOfThemes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfThemes() {
        return nameOfThemes;
    }

    public void setNameOfThemes(String nameOfThemes) {
        this.nameOfThemes = nameOfThemes;
    }
}
