package com.company;

public class Vertex {
    private char label;
    private boolean isVisited;
    public Vertex(char label) {
        this.isVisited = false;
        this.label = label;
    }
    public char getLabel() { return label; }
    public boolean isVisited() { return isVisited; }
    public void setVisited(boolean v) {isVisited = v;}
}
