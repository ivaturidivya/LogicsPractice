package com.revoquest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsPractice2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Tam");
        names.add("Jerry");
        names.add("Kim");
        names.add("Jack");
        int len = names.size();
        for (int i = 0; i < len; i++) {
            System.out.println(names.get(i));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Set<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("Orange");
        fruits.add("Apples");
        System.out.println(fruits);
    }
}
