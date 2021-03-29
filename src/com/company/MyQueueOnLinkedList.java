package com.company;

import java.util.LinkedList;

public class MyQueueOnLinkedList<T> {
    private LinkedList<T> queue;

    public MyQueueOnLinkedList() {
        queue = new LinkedList<>();
    }
    public void push(T elem) {
        queue.addFirst(elem);
    }
    public T pop() {
        if(!isEmpty()) {
            T buffer = queue.getLast();
            queue.removeLast();
            return buffer;
        } else {
            return null;
        }
    }
    public T peek() {
        if(!isEmpty()) {
            return queue.getLast();
        } else {
            return null;
        }
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
