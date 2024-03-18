package org.lewickiy;

import org.lewickiy.benchmark.BenchmarkReadSpeedLinkedListArray;
import org.lewickiy.benchmark.BenchmarkTwoDimensionalArray;
import org.lewickiy.benchmark.RemoveFirstFromLinkedListOrArray;

public class Main {
    public static void main(String[] args) {
        //Время чтения ArrayList или LinkedList
        BenchmarkReadSpeedLinkedListArray bmTwo = new BenchmarkReadSpeedLinkedListArray(5000000);
        System.out.println("Read Array in ms. " + bmTwo.readArray());
        System.out.println("Read LinkedList in ms. " + bmTwo.readLinkedList() + "\n");

        /*
        Удаление первого элемента из ArrayList или LinkedList. В зависимости от размера коллекций:
        на ~5 элементах ArrayList быстрее
        на 900-25000 скорость примерно одинаковая
        на больших размерах LinkedList быстрее и стабилен в скорости вне зависимости от размера
        */
        RemoveFirstFromLinkedListOrArray bmThree = new RemoveFirstFromLinkedListOrArray(5);
        System.out.println("Remove first Array in ms. " + bmThree.removeFirstFromArray());
        System.out.println("Remove first LinkedList in ms. " + bmThree.removeFirstFromLinkedList() + "\n");
    }
}