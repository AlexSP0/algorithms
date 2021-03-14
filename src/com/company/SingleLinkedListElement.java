package com.company;

//Элемент одинарного связанного списка
public class SingleLinkedListElement<T>  {
    private T element;
    private SingleLinkedListElement<T> next;
    public SingleLinkedListElement(T elem) {this.element = elem;}
    public SingleLinkedListElement<T> getNext() {return this.next;}
    public void setNext(SingleLinkedListElement<T> next) {this.next = next;}
    public T getValue() {return element;}
}
