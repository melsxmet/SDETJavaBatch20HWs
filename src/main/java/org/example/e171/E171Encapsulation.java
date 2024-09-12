package org.example.e171;

public class E171Encapsulation {
    public static void main(String[] args){

        Employee employee = new Employee();
        String name = employee.getEmpName();
        int age = employee.getEmpAge();
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

class Employee {
    private String empName = "John";
    private int empAge = 30;
    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
}
