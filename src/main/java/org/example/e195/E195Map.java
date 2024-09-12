package org.example.e195;


import java.util.*;

public class E195Map {
    public static void main(String[] args) {
        // Create a Map to store students grouped by subject

        Map<String, List<String>> studentsBySubject = new HashMap<>();

        List<String> mathStudents = new ArrayList<>();
        mathStudents.add("Alice");
        mathStudents.add("Bob");
        studentsBySubject.put("Mathematics", mathStudents);

        List<String> scienceStudents = new ArrayList<>();
        scienceStudents.add("Charlie");
        scienceStudents.add("David");
        studentsBySubject.put("Science", scienceStudents);

        List<String> historyStudents = new ArrayList<>();
        historyStudents.add("Eve");
        historyStudents.add("Frank");
        studentsBySubject.put("History", historyStudents);

        System.out.println("From Map (Students by Subject):");
        for (Map.Entry<String, List<String>> entry : studentsBySubject.entrySet()) {
            String subject = entry.getKey();
            List<String> students = entry.getValue();
            System.out.println("Subject: " + subject + " Students: " + students);
        }
    }
}