package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend= input.nextBoolean();
        System.out.println("Are you available? (true/false)");
        boolean isAvailable=input.nextBoolean();

        String subject = "";
        if(isWeekend&&isAvailable){
            subject="Java";
        }else if(!isWeekend&&isAvailable){
            subject="manual testing";
        }else if(!isAvailable){
            subject="no subject";
        }

        System.out.println("Today you will be learning "+subject);

    }
}
