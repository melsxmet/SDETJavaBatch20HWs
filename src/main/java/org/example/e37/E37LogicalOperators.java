package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty= input.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy= input.nextBoolean();

        String drink;
        if (isThirsty&&!isSleepy){
            drink="water";
        } else if (isThirsty&&isSleepy) {
            drink="coffee";
        }else if(!isThirsty&&isSleepy){
            drink="tea";
        }else{
            drink="nothing";
        }

        System.out.println("Looks like you need to drink "+drink);
    }
}
