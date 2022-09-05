package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Random;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        Post post1 = new Post("HELP...");
        Post post2 = new Post("CAN U HELP ME?");
        Post post3 = new Post("OH MY GOD.");

        ArrayList<Post> postArrayList = new ArrayList<>();

        postArrayList.add(post1);
        postArrayList.add(post2);
        postArrayList.add(post3);

        Random random = new Random();

        for (Post post : postArrayList) {
            post.setLikes(Math.abs(random.nextInt(1000)));
        }

        return postArrayList;
    }
}
