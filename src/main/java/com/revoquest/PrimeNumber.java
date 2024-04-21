package com.revoquest;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        int counter = 0;
        for (int i = 2; i<n; i++) {
            if (n%i==0){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("prime number");
        } else {
            System.out.println("Not prime number");

        }

    }
}
