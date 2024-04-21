package com.revoquest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

        public static void main(String[] args) {
            List<Integer> numbers=  new ArrayList<>();
            numbers.add(10);
            numbers.add(25);
            numbers.add(20);
            numbers.add(45);
            numbers.add(60);
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.println("Even numbers from the given list is " + num);
                }
            }
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            List<Integer> evenNum = numbers.stream()
                    .filter(num -> (num % 2 == 0))
                    .collect(Collectors.toList());
              evenNum.stream().forEach(System.out ::println);

        }
    }


