package com.example.demoweb.model;

import java.util.Date;
import java.util.UUID;

public class Post {
    private final Long id;
    private String text;
    private Integer likes;
    private final Date creationDate;

    public Post(Long id, String text, Integer likes) {
        this.id = id;
        this.text = text;
        this.creationDate = new Date();
        this.likes = likes;
    }
    public Long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
