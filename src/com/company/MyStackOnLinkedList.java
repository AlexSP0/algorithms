package com.company;
import java.util.*;

public class MyStackOnLinkedList<T> {
    private LinkedList<T> elements;

    public MyStackOnLinkedList() {
        elements = new LinkedList<>();
    }
    public void push(T elem) {
        elements.addFirst(elem);
    }
    public T pop() {
        if (!isEmpty()) {
            T buffer = elements.getFirst();
            elements.removeFirst();
            return buffer;
        } else {
            return null;
        }
    }
        public T peek () {
            if (!isEmpty()) {
                return elements.getFirst();
            } else {
                return null;
        }
    }
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
