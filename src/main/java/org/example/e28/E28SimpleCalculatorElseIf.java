package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String operator="*";

        // Declare two variables for numbers and assign values
        int num1=10;
        int num2=5;

        // Perform the corresponding arithmetic operation
        if(operator.equals("+")){
            System.out.println("The sum is: 15");
        }else if(operator.equals("-")){
            System.out.println("The difference is: 5");
        }else if(operator.equals("*")){
            System.out.println("The product is: 50");
        }else if(operator.equals("/")){
            System.out.println("The quotient is: 2");
        }else{
            System.out.println("Invalid operator");
        }

    }
}
