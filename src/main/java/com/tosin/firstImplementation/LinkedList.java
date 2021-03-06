package com.tosin.firstImplementation;

import java.util.NoSuchElementException;

public class LinkedList {

    public class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        private Node first;
        private Node last;

        public void addLastNode(int value) {
            Node node = new Node(value);
            if (first == null) {
                first = last = null;
            } else {
                last.next = node;
                last = node;
            }
        }

        public void addFirstNode(int value){
            Node node = new Node(value);
            if(first==null){
                first = last = null;
            }else {
            node.next = first;

            first = node;
            }
        }

        public void removeLast(){
            var current = first;
            while(current !=null){
                if(current.next==last) break;
                current = current.next;
            }
            current.next = null;
            last = current;
        }

        public void removeFirst(){

            var second = first.next;
            if(first == null){
                throw new NoSuchElementException();
            }
            if(first==null){
                last = first = null;
            }
            first  = null;
            first = second;
        }

        public int indexOf(int value){
            var current = first;
            int index = 0;
            while(current!=null){
                if(current.data == value) return index;
                current = current.next;
                index++;
            }
            return -1;
        }

        public boolean isContains(int value){
            return indexOf(value) != -1;
        }


    }
}
