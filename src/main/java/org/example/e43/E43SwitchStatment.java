package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your electricity usage in kWh");
        int usage = input.nextInt();

        double bill = 0.0;
        boolean validUsage = true;

        if (usage < 0) {
            System.out.println("Invalid usage entered");
            validUsage = false;
        } else {
            switch (usage / 100) {
                case 0:
                    bill = usage * 0.12;
                    break;
                case 1:
                    bill = usage * 0.15;
                    break;
                case 2:
                    bill = usage * 0.2;
                    break;
                default:
                    bill = usage * 0.25;
            }
        }
        if (validUsage) {
            System.out.println("Your electricity bill is $" + bill);
        }

    }
}
