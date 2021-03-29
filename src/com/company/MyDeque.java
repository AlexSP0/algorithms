package com.company;

import java.util.Deque;

public class MyDeque<T> {
    private DoubleLinkedList<T> deque;

    public MyDeque() {
        deque = new DoubleLinkedList<>();
    }

    public void pushBack(T elem) {
        deque.addLast(elem);
    }
    public void pushFront(T elem) {
        deque.addFirst(elem);
    }
    public T popBack() {
        if(!deque.isEmpty()) {
            T buffer = deque.getElement(deque.getSize()-1).getValue();
            deque.remove(deque.getSize()-1);
            return buffer;
        } else {
            return null;
        }
    }
    public T popFront() {
        if(!deque.isEmpty()) {
            T buffer = deque.getElement(0).getValue();
            deque.remove(0);
            return buffer;
        } else {
            return null;
        }
    }
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    public void clear() {
        deque = new DoubleLinkedList<>();
    }
}
