package com.company;

public class SingleLinkedList<T> {
    private SingleLinkedListElement<T> first;

    public SingleLinkedList() { first=null; }
    public boolean isEmpty() { return (first == null);}
    public void insert(T elem) {
        SingleLinkedListElement<T> element = new SingleLinkedListElement<>(elem);
        element.setNext(first);
        first = element;
    }
    public SingleLinkedListElement<T> delete () {
        SingleLinkedListElement<T> buff = null;
        if(first != null) {
            buff = first;
            first = first.getNext();
        }
        return buff;
    }
    public void display() {
        SingleLinkedListElement<T> currentElem = first;
        while(currentElem != null) {
            System.out.println(currentElem.getValue());
            currentElem = currentElem.getNext();
        }
    }
    public T find (T searchElem) {
        SingleLinkedListElement<T> currentElem = first;
        SingleLinkedListElement<T> find = new SingleLinkedListElement<>(searchElem);
        while(currentElem != null) {
            if( currentElem.getValue().equals(find.getValue())) {
                return find.getValue();
            }
            currentElem = currentElem.getNext();
        }
        return null;
    }
}
