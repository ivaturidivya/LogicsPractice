package com.revoquest;

import java.util.ArrayList;
import java.util.List;

public class ElementsInArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(50);
        numbers.add(70);
        numbers.add(80);
        numbers.add(30);

        int sum = 0;
        for(int i=0; i< numbers.size();i++){
            sum=sum+numbers.get(i);
        }
        System.out.println("sum of the elements in integer array is " + sum);
        sum =0;
        for(Integer num : numbers){
            sum = sum+num;
        }
        System.out.println("sum of the elements in integer array using for each is  " + sum);
    }
}
