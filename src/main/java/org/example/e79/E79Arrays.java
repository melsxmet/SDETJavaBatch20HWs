package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        // Declare an array to store the sums of each row
        int[] rowSums=new int[a.length];
        // Use nested loops to iterate through the 2D array and calculate the sum of each row
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            rowSums[i]=sum;
            System.out.println(rowSums[i]);
        }
        // Store the sums in the new array

        // Print the values of the new array

    }
}
