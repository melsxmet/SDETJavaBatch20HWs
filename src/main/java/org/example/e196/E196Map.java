package org.example.e196;

import java.util.*;

public class E196Map {
        public static void main(String[] args) {

            Map<String, List<String>> departmentEmployees = new HashMap<>();

            List<String> hrEmployees = new ArrayList<>();
            List<String> itEmployees = new ArrayList<>();
            List<String> financeEmployees = new ArrayList<>();

            hrEmployees.add("Alice");
            hrEmployees.add("Bob");

            itEmployees.add("Charlie");
            itEmployees.add("David");
            itEmployees.add("Eve");

            financeEmployees.add("Frank");
            financeEmployees.add("Grace");

            departmentEmployees.put("HR", hrEmployees);
            departmentEmployees.put("IT", itEmployees);
            departmentEmployees.put("Finance", financeEmployees);

            for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
                String department = entry.getKey();
                List<String> employees = entry.getValue();
                System.out.println("Department: " + department + " Employees: " + employees);
            }
        }
}