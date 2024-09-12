package org.example.e86;

// Declare the Student class
public class Student {
    // Declare a String variable named 'name'
    String name;
    // Declare an integer variable named 'roll_no'
    int roll_no;

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "John";
        student.roll_no=2;

        System.out.println("Name is "+student.name+" and roll number is "+student.roll_no);
    }
}
