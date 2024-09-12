package org.example.e178;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class E178List {
}

class E178GroceryList {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            groceryList.add(item);
        }
        scanner.close();
        HashSet<String> uniqueItems = new HashSet<>(groceryList);
        ArrayList<String> uniqueGroceryList = new ArrayList<>(uniqueItems);
        System.out.println(String.join(" ", uniqueGroceryList));
    }
}
