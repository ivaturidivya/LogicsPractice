package com.revoquest;

public class SwapNumWithoutThirdVariable {
    public static void main(String[] args) {

        int a=10,b=20;
       // before swapping
        System.out.println("Before swapping the value of a = " + a + " The value of b = "+ b);
        a=a+b;// 10+20=30;   a=30
        b=a-b;// 30-20=10;   b=10
        a=a-b;// 30-10;      a=20

        // after swapping
        System.out.println("After swapping the value of a = " + a  +  " The value of b = "+ b);


    }
}
