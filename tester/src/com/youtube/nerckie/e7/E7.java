package com.youtube.nerckie.e7;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class E7 {

    public static void subsIndexInt(Integer n, int i,
                                             @NotNull ArrayList<Integer> arrayList) {
        arrayList.set(arrayList.indexOf(n), i);
    }
    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(14);
        sequence.add(37);
        sequence.add(25);
        sequence.add(49);
        sequence.add(65);
        sequence.add(73);
        sequence.add(5);
        sequence.add(9);
        sequence.add(45);

        sequence.forEach((n) -> {
            if (n > 37) {
                int i = n + 45;
//                sequence.set(sequence.indexOf(n), i);
                subsIndexInt(n,i,sequence);
            } else if (n == 37) {
                int i = n + 10;
//                sequence.set(sequence.indexOf(n), i);
                subsIndexInt(n,i,sequence);
            }
        });

        System.out.println(sequence);
    }
}
