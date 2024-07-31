package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        // Create an array of integers with the values {45, 78, 12, 67, 55, 89, 23, 77, 88}
        int[] values = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        // Use a loop to iterate through the array and print the values at specific indices to get the result 78, 55, 77
        for (int i = 1; i < values.length; i += 3) {
            System.out.print(values[i] + " ");
        }


    }
}
