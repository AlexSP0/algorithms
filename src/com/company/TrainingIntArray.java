package com.company;
import java.util.Arrays;
import java.util.Random;

public class TrainingIntArray {
    protected int[] array;
    protected Duration time;

    public TrainingIntArray(int size) {
        array = new int[size];
        time = new Duration();
    }

    public TrainingIntArray(TrainingIntArray arr) {  //создаем объект с одинаковыми массивами
        array = Arrays.copyOf(arr.getArray(), arr.getArray().length);
        time = new Duration();
    }

    public int[] getArray() { //получаем массив
        return array;
    }
    public void randomizeArray(int max) {  //заполняем случайными элементами
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(max);
        }
    }

    public void printArray() { //печатаем массив в консоль
        System.out.println(Arrays.toString(array));
    }

    public long lineSearch(int key) { //линейный или последовательный поиск
        time.start();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {System.out.println("Линейный поиск - значение: " + key + " найдено в массиве под индексом: " +i); }
        }
        return time.getStopTime();
    }

    public long binarySearch(int key) { // двоичный поиск
        int ind = -1;
        int low = 0;
        int high = array.length-1;
        time.start();
        while(low <= high) {
            int middle = (low+high)/2;
            if(array[middle] < key) {
                low = middle + 1;
            } else if (array[middle] > key ) {
                high = middle -1;
            } else if (array[middle] == key) {
                ind = middle;
                break;
            }
        }
        if(ind == -1 ) {
            System.out.println("Двоичный поиск - искомый элемент:" + key + " в массиве не найден");
        } else { System.out.println("Двоичный поиск - искомый элемент: " + key + " в массиве найден под индексом: " + ind); }
        return time.getStopTime();
    }

    public long arraySort() { //сортировка с помощью библиотечной функции
        time.start();
        Arrays.sort(array);
        return time.getStopTime();
    }
    public long bubbleSort() { //пузырьковая сортировка
        time.start();
        for (int i = array.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) { elementsSwap(j, j+1);}
            }
        }
        return time.getStopTime();
    }
    public long sortBySelectionMethod () { //сортировка методом выбора
        int length = array.length;
        time.start();
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int pos=i;
            for (int j = i; j < length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        return time.getStopTime();
    }
    public long sortByInsertionMethod() { //слортировка методом вставки
        int length = array.length;
        int buffer, in;
        time.start();
        for (int i = 1; i < length; i++) {
            buffer = array[i];
            in = i;
            while(in>0 && array[in-1] > buffer) {
                array[in] = array[in-1];
                --in;
            }
            array[in] = buffer;
        }
        return time.getStopTime();
    }
    private void elementsSwap(int a, int b) {
        int buffer = array[a];
        array[a] = array[b];
        array[b] = buffer;
    }
}