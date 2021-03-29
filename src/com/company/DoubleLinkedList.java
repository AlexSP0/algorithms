package com.company;

public class DoubleLinkedList<T> {
    private DoubleLinkedListElement<T> firstElement;
    private DoubleLinkedListElement<T> lastElement;
    private int size;
    public DoubleLinkedList() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public DoubleLinkedListElement<T> getElement(int index){
        if(index>=size) {return null;}
        DoubleLinkedListElement current = firstElement;
        for (int i = 0; i < size; i++) {
            if(current.getIndex() == index) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
    public void add(T elem) {
           addFirst(elem);
    }
    public void add(T elem, int index) {
        DoubleLinkedListElement<T> newElem = new DoubleLinkedListElement(elem, size);
        if(size==0 || index==0) { //пустой список, добаляем первый елемент
            if(size==0) {
                firstElement = newElem;
                lastElement = newElem;
                newElem.setNext(null);
                newElem.setPrevious(null);
                size++;
            } else { //список не пустой, добавляем элемент с индексом 0
                DoubleLinkedListElement buff = firstElement;
                buff.setPrevious(newElem);
                firstElement = newElem;
                firstElement.setNext(buff);
                firstElement.setPrevious(null);
                size++;
                regularizeIndexes();
            }
        } else if (index == size-1) { //добавление последнего элемента
            lastElement.setNext(newElem);
            lastElement = newElem;
            size++;
            regularizeIndexes();
        } else if(size!=0 && index!=size){ //встака элемента внутрь массива
            DoubleLinkedListElement<T> prev = getElement(index-1);
            DoubleLinkedListElement<T> next = getElement(index);
            prev.setNext(newElem);
            newElem.setPrevious(prev);
            next.setPrevious(newElem);
            newElem.setNext(next);
            size++;
            regularizeIndexes();
        }
    }
    public void addFirst(T elem) {
        add(elem,0);
    }
    public void addLast(T elem) {
        add(elem, size-1);
    }
    public void set(int index, T elem) {
        if(index<size) {
            DoubleLinkedListElement buff = getElement(index);
            buff.setValue(elem);
        }
    }
    public void remove(int index) {
        if(index==0) { //удаляем первый элемент списка
           firstElement = getElement(index).getNext();
           size--;
           regularizeIndexes();

        } else if(index == size-1) { //удаляем последний элемент списка
            lastElement = getElement(index).getPrevious();
            size--;
            regularizeIndexes();
        } else {
            DoubleLinkedListElement prev = getElement(index-1);
            DoubleLinkedListElement next = getElement(index+1);
            prev.setNext(next);
            next.setPrevious(prev);
            size--;
            regularizeIndexes();
        }
    }
    public void remove(T elem){
        DoubleLinkedListElement element = search(elem);
        if(element!=null){
            remove(element.getIndex());
        }
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public void Display() {
        DoubleLinkedListElement<T> current = firstElement;
        for (int i = 0; i < size; i++) {
            System.out.println("Индекс: " + current.getIndex() + "   содержимое: " + current.getValue());
            current = current.getNext();
        }
    }
    public DoubleLinkedListElement<T> search(T elem) {
        DoubleLinkedListElement current = firstElement;
        for (int i = 0; i < size; i++) {
            if(current.getValue().equals(elem)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
    private void regularizeIndexes() {
        DoubleLinkedListElement current = firstElement;
        for (int i = 0; i < size; i++) {
            current.setIndex(i);
            current = current.getNext();
        }
    }
}
