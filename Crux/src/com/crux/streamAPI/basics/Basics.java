package com.crux.streamAPI.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basics {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 1, 3);
        // Stream<Integer> stream = list.stream()
        Stream<Integer> stream = list.parallelStream()    //multithreading
                .filter(data -> data % 2 == 0)
                .map(data -> data * 2);
        stream.forEach(data -> System.out.print(data + " "));

        System.out.println();

        Stream<Integer> sorted = list.stream()
                .sorted();     //Don't use parallelStream when working with .sorted().
        sorted.forEach(data -> System.out.print(data + " "));
    }

}
