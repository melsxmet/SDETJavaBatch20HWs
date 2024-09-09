package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String input= scanner.nextLine();
        scanner.close();

        // Remove all spaces and convert the string to lowercase
        String originalStr=input.replaceAll(" ","").toLowerCase();
        // Print "true" if the string is a palindrome, and "false" otherwise
        String reverseStr= new StringBuilder(originalStr).reverse().toString();

        // Step 2: Create a Scanner object to read input from the console
        if(originalStr.equals(reverseStr)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
