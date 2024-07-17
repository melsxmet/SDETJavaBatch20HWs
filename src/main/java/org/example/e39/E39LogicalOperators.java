package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your mark");
        int marks = input.nextInt();

        String grade = "";
        if (marks >= 1 && marks <= 25) {
            grade = "F";
        } else if (marks >= 26 && marks <= 45) {
            grade = "E";
        } else if (marks >= 46 && marks <= 50) {
            grade = "D";
        } else if (marks >= 51 && marks <= 60) {
            grade = "C";
        } else if (marks >= 61 && marks <= 80) {
            grade = "B";
        } else if (marks > 80 && marks <= 100) {
            grade = "A";
        } else {
            grade = "invalid";
        }

        if (grade.equals("invalid")) {
            System.out.println("Please enter valid mark");
        } else {
            System.out.println("Your grade is " + grade);


        }
    }
}
