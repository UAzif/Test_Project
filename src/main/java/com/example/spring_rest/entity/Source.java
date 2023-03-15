package com.example.spring_rest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_of_source")
    private String nameOfSource;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "source")
    private List<News> news;

    public Source() {
    }

    public Source(int idSource, String nameOfSource) {
        this.id = idSource;
        this.nameOfSource = nameOfSource;
    }

    public int getIdSource() {
        return id;
    }

    public void setIdSource(int idSource) {
        this.id = idSource;
    }

    public String getNameOfSource() {
        return nameOfSource;
    }

    public void setNameOfSource(String nameOfSource) {
        this.nameOfSource = nameOfSource;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", nameOfSource='" + nameOfSource + '\'' +
                '}';
    }
}
