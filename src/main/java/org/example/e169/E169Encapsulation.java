package org.example.e169;

public class E169Encapsulation {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setEmpName("John");
        employee.setEmpAge(30);
        String name = employee.getEmpName();
        int age = employee.getEmpAge();
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}
class Employee {
    private String empName;
    private int empAge;
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String name) {
        this.empName = name;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int age) {
        this.empAge = age;
    }
}
