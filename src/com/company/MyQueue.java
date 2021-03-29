package com.company;

public class MyQueue<T> {
    private DoubleLinkedList<T> queue;

    public MyQueue() { queue = new DoubleLinkedList();}

    public void push (T elem) {
        queue.addFirst(elem);
    }
    public T pop () {
        if(!isEmpty()) {
            T buffer = queue.getElement(queue.getSize()-1).getValue(); //получаем значение последнего элемента
            queue.remove(queue.getSize()-1); // удаляем последний элемент
            return buffer; //возвращаем значение последнего элемента
        }
        return null;
    }
    public T peek() {
        if(!isEmpty()) { return queue.getElement(queue.getSize()-1).getValue(); } else {return null;} //возвращаем значение последнего элемента
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
