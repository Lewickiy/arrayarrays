package org.lewickiy.benchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveFirstFromLinkedListOrArray extends Benchmark {
    List linkedList;
    ArrayList array;

    public Long removeFirstFromArray() {
        start();
        array.remove(0);
        end();
        return getTimeInMs();
    }
    public Long removeFirstFromLinkedList() {
        start();
        linkedList.remove(0);
        end();
        return getTimeInMs();
    }

    public RemoveFirstFromLinkedListOrArray(int size) {
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
