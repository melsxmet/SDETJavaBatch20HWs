package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input
        System.out.println("Do you need a loan? (true/false)");
        Boolean needsLoan=input.nextBoolean();
        // Check if the user needs a loan
        // If the user needs a loan
        //    Print prompt for user to enter their credit score
        //    Capture the credit score input
        //    Determine eligibility based on credit score
        //        If credit score is below 600, eligibility = "Not eligible"
        //        If credit score is between 600 and 700 inclusive, eligibility = "Maybe eligible"
        //        If credit score is between 701 and 800 inclusive, eligibility = "Eligible"
        //        If credit score is higher than 800, eligibility = "Definitely eligible"
        // If the user does not need a loan, eligibility = "Unknown"
        if(needsLoan.equals(true)){
            System.out.println("What is your credit score?");
            int creditScore=input.nextInt();

            if(creditScore<600){
                System.out.println("The eligibility is Not Eligible");
            }else if(creditScore<700) {
                System.out.println("The eligibility is Maybe eligible");
            }else if(creditScore<800){
                System.out.println("The eligibility is Eligible");
            }else if(creditScore>800){
                System.out.println("The eligibility is Definitely eligible");
            }
        }else{
            System.out.println("The eligibility is Unknown");
        }
        // Print the eligibility status

    }
}
