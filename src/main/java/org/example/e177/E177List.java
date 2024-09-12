package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
}

class E185GroupChatApp {
    public static void main(String[] args) {

        ArrayList<String> messages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 chat messages:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Message " + (i + 1) + ": ");
            String message = scanner.nextLine();
            messages.add(message);
        }
        scanner.close();
        if (messages.size() > 4) messages.remove(4);
        if (messages.size() > 2) messages.remove(2);
        if (messages.size() > 0) messages.remove(0);
        System.out.println(String.join(" ", messages));
    }
}
