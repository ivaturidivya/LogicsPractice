package com.revoquest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> students  = new HashMap<>();

        students.put(1,"rajesh");
        students.put(2,"divya");

        System.out.println("1111->"+students);

        students.put(2,"anvesh");

        System.out.println("22222->"+students);

        Map<String, Integer> department = new HashMap<>();

        department.put("english",1);
        department.put("social",2);

        System.out.println(department);

        Map<Integer, Student> studentDetails  = new HashMap<>();

        studentDetails.put(1, new Student(1,"rajesh","chaganti","M",false));
        Student s2 =  new Student(2,"divya","ivaturi","F",true);
        studentDetails.put(2,s2);

        System.out.println(studentDetails);

    }
}
