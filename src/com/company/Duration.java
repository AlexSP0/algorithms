package com.company;

public class Duration {
    private long startTime = 0;
    public void start() {
        startTime = System.nanoTime();
    }
    public void stop() {
        System.out.println(System.nanoTime() - startTime);
    }
    public long getStopTime() {
        return System.nanoTime() - startTime;
    }
}
