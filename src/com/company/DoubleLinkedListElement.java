package com.company;

public class DoubleLinkedListElement<T> {
    private T element;
    private DoubleLinkedListElement<T> previous;
    private DoubleLinkedListElement<T> next;
    private int index;
    public DoubleLinkedListElement(T elem, int index) {
        this.element = elem;
        this.index = index;
    }
    public void setIndex (int index) { this.index = index;}
    public int getIndex () {return index;}
    public DoubleLinkedListElement<T> getPrevious() {return previous;}
    public void setPrevious(DoubleLinkedListElement<T> prev) {this.previous = prev;}
    public DoubleLinkedListElement<T> getNext () {return next;}
    public void setNext(DoubleLinkedListElement<T> next) {this.next = next;}
    public T getValue() {return element;}
    public void setValue(T newValue) {element=newValue;}

}
