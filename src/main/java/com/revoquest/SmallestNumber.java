package com.revoquest;

import java.util.ArrayList;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(65);
        numbers.add(50);
        numbers.add(70);
        numbers.add(250);
        numbers.add(45);

        int smallestNum  = numbers.get(0);
        for(int i=1; i< numbers.size();i++){
            if (smallestNum> numbers.get(i)){
                smallestNum=numbers.get(i);
            }
        }
        System.out.println("Smallest number is " + smallestNum);

        int smallNum = numbers.get(0);
        for(Integer num : numbers){
            if(smallNum>num){
                smallNum= num;
            }
        }
        System.out.println("Smallest number using for each  is " + smallestNum);
    }
}
