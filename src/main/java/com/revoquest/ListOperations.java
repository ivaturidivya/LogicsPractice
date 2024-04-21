package com.revoquest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println("#######################");
        for(int num : numbers){
            if (num%3==0 && num%5==0){
                System.out.println(num);
            }
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
        List<Integer> divByThreeAndDivByFive = numbers.stream()
                .filter(num -> (num % 3 == 0 && num % 5 == 0))
                .collect(Collectors.toList());
        divByThreeAndDivByFive.stream().forEach(System.out::println);


    }
}