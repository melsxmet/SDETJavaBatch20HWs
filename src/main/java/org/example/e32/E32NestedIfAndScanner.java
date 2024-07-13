package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter gender
        // Capture the gender input
        System.out.println("Please enter your gender: M or F");
        char gender=input.next().charAt(0);

        // Print prompt for user to enter age
        // Capture the age input
        System.out.println("Please enter your age");
        int age=input.nextInt();

        // Classify based on gender and age
        if(age>25){
            if(gender=='F'){
                System.out.println("Woman");
            }else{
                System.out.println("Man");
            }
        }else{
            if(gender=='F'){
                System.out.println("Girl");
            }else{
                System.out.println("Boy");
            }
        }
        input.close();

        // Create a Scanner object to read input from the console



    }
}
