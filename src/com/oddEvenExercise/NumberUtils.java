package com.oddEvenExercise;

public abstract class NumberUtils {
    public static boolean areAllEven(int numero){
        numero= Math.abs(numero);
        char[] digits= String.valueOf(numero).toCharArray();
        for(char digit: digits){
            if(digit % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean areAllOdd(int numero){
        numero= Math.abs(numero);
        char[] digits= String.valueOf(numero).toCharArray();
        for(char digit: digits){
            if(digit % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
