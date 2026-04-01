package com.dsa.dsa_social_api.dsa;

import com.dsa.dsa_social_api.model.Node;
import com.dsa.dsa_social_api.model.Post;
import java.util.ArrayList;
import java.util.List;

public class LinkedListFeed {

    private Node head;

    // Insert at beginning (latest post first)
    public void add(Post post) {
        Node newNode = new Node(post);
        newNode.next = head;
        head = newNode;
    }

    // Convert to List (for API response)
    public List<Post> getAll() {
        List<Post> result = new ArrayList<>();
        Node current = head;

        while (current != null) {
            result.add(current.data);
            current = current.next;
        }

        return result;
    }

    // Remove first (optional)
    public Post removeFirst() {
        if (head == null) return null;

        Post data = head.data;
        head = head.next;
        return data;
    }
}
