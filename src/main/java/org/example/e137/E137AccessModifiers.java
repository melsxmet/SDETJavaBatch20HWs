package org.example.e137;

public class E137AccessModifiers {
    private static String name;
    static String city;
    protected static String schoolName;
    public static int batchNumber;

    public static void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        name="John";
        city="Miami";
        schoolName="Syntax";
        batchNumber=9;
        display();
    }
}

