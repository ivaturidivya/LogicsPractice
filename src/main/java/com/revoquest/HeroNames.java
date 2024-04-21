package com.revoquest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HeroNames {
        public static void main(String[] args) {
            List<String> heroNames = new ArrayList<>();
            heroNames.add("Nani");
            heroNames.add("Naresh");
            heroNames.add("Mahesh");
            heroNames.add("Prabhas");
            heroNames.add("Nagachaithanya");
            heroNames.add("Nagarjuna");
            for(String name: heroNames){
                System.out.println(name);
            }
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            heroNames.stream()
                    .filter(name -> name.startsWith("N")).collect(Collectors.toSet())
                    .forEach(System.out::println);
        }
    }


