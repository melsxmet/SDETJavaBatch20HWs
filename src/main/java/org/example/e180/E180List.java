package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
}

class E179EmployeeAges {
    public static void main(String[] args) {

        LinkedList<Integer> employeeAges = new LinkedList<>();
        employeeAges.add(22);
        employeeAges.add(45);
        employeeAges.add(35);
        employeeAges.add(40);
        employeeAges.add(55);
        employeeAges.add(60);
        employeeAges.add(18);
        employeeAges.add(50);
        employeeAges.add(30);
        employeeAges.add(65);
        employeeAges.removeIf(age -> age < 25 || age > 60);
        Collections.sort(employeeAges);
        double sum = 0;
        for (int age : employeeAges) {
            sum += age;
        }
        double average = employeeAges.size() > 0 ? sum / employeeAges.size() : 0;
        System.out.println("Remaining ages: " + employeeAges);
        System.out.println("Average age: " + average);
    }
}
