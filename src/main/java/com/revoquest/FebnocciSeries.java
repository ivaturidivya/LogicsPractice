package com.revoquest;

public class FebnocciSeries {
    public static void main(String[] args) {
        int a=0,b=1,sum =0;
        sum = a+b;
        System.out.print(a+" " +  b + " " + sum);
        while(sum<100){
            a=b;
            b=sum;
            sum=a+b;
            System.out.print(" " + sum );
        }


    }
}
