package com.company;

public class TrainingIntArrayRecursion extends  TrainingIntArray {
    public TrainingIntArrayRecursion(int size) {
        super(size);
    }
    public TrainingIntArrayRecursion(TrainingIntArray arr) {
        super(arr);
    }
    public long startBinarySearchRecursion(int key) {
        time.start();
        binarySearchWithRecursion(array, 0 , array.length-1, key);
        return time.getStopTime();

    }
    public int binarySearchWithRecursion(int[] arr, int l,
                                          int r, int x)
    {
        if (r >= l && l<arr.length-1) {

            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearchWithRecursion(arr, l, mid - 1, x);
            return binarySearchWithRecursion(arr, mid + 1, r, x);
        }
        return -1;
    }
    public long startMergeSort() {
        time.start();
        mergeSort(array);
        return time.getStopTime();
    }
    private int[] mergeSort(int[] arr) { // сортировка Массива который передается в функцию
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        int[] arrB = new int[arr.length / 2];
        System.arraycopy(arr, 0, arrB, 0, arr.length / 2);
        int [] arrC = new int[arr.length - arr.length / 2];
        System.arraycopy(arr, arr.length / 2, arrC, 0, arr.length - arr.length / 2);
        arrB = mergeSort(arrB);
        arrC = mergeSort(arrC);
        return mergeArray(arrB, arrC);
    }
    private int[] mergeArray(int[] a1, int[] a2) {
        int[] b = new int[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;

        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
            } else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
            } else if(a1[positionA1] < a2[positionA2]){
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }
}
