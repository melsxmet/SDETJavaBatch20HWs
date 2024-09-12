package org.example.e193;

import java.util.HashMap;
import java.util.Map;

public class E193Map {
    public static void main(String[] args) {

        HashMap<Integer, String> libraryCatalog = new HashMap<>();

        libraryCatalog.put(101, "The Catcher in the Rye");
        libraryCatalog.put(102, "To Kill a Mockingbird");
        libraryCatalog.put(103, "1984");
        libraryCatalog.put(104, "The Great Gatsby");
        libraryCatalog.put(105, "Moby Dick");

        System.out.println("Initial number of books in catalog: " + libraryCatalog.size());
        System.out.println("Is the catalog empty? " + libraryCatalog.isEmpty());
        System.out.println("Is book with ID 102 available? " + libraryCatalog.containsKey(102));
        System.out.println("Is the book \"1984\" available? " + libraryCatalog.containsValue("1984"));

        libraryCatalog.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        for (Map.Entry<Integer, String> entry : libraryCatalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        libraryCatalog.clear();
        System.out.println("Is the catalog empty after clearing? " + libraryCatalog.isEmpty());
    }
}
