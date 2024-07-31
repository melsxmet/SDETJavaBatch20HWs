package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int sum = 0;
        // Use nested loops to iterate through the 2D array and calculate the sum of all elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                sum += a[i][j];
        }
        // Print the calculated sum
        System.out.println(sum);
    }
}
