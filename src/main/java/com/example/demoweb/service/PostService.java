package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@Service
public class PostService {
    ArrayList<Post> postArrayList = new ArrayList<>(Arrays.asList(
            new Post("HELP...", new Date()),
            new Post("CAN U HELP ME", new Date()),
            new Post("OH MY GOD.", new Date())));

    public ArrayList<Post> listAllPosts() {
        return postArrayList;
    }

    public void create(String text) {
        Post post = new Post(text, new Date());
        postArrayList.add(post);
    }
}
