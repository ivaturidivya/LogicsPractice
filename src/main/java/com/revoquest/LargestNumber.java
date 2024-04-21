package com.revoquest;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(65);
        numbers.add(50);
        numbers.add(70);
        numbers.add(250);
        numbers.add(45);

        int largestNum  = numbers.get(0);
        for(int i=1; i< numbers.size();i++){
            if (largestNum< numbers.get(i)){
                largestNum=numbers.get(i);
            }
        }
        System.out.println("Largest number is " + largestNum);
        int largeNum  = numbers.get(0);
        for (Integer num : numbers){
            if (largeNum<num){
                largestNum = num;
            }
        }
        System.out.println("Largest number using for each is " + largestNum);
    }
}
