package com.example.spring_rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name="news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name_of_news")
    private String nameOfNews;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "source_id")
    private Source source;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "themes_id")
    private Themes themes;

    public News() {
    }

    public News(int id, String nameOfNews) {
        this.id = id;
        this.nameOfNews = nameOfNews;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfNews() {
        return nameOfNews;
    }

    public void setNameOfNews(String nameOfNews) {
        this.nameOfNews = nameOfNews;
    }


    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

//
}
