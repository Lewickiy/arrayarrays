package org.lewickiy.benchmark;

public abstract class Benchmark {
    long startTime;
    long endTime;

    protected Long getTimeInMs() {
        return (endTime - startTime);
    }

    protected void start() {
        startTime = System.nanoTime();
    }

    protected void end() {
        endTime = System.nanoTime();
    }
}
