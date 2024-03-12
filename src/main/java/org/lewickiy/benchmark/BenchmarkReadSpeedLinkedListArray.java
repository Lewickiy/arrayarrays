package org.lewickiy.benchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkReadSpeedLinkedListArray extends Benchmark {
    List linkedList;
    List array;

    public Long readArray() {
        start();
        for (Object o : array) {
            var v = o;
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
        array = new ArrayList<Integer>();
        init(size);
    }
    private void init(int size) {
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
            array.add(i);
        }
    }
}
