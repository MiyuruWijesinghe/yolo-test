package com.dsa.dsa_social_api.model;

public class Node {

    public Post data;
    public Node next;

    public Node(Post data) {
        this.data = data;
        this.next = null;
    }
}
