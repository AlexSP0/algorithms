package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final int MAX_VERTEXS = 24;
    private Vertex[] vertexlist;
    private int[][] adjMatrix;
    private int size;
    private Stack<Integer> stack;

    public Graph() {
        vertexlist = new Vertex[MAX_VERTEXS];
        adjMatrix = new int[MAX_VERTEXS][MAX_VERTEXS];
        size = 0;
        stack = new Stack<>();
    }
    public void addVertex(char label) {
        vertexlist[size++] = new Vertex(label);
    }
    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;

    }
    public void displayVertex(int v) {
        System.out.println(vertexlist[v].getLabel());
    }
    public void displayVertex(int v1, int v2) {
        System.out.println("Вершины: " + vertexlist[v1].getLabel() + "-" + vertexlist[v2].getLabel());
    }
    private int getAdjUnvisitedVertex(int vertex) {
        for (int i = 0; i < size; i++) {
            if(adjMatrix[vertex][i] != 0 && vertexlist[i].isVisited()==false){
                return i;
            }
        }
        return -1;
    }
    public void dfs() {
        vertexlist[0].setVisited(true);
        displayVertex(0);
        stack.push(0);
        while(!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if(v == -1) {
                stack.pop();
            } else {
                vertexlist[v].setVisited(true);
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexlist[i].setVisited(false);
        }
    }
    public void dfs(int vertex) {
        vertexlist[vertex].setVisited(true);
        for (int i = 0; i < size; i++) {
            int v = getAdjUnvisitedVertex(vertex);
            if(!vertexlist[v].isVisited() && v !=-1 ) {
                displayVertex(vertex, v);
                dfs(i);
            }
        }
    }
    public void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        displayVertex(0);
        queue.add(0);
        int v2;
        while(!queue.isEmpty()) {
            int v1 = queue.remove();
            while((v2=getAdjUnvisitedVertex(v1))!=-1) {
                vertexlist[v2].setVisited(true);
                displayVertex(v2);
                queue.add(v2);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexlist[i].setVisited(false);
        }
    }
    public void bfs(int vertex) {
        int[] queue = new int[size];
        int qH = 0; int qT = 0;
        vertexlist[0].setVisited(true);
        queue[qT++] = vertex;
        displayVertex(0);
        int v2;
        while (qH < qT) {
            vertex = queue[qH++];
            for (int i = 0; i < size; i++) {
                v2 = getAdjUnvisitedVertex(vertex);
                if(!vertexlist[i].isVisited() && v2 != -1){
                    vertexlist[i].setVisited(true);
                    displayVertex(qT);
                    queue[qT++]=i;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            vertexlist[i].setVisited(false);
        }
    }

}
