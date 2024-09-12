package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;
    public static void main(String[] args) {
        // Create 2 instances of the class
        E121Variables instanceA= new E121Variables();
        E121Variables instanceB= new E121Variables();
        // Assign values to variables for the first instance
        instanceA.intValue=10;
        instanceA.doubleValue=10.23;
        instanceA.charValue='a';
        // Print values of the first instance
        System.out.println(instanceA.intValue);
        System.out.println(instanceA.doubleValue);
        System.out.println(instanceA.charValue);
        // Assign values to variables for the second instance
        instanceB.intValue=100;
        instanceB.doubleValue=100.23;
        instanceB.charValue='s';
        // Print values of the second instance
        System.out.println(instanceB.intValue);
        System.out.println(instanceB.doubleValue);
        System.out.println(instanceB.charValue);
    }
}
