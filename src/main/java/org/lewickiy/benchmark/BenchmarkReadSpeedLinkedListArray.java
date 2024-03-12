package org.lewickiy.benchmark;

import java.util.LinkedList;
import java.util.List;

public class BenchmarkReadSpeedLinkedListArray extends Benchmark {
    List linkedList;
    Integer[] array;

    public Long readArray() {
        start();
        for (Integer i : array) {
            var t = i;
        }
        end();
        return getTimeInMs();
    }
    public Long readLinkedList() {
        start();
        for (Object o : linkedList) {
            var t = o;
        }
        end();
        return getTimeInMs();
    }

    public BenchmarkReadSpeedLinkedListArray(int size) {
        linkedList = new LinkedList<Integer>();
        array = new Integer[size];
        init(size);
    }
    private void init(int size) {
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
            array[i] = i;
        }
    }
}
