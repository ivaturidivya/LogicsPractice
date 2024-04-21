package com.revoquest;

public class VowelsCount {
    public static void main(String[] args) {
        String s = "How are you Divya";
        s= s.toLowerCase();
        int vowelsCount=0,consonentCount=0;
        int length = s.length();
        for (int i=0;i<length;i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelsCount++;
            }
            else{
                consonentCount++;
            }
        }
        System.out.println("No of vowels in the string is " + vowelsCount + " No of consonents in the string is " + consonentCount );
    }

}
