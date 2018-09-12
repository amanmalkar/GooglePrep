package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingInArray {
    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> result = findMissing(nums);
        System.out.println(result);
    }

    public static List<Integer> findMissing(int[] input) {
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < input.length; i++) {
            int val = Math.abs(input[i]) - 1;
            if(input[val] > 0)
                input[val] = -input[val];
//            System.out.println(Arrays.toString(input) + " " + i);
        }

        for(int i =0; i < input.length; i++) {
            if(input[i] > 0)
                resultList.add(i+1);
        }
        return resultList;

    }
}

