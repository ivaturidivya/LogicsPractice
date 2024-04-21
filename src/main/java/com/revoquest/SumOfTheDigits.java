package com.revoquest;

public class SumOfTheDigits {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n != 0) {
            //sum = sum + (n % 10);
            sum+=(n%10);
            n = n / 10;
        }
        System.out.println("Sum of the Digits in n is  " + sum);
    }
}




