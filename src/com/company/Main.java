package com.company;
//Задание 2.1
//        На основе программного кода из домашнего задания №1 реализуйте массив на основе существующих примитивных или ссылочных типов данных.
//        Выполните обращение к массиву и базовые операции класса Arrays.
//        Оценить выполненные методы с помощью базового класса System.nanoTime().
//        Задание 2.2
//        На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
//        Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(), при необходимости расширьте уже существующий массив данных.
//        Задание 2.3
//
//        Создайте массив размером 400 элементов.
//        Выполните сортировку с помощью метода sort().
//        Оцените сортировку с помощью базового класса System.nanoTime().
//        Задание 2.4
//        На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
//        Оцените сортировку с помощью базового класса System.nanoTime().
//        Сравните время выполнения алгоритмы сортировки методом sort() из задания 2.1 и сортировку пузырьком.
//        Задание 2.5
//        На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
//        Оцените сортировку с помощью базового класса System.nanoTime().
//        Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.
//        Задание 2.6
//        На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом вставки.
//        Оцените сортировку с помощью базового класса System.nanoTime().
//        Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3, 2.4 и 2.5.


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TrainingIntArray arr = new TrainingIntArray(400); //создаем массив
        arr.randomizeArray(101); //заполняем случайными числами
        TrainingIntArray arr21 = new TrainingIntArray(10); //небольшой массив для задания 2.1
        TrainingIntArray arr22 = new TrainingIntArray(arr); //создаем отдельные массивы для каждого задания
        TrainingIntArray arr23 = new TrainingIntArray(arr); //важно, чтобы замеры времени были точными
        TrainingIntArray arr24 = new TrainingIntArray(arr); //иметь одинаковые массивы для всех заданий
        TrainingIntArray arr25 = new TrainingIntArray(arr);
        TrainingIntArray arr26 = new TrainingIntArray(arr);


        //Задание 2.1
        arr21.randomizeArray(11);
        System.out.println("********************************************************** Задание 2.1 ****************************************");
        System.out.println(Arrays.toString(arr21.getArray()));
        System.out.println("Время сортировки массива составило: " + arr21.arraySort());
        System.out.println(Arrays.toString(arr21.getArray()));


        //Задание 2.2
        System.out.println("********************************************************** Задание 2.2 ****************************************");
        System.out.println("Время линейного поиска составило: " + arr22.lineSearch(5));
        arr22.arraySort(); //сортируем перед поиском
        System.out.println("Время бинарного поиска составило: " + arr22.binarySearch(5));

        //Задание 2.3
        System.out.println("********************************************************** Задание 2.3 ****************************************");
        System.out.println("Время сортировки массива с помощью sort(): " + arr23.arraySort());

        //Задание 2.4
        System.out.println("********************************************************** Задание 2.4 ****************************************");
        System.out.println("Время сортировки массива пузырьковым методом составило: " + arr24.bubbleSort());
//
//      Задание 2.5
        System.out.println("********************************************************** Задание 2.5 ****************************************");
        System.out.println("Время сортировки массива методом выбора: " + arr25.sortBySelectionMethod());

        //Задание 2.6
        System.out.println("********************************************************** Задание 2.6 ****************************************");
        System.out.println("Время сортировки массива методом вставки: " + arr26.sortByInsertionMethod());

    }

}
