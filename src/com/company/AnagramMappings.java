package com.company;

import java.util.*;

public class AnagramMappings {
    public static void main(String[] args) {
        int[] A = new int[] {12, 28, 46, 32, 50};
        int[] B = new int[] {50, 12, 32, 46, 28};

        int[] result = anagramMappings(A,B);

        System.out.println(Arrays.toString(result));

    }

    public static int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int[A.length];
        Map<Integer, Deque<Integer>> elementPositionMap = new HashMap<>();
        for(int i = 0; i < B.length; i++)
            elementPositionMap.computeIfAbsent(B[i], k -> new LinkedList<>()).push(i);

        for(int i =0; i < A.length; i++)
            result[i] = elementPositionMap.get(A[i]).pop();

        return result;
    }
}
