package com.company;
//Задание 1.1
//        Алгоритмы из жизни:
//        1. Приготовление любого кулинарного блюда - алгоритм.
//        2. Подготовка к дивжению в автомобиле - алгоритм(закрытт двери, пристегнуть ремни, подрегулировать зеркала, повернуть ключ и т.д.)
//
//        Структуры данных из жизни:
//        1. Орфографический словарь - упорядоченная структура данных.
//        2. Телефонный справочник - упорядоченная структура данных
//
//
//        Задание 1.2.
//        Алгоритмы в программировании:
//        1. Пузырковая сортировка массива - алгоритм
//        2. Поиск элемента в неупорядоченном массиве - алгоритм
//
//        Структуры данных в программировании:
//        1. Список
//        2. Связанный список
//        3. Бинарное дерево.


public class Main {

    public static void main(String[] args) {
	// Задание 1.3
        int i = 3; //примитивный тип
        String str = new String("Ссылочный тип"); // str содержит адрес ячейки памяти объекта String
        InnerClass innerObject = new InnerClass(i); // Абстрактный тип данный с методами и полями.
        int[] arr = {1,2,3,4,5,6,7,8,9};
        long time = System.nanoTime();
        for (int j = 0; j < arr.length; j++) { //Перебор элементов
            if(arr[j] == innerObject.getField()) {
                System.out.println("Элемент найден в массиве с индексом "+ j);
            }
        }
        System.out.println("Прошло времени: " + (System.nanoTime() - time));

    }
    static class InnerClass {
        private int field; // поле класса (характеристика)
        private double field2; //другое поле класса (характеристика)
        public InnerClass(int f) { //метода класса (конструктор)
            field = f;
        }
        public int getField() { //еще один метод класса
            return field;
        }
        public void printField(){
            System.out.println(field);
        }
    }
}
