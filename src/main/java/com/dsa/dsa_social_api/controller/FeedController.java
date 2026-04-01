package com.dsa.dsa_social_api.controller;

import com.dsa.dsa_social_api.model.Post;
import com.dsa.dsa_social_api.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/feed")
public class FeedController {

    @Autowired
    private FeedService service;

    @PostMapping
    public String add(@RequestBody Post post) {
        service.addToFeed(post);
        return "Added to feed";
    }

    @GetMapping
    public List<Post> getFeed() {
        return service.getFeed();
    }
}
