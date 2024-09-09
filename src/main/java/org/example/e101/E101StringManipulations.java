package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        String input= scanner.nextLine();

        for (int i = 0; i < input.length(); i+=2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
