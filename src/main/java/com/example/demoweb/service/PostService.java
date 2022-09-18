package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@Service
public class PostService {
    ArrayList<Post> postArrayList = new ArrayList<>();

    public PostService() {
        String[] texts = new String[]{"HELP...", "CAN U HELP ME?", "OH MY GOD."};
        for (String text : texts) {
            postArrayList.add(new Post((long) postArrayList.size(), text + ", id = " + (long) postArrayList.size(), Math.abs(new Random().nextInt(100))));
        }
    }

    public ArrayList<Post> listAllPosts() {
        return postArrayList;
    }

    public void create(String text) {
        Post post = new Post((long) postArrayList.size(), text, Math.abs(new Random().nextInt(100)));
        postArrayList.add(post);
    }
}
