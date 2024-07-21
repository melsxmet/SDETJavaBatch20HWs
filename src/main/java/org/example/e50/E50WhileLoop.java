package org.example.e50;

public class E50WhileLoop {
    public static void main(String[] args) {
        // Declare a variable i and set it to 7
        int i = 7;
        // Use a while loop to print the sequence of numbers from 7 to 98
        // Inside the loop, print the value of i
        // Increment the value of i by 7
        while (i <= 98) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

