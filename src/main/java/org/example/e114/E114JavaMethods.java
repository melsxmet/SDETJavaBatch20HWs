package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
        add(15,15);
        // Call the multiply method with arguments that multiply to 30
        multiply(3,10);
        // Call the subtract method with arguments that subtract to 20
        subtract(30,10);
    }

    // Create method add with two integer parameters and a print statement to display the result
    public static void add(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    // Create method multiply with two integer parameters and a print statement to display the result
    public static void multiply(int a,int b){
        System.out.println("Multiplication "+(a*b));
    }
    // Create method subtract with two integer parameters and a print statement to display the result
    public static void subtract(int a,int b){
        System.out.println("Subtraction "+(a-b));
    }
}
