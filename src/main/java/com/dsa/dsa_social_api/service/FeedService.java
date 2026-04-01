package com.dsa.dsa_social_api.service;

import com.dsa.dsa_social_api.model.Post;
import com.dsa.dsa_social_api.repository.InMemoryStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    @Autowired
    private InMemoryStore store;

    public void addToFeed(Post post) {
        store.feed.add(post);
    }


    public List<Post> getFeed() {
        return store.feed.getAll();
    }
}
