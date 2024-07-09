package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
        int score=85;

        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()

        // Expected output: "Your grade is: B"
        if(score>90){
            System.out.println("Your grade is: A");
        }else if(score>80){
            System.out.println("Your grade is: B");
        }else if(score>70){
            System.out.println("Your grade is: C");
        }else if(score>60){
            System.out.println("Your grade is: D");
        }else{
            System.out.println("Your grade is: F");
        }
    }
}