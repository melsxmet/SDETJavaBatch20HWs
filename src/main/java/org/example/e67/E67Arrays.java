package org.example.e67;

public class E67Arrays {
    public static void main(String[] args) {
        // Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        // Use a loop to iterate through the array and print the values at even indices followed by a space
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
