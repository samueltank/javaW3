package com.me.app.fbncc;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    // array of starting numbers:
    private final ArrayList<Integer> sequence;
    int part1 = 0, part2 = 1;

    private Fibonacci() {
        super(); // always called
        sequence = new ArrayList<>();
        sequence.add(part1);
        sequence.add(part2);
    }

    // gets e sets:
    public ArrayList<Integer> getSequence() {
        return sequence;
    }
    // print arraylist in console:
    public void listSequence() {
        Object[] sequence = getSequence().toArray();
        System.out.println(Arrays.toString(sequence));
    }

    // recursive method for successive counting:
    public void sequencing(int sequenceLength) {
        int localSum;
        if (sequenceLength != 0) {
            localSum = part1 + part2;
            part1 = part2;
            part2 = localSum;
            sequence.add(localSum);
            sequencing(localSum, sequenceLength - 1);
        }
    }
    // recursive with overloading:
    public int sequencing(int sum, int sequenceLength) {
        int localSum;
        if (sequenceLength != 0) {
            localSum = part1 + part2;
            part1 = part2;
            part2 = localSum;
            sequence.add(localSum);
            return sequencing(localSum, sequenceLength - 1);
        } else {
            return -1;
        }
    }




    // Apply:
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        // the size of the sequence is measured after 0 and 1.
        fibonacci.sequencing(10);
        fibonacci.listSequence();
    }
}
