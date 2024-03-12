package org.lewickiy;

import org.lewickiy.benchmark.BenchmarkReadSpeedLinkedListArray;
import org.lewickiy.benchmark.BenchmarkTwoDimensionalArray;

public class Main {
    public static void main(String[] args) {
        BenchmarkTwoDimensionalArray bmOne = new BenchmarkTwoDimensionalArray(5000, 5000);
        System.out.println("Time is ms. by row " + bmOne.getTimeByRow());
        System.out.println("Time is ms. by column " + bmOne.getTimeByColumn() + "\n");

        BenchmarkReadSpeedLinkedListArray bmTwo = new BenchmarkReadSpeedLinkedListArray(5000000);
        System.out.println("Read Array in ms. " + bmTwo.readArray());
        System.out.println("Read LinkedList in ms. " + bmTwo.readLinkedList() + "\n");
    }
}