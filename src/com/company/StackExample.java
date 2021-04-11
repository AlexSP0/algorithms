package com.company;

public class StackExample {
    public void Run() {
        System.out.println("Стек вызовов:");
        firstMethod();
    }
    private void firstMethod() {
        System.out.println("Запущен метод 1!");
        secondMethod();
        System.out.println("Выход из метода 1");
    }
    private void secondMethod() {
        System.out.println("Запущен метод 2!");
        thirdMethod();
        System.out.println("Выход из метода 2");
    }
    private void thirdMethod() {
        System.out.println("Запущен метод 3!");
        fourthMethod();
        System.out.println("Выход из метода 3");
    }
    private void fourthMethod() {
        System.out.println("Запущен метод 4!");

        System.out.println("Выход из метода 4");
    }
    public int getFactorial(int n) {
        System.out.println("вычисляем факториал от " + n);
        if(n<=1) {
            return 1;
        } else {
            return getFactorial(n-1);
        }

    }
}
