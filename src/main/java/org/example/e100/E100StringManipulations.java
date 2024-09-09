package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        String input= scanner.nextLine();
        String reverse="";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse+=input.charAt(i);
        }
        System.out.println(reverse);
    }
}
