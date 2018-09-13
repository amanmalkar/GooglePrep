package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Deque;
import java.util.LinkedList;

public class SequenceOperations {
    public static void main(String[] args) {
        String input = "1+5*2-3*4+5-7";
        int result = sequenceOps(input);
        System.out.println(result);
    }

    public static int sequenceOps(String input) {
        Deque<String> buffer = new LinkedList<>();
        for(int i = 0 ; i < input.length(); i++) {
            if(input.charAt(i) != '*')
                buffer.push(String.valueOf(input.charAt(i)));
            else {
                int first = Integer.valueOf(buffer.pop());
                int second = Integer.valueOf(String.valueOf(input.charAt(i + 1)));
                buffer.push(String.valueOf(first * second));
                i += 1;
            }
        }
        System.out.println(buffer);

        int result = 0;
        int first = 0, second = 0;
        while (!buffer.isEmpty()) {
            String poppedItem = buffer.pollLast();
            if(poppedItem.equals("+")) {
                second = Integer.parseInt(buffer.pollLast());
                System.out.println("First = " + first + " second = " + second);
                result = first + second;
                first = result;
            }
            else if(poppedItem.equals("-")) {
                second = Integer.parseInt(buffer.pollLast());
                System.out.println("first = " + first + "second = " + second);
                result = first - second;
                first = result;
            }
            else
                first = Integer.parseInt(poppedItem);

            System.out.println("result " + result);
        }
        return result;
    }
}
