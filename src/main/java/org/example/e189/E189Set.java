package org.example.e189;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class E189Set {
    public static void main(String[] args) {

        LinkedHashSet<String> emailSet = new LinkedHashSet<>();

        emailSet.add(null);
        emailSet.add("john.doe@example.com");
        emailSet.add("jane.smith@example.com");
        emailSet.add("john.doe@example.com");
        emailSet.add("admin@event.com");
        emailSet.add("info@company.com");

        for (String email : emailSet) {
            System.out.println(email);
        }
        Iterator<String> iterator = emailSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
