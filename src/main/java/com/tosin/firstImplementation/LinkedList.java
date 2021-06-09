package com.tosin.firstImplementation;

public class LinkedList {

    public class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        private Node first;
        private Node last;

        public void addLastNode(int value){
            Node node = new Node(value);
            if(first == null){
                first = last = null;
            }
            last.next = node;
            last = node;
        }
    }
}
