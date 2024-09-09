package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]names=new String[5];
        System.out.println("In:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("");
            names[i]= scanner.nextLine();
        }
        for(String name:names){
            if(name.length()>=3){
                System.out.println(name.substring(0,3));
            }else{
                System.out.println(name);
            }
        }





    }
}


