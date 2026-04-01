package com.dsa.dsa_social_api.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Long, List<Long>> adjList = new HashMap<>();

    // follow user
    public void follow(Long user, Long target) {
        adjList.computeIfAbsent(user, k -> new ArrayList<>()).add(target);
    }

    // users this user follows
    public List<Long> getFollowing(Long user) {
        return adjList.getOrDefault(user, new ArrayList<>());
    }

    // followers (reverse lookup)
    public List<Long> getFollowers(Long target) {
        List<Long> result = new ArrayList<>();

        for (Map.Entry<Long, List<Long>> entry : adjList.entrySet()) {
            if (entry.getValue().contains(target)) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
