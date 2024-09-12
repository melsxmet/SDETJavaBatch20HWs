package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {

        HashMap<Integer, String> studentDatabase = new HashMap<>();

        studentDatabase.put(101, "John");
        studentDatabase.put(102, "Emily");
        studentDatabase.put(103, "Michael");
        studentDatabase.put(104, "Sarah");
        studentDatabase.put(105, "David");

        System.out.println("Student IDs:");
        for (Integer studentID : studentDatabase.keySet()) {
            System.out.println("Student ID: " + studentID);
        }
        System.out.println();

        System.out.println("Student Names:");
        for (String studentName : studentDatabase.values()) {
            System.out.println("Student Name: " + studentName);
        }
        System.out.println();

        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentDatabase.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }
    }
}
