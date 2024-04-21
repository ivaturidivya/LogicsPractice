package com.revoquest;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int sum = n;
        for (int i = n-1; i > 1; i--) {

            sum = sum * i;
        }
        System.out.println("Factorial of " + n +  " is " + sum );
    }
}
