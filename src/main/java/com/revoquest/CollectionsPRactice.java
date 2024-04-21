package com.revoquest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsPRactice {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<>();

        //ArrayList<String> names1 = new ArrayList<>();

        names.add("rajesh");
        names.add("divya");
        names.add("nagesh");
        names.add("suresh");
        names.add("mahesh");
        names.add("kalesh");
        names.add("kotesh");

        int len= names.size();
        for(int i=0;i<len;i++){
            System.out.println(names.get(i));
        }

        System.out.println("***************");

        for(String name: names){
            System.out.println(name);
        }
        System.out.println("***************");
        names.stream().forEach(System.out::println);

        System.out.println("***************");

        names.stream().forEach(name -> System.out.println(name.toUpperCase()));

        System.out.println("***************");

        names.stream().forEach(name -> {
            if(name.equals("divya")) {
                System.out.println(name.toUpperCase());
            } else {
                System.out.println(name);
            }
        });
        System.out.println("*******just print data********");

        names.stream()
                .filter(name -> (name.length() > 5 && name.endsWith("esh")))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("*******filter data and get into set********");

        Set<String> esh = names.stream()
                .filter(name -> (name.length() > 5 && name.endsWith("esh")))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        esh.stream().forEach(name  -> System.out.println(name));
    }
}
