package com.company;
//Задание 5.1
//    Приведите пример использования рекурсии.
//Задание 5.2
//    Реализуйте простой пример бесконечной рекурсии и обычной рекурсии с условием для выхода.
//Задание 5.3
//    Приведите пример изображающий стек вызова и стек вызова с рекурсией.
//Задание 5.4
//    Реализуйте простой алгоритм использующий цикл и простой алгоритм использующий рекурсию.
//    Оцените два алгоритма с помощью базового метода System.nanoTime().
//Задание 5.5
//    Реализуйте алгоритм двоичного рекурсивного поиска на основе массива из задания 2.1.
//    Оцените алгоритм двоичного рекурсивного поиска с помощью базового метода System.nanoTime() и сравните с обычным двоичным поиском.
//Задание 5.6
//    На основе массива из задания 2.1 реализуйте алгоритм сортировки слиянием.
//    Оцените алгоритм сортировки слиянием с помощью базового метода System.nanoTime() и сравните с сортировкой методом sort().



//Задание 5.1
//Пример рекурсии: начисление банковских процентов, вычисление чисел Фибоначчи

public class Main {

    public static void main(String[] args) {
        task52();
        task53();
        task54();
        task55();
        task56();
    }

    public static void task52() {
        //Бесконечная рекурсия
        System.out.println("Пример бесконечной рекурсии");
//        try {
//            someCalculation(1);
//        } catch (StackOverflowError q) {
//            System.out.println("Переполнение стека вызовов!");
//        }
        //Рекурсия с условием для выхода
        someCalculation2(1);
    }

    public static void task53() {
        //Обычный стек
        StackExample st = new StackExample();
        st.Run();
        //Стек с рекурсией
        st.getFactorial(10);
    }
    public static void task54() {
        LoopRecursion lr = new LoopRecursion();
        Duration d = new Duration();
        lr.Run(d, 10);
    }
    public static void task55() {
        TrainingIntArray array = new TrainingIntArray(100); //создаем объект
        array.randomizeArray(10); // инициализируем его случайными числами
        array.arraySort(); //сортируем
        TrainingIntArrayRecursion recursionArray = new TrainingIntArrayRecursion(array); //создаем объект с такими же числами
        System.out.println("Время выполнения обычного бинарного поиска составило: " + array.binarySearch(1));
        System.out.println("Время выполнения рекурсивного бинарного поиска составило: " + recursionArray.startBinarySearchRecursion(1));

    }
    public static void task56() {
        TrainingIntArray array = new TrainingIntArray(100);
        array.randomizeArray(100);
        TrainingIntArrayRecursion rArr = new TrainingIntArrayRecursion(array);

        System.out.println("Время обычной сортировки массива составило: " + array.arraySort());
        System.out.println("Время сортировки методом слияния составило: " + rArr.startMergeSort());
    }
    public static int someCalculation (int number) {
        System.out.println(number);
        return someCalculation(number*10);
    }
    public static int someCalculation2 (int number) {
        System.out.println(number);
        if(number>100000) return number; else return someCalculation2(number*10);
    }

}