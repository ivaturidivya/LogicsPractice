package com.revoquest;

import sun.security.util.Length;

public class StringOperations {
    public static void main(String[] args) {
        String s = "GoodAfternoon Divya Please attend the meeting scheduled in next 10 minutes";
        System.out.println(s);
        int length = s.length();
        System.out.println("Legth of the string is " + length);
        String lowerCase = s.toLowerCase();
        System.out.println("LowerCase string is " + lowerCase);
        System.out.println("UpperCase string is " + s.toUpperCase());
        System.out.println(s.charAt(3));
        String s1= "Rajesh";
        System.out.println(s1.compareTo("Rajesh"));
        s=s.concat("Hello Happy Birthday Have a Nyc Day");
        System.out.println(s);
        boolean haveANycDay = s.endsWith("Have a Nyc");
        boolean meeting = s.contains("meeting");
        boolean helloHappy = s.startsWith("GoodAfternoon");
        System.out.println("Starts with method operation " + helloHappy);
        System.out.println("Contains method operation " + meeting);
        System.out.println(haveANycDay);
        int indexPosition = s.indexOf("Divya");
        System.out.println("index position of word Divya is " +indexPosition);
        String s3= "How are you";
        String[] splitArray = s3.split(" ");
        System.out.println(splitArray.length);


    }
}
