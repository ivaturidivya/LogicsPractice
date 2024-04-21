package com.revoquest;

public class AmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int temp =n;
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum = sum + (r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Amstrong number is  " + sum);
        }
        else{
            System.out.println("Digit is not Amstrong number  " + sum);
        }

    }
}
