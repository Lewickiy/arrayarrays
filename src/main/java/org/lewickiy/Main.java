package org.lewickiy;

public class Main {
    public static void main(String[] args) {
        Benchmark benchmark = new Benchmark(5000, 5000);
        System.out.println("Time is ms. by row " + benchmark.getTimeByRow());
        System.out.println("Time is ms. by column " + benchmark.getTimeByColumn());
    }
}