package com.company;

//Задание 4.1
//На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
//Оцените время выполнения операций с помощью базового метода System.nanoTime().

//Задание 4.2
//На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
//Реализуйте вспомогательные методы.
//Оцените время выполнения операций с помощью базового метода System.nanoTime().

//Задание 4.3
//На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
//Оцените время выполнения операций с помощью базового метода System.nanoTime().

//Задание 4.4
//Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
//Оцените время выполнения операций с помощью базового метода System.nanoTime().

//Задание 4.5
//На основе данных из задания 4.1 и 4.2, реализуйте стек и очередь на базе связанного списка.
//Оцените время выполнения операций с помощью базового метода System.nanoTime().

import java.util.PriorityQueue;

public class Main {
    private static Duration d;
    public static void main(String[] args) {
        d = new Duration();
        //Задание 4.1
        task41();

        //Задание 4.2
        task42();

        //Задание 4.3
        task43();

        //Задание 4.4
        task44();

        //Задание 4.5
        task45();
    }
    public static void task41() {
        System.out.println("**************************************************** Задание 4.1 ****************************************************");
        MySimpleStack<String> stack = new MySimpleStack();
        d.start();
        stack.push("First");
        System.out.println("Время добавления элемента в стек: " + d.getStopTime());
        stack.push("Second");
        stack.push("Third");
        System.out.println("Посдений элемент стека: " + stack.peek());
        while(!stack.isEmpty()) {
            System.out.println("В стеке: " + stack.pop());
        }
    }
    public static void task42() {
        System.out.println("**************************************************** Задание 4.2 ****************************************************");
        MyQueue<String> queue = new MyQueue<>();
        d.start();
        queue.push("First");
        System.out.println("Время добавления элемента в очередь: " + d.getStopTime());
        queue.push("Second");
        queue.push("Third");
        queue.push("Fourth");
        System.out.println("Пробуем peek: " + queue.peek());
        while(!queue.isEmpty()) {
            System.out.println("В очереди: " + queue.pop());
        }
    }
    public static void task43() {
        System.out.println("**************************************************** Задание 4.3 ****************************************************");
        MyDeque<String> deque = new MyDeque<>();
        d.start();
        deque.pushFront("First pushFront()");
        System.out.println("Время добавления элемента в дек: " + d.getStopTime());
        deque.pushFront("Second pushFront");
        deque.pushBack("pushBack");
        while(!deque.isEmpty()){
            System.out.println("popFront: " + deque.popFront());
        }
    }
    public static void task44() {
        System.out.println("**************************************************** Задание 4.4 ****************************************************");
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        d.start();
        pQueue.add(10);
        System.out.println("Время добавления элемента в приоритетную очередь: " + d.getStopTime());
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(40);
        pQueue.add(50);
        Integer buff;
        do {
            buff = pQueue.poll();
            if(buff!=null) { System.out.println("Элемент очереди: " + buff.toString()); }
        } while(buff!=null);
    }
    public static void task45() {
        System.out.println("**************************************************** Задание 4.5 ****************************************************");
        //Стек на связном списке
        MyStackOnLinkedList<String> lStack = new MyStackOnLinkedList<>();
        d.start();
        lStack.push("First");
        System.out.println("Время добавления элемента в стек на связном списке: " + d.getStopTime());
        lStack.push("Second");
        lStack.push("Third");
        while(!lStack.isEmpty()) {
            System.out.println("Элемент стека: " + lStack.pop());
        }
        //Очередь на связном списке
        MyQueueOnLinkedList<String> lQueue = new MyQueueOnLinkedList<>();
        d.start();
        lQueue.push("First");
        System.out.println("Время добавления элемента в очередь на связном списке: " + d.getStopTime());
        lQueue.push("Second");
        lQueue.push("Third");
        while (!lQueue.isEmpty()) {
            System.out.println("Элемент очереди: " + lQueue.pop());
        }
    }
}