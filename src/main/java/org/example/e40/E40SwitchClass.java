package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter name of the instructor");
        String instructorName=input.next();

        String responsibility;
        if (instructorName.equals("Asghar")){
            responsibility="Will take care of Java Assignment";
        }else if(instructorName.equals("Moazzam")){
            responsibility="Will take care of SDLC Assignment";
        }else if(instructorName.equals("Weqas")){
            responsibility="Will take care of Selenium Assignment";
        }else if(instructorName.equals("Asel")){
            responsibility="Will take care of every Assignment";
        }else{
            responsibility="Invalid instructor selected";
        }

        System.out.println(responsibility);

    }
}
