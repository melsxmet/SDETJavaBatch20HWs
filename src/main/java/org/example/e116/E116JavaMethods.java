package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        boolean result=bothEven(3,5);
        System.out.println(result);
    }

    // Create method bothEven with two integer parameters
    public static boolean bothEven(int a, int b) {
        // Inside the method, check if both numbers are even
        if(a%2==0 && b%2==0){
        // Return true if both numbers are even, otherwise return false
            return true;
        }else{
            return false;
        }
    }
}
