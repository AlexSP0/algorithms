package com.company;
//Задание 3.1
//        На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
//        Оцените время выполнения преобразования.
//Задание 3.2
//        На основе списка из задания 3.1 реализуйте основные методы добавления, удаления и получения объекта или элемента из списка.
//        Оценить выполненные методы с помощью базового класса System.nanoTime().
//Задание 3.3
//        Реализуйте простой односвязный список и его базовые методы.
//Задание 3.4
//        На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
//        Реализуйте список заполненный объектами из вашего класса из задания 1.3
//Задание 3.5
//        Реализуйте итератор на основе связанных списков из задания 3.4 и выполните базовые операции итератора.
//        Оцените время выполнения операций с помощью базового метода System.nanoTime()

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Duration d = new Duration(); //Объект для отсчета времени
        TrainingIntArray[] arr = new TrainingIntArray[10]; //массив объектов для заполнения списков
        initArrays(arr, 400, 100); //Заполняем массив инициализорованными объектами

        System.out.println("******************************************************** Задание 3.1 ********************************************");
        ArrayList<TrainingIntArray> arrList = task31(arr, d); //получаем список для задания 3.2

        System.out.println("******************************************************** Задание 3.2 ********************************************");
        task32(arrList, d);

        System.out.println("******************************************************** Задание 3.3 ********************************************");
        task33();

        System.out.println("******************************************************** Задание 3.4 ********************************************");
        task34();

        System.out.println("******************************************************** Задание 3.5 ********************************************");
        task35(d);

    }
    public static ArrayList<TrainingIntArray> task31 (TrainingIntArray[] arr, Duration d) {

        ArrayList<TrainingIntArray> arrList = new ArrayList<>(); //Создаем и заполняем
        LinkedList<TrainingIntArray> linkList = new LinkedList<>(); //создаем и заполняем
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
            linkList.add(arr[i]);
        }

        d.start();
        TrainingIntArray[] trArr = arrList.toArray(arr);
        System.out.println("Время на преобразование ArrayList в массив составляет: " + d.getStopTime());

        d.start();
        TrainingIntArray[] trArr2 = linkList.toArray(arr);
        System.out.println("Время на преобразование LinkedList в массив составляет: " + d.getStopTime());

        return arrList;
    }
    public static void task32(ArrayList<TrainingIntArray> arrList, Duration d) {
        d.start();
        TrainingIntArray some = arrList.get(0);
        System.out.println("Время на получение элемента в ArrayList составляет: " + d.getStopTime());

        d.start();
        arrList.remove(0);
        System.out.println("Время на удаление элемента в ArrayList составляет: " + d.getStopTime());

        TrainingIntArray arr = new TrainingIntArray(100);
        arr.randomizeArray(1000);
        d.start();
        arrList.add(0, arr);
        System.out.println("Время на добавление элемента в ArrayList составляет: " + d.getStopTime());
    }
    public static void task33() {
        SingleLinkedList<String> list = new SingleLinkedList<>(); //создаем простой односвязный список
        list.insert(new String("first")); //добавляем элементы
        list.insert(new String("second"));
        System.out.println("Список до удаления элемента:");
        list.display(); // список выводим в консоль
        list.delete(); //удаляем элемент
        System.out.println("Список после удаления элемента:");
        list.display();

    }
    public static void task34() {
        DoubleLinkedList<String> dlist = new DoubleLinkedList();
        dlist.add("One");
        dlist.add("Two");
        dlist.add("Three");
        dlist.add("Four");
        dlist.add("Five");
        dlist.Display();
        System.out.println("Список после:");
        dlist.remove("Four");
        dlist.set(1, "Set");
        dlist.addLast("Last");
        dlist.Display();

    }
    public static void task35(Duration d) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");
        list.add("Шестой");

        d.start();
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println("Проход всех элементов LinkedList составил: " + d.getStopTime());

    }
    public static void initArrays(TrainingIntArray[] arr, int size, int range) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new TrainingIntArray(size);
            arr[i].randomizeArray(range);
        }

    }
}
