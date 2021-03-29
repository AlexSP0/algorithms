package com.company;

public class MySimpleStack<T> {
    private DoubleLinkedList<T> elements;

    MySimpleStack() {
        elements = new DoubleLinkedList<>();
    }
    public void push(T elem) {
        elements.addFirst(elem);
    }
    public T pop() {
        if (!elements.isEmpty()) {
            T buffer = elements.getElement(0).getValue();
            elements.remove(0);
            return buffer;
        } else {
            return null;
        }
    }
    public T peek() {
        if(!elements.isEmpty()) {return elements.getElement(0).getValue(); } else {  return null; }
    }
    public boolean isEmpty() {
        return elements.isEmpty();
    }

}
