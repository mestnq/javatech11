package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;
import javax.persistence.Id;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Date creationDate;
    private int likes;

    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
        creationDate = new Date();
        likes = Math.abs(new Random().nextInt(100));
    }

    public Post() {

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
