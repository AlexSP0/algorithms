package com.company;

public class LoopRecursion {
    public void Run(Duration d, int num) {
        System.out.println("Вычисляем факториал с помощью цикла");
        d.start();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
        }
        System.out.println("Факториал для " + num + " равен " + result + " затраченное время: " + d.getStopTime());

        System.out.println("Вычисляем факториал путем рекурсии");
        d.start();
        getFactorial(num);
        System.out.println("Факториал для " + num + " равен " + result + " затраченное время: " + d.getStopTime());
    }
    public int getFactorial(int n) {
        if(n<=1) {
            return 1;
        } else {
            return getFactorial(n-1);
        }

    }
}
