package com.revoquest;

public class ReverseOfTheNum {
    public static void main(String[] args) {
        int n = 121;
        int rev = 0;
        int temp = n;
        while (n != 0) {
            rev = rev *10+(n%10);
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + rev);
        if (temp==rev){
            System.out.println("Given digit is a pallendrome");
        }
        else {
            System.out.println("Digit is not pallendrome");
        }
    }
}




