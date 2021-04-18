package com.company;
//Задание 7.1
//        Приведите пример графа.
//Задание 7.2
//        Реализуйте базовые методы графа.
//Задание 7.3
//        В программный код из задания 7.2 добавьте реализацию метода обхода в глубину.
//        Выполните оценку времени с помощью System.nanoTime().
//Задание 7.4
//        В базовом графе из задания 7.2 реализуйте метод обхода в ширину.
//        Выполните оценку времени с помощью System.nanoTime().

public class Main {
    private static Duration d = new Duration();
    public static void main(String[] args) {
        task71();
        task72();
        task73();
        task74();
    }
    public static void task71() {
        //Железнодорожные пути с указаниями расстояний можно представить в виде графов
    }
    public static void task72() {
        Graph graph = setGraph();
        graph.displayVertex(1);
    }
    public static void task73() {
        Graph graph = setGraph();
        d.start();
        graph.dfs();
        System.out.println("Время обхода графа в глубину составило: " + d.getStopTime());
    }
    public static void task74() {
        Graph graph = setGraph();
        d.start();
        graph.bfs();
        System.out.println("Время обхода графа в ширину составило: " + d.getStopTime());
    }
    private static Graph setGraph() {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(3,6);
        graph.addEdge(4,7);
        graph.addEdge(5,8);
        return graph;
    }
}