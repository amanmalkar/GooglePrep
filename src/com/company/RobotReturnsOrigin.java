package com.company;

public class RobotReturnsOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        boolean result = returnsOrigin(moves);
        System.out.println(result);
    }

    public static boolean returnsOrigin(String input) {
        int x = 0, y = 0;
        for(char move: input.toCharArray()) {
            if(move == 'U') y++;
            else if(move == 'D') y--;
            else if(move == 'L') x--;
            else x++;
        }

        return x == 0 && y == 0;

    }
}
