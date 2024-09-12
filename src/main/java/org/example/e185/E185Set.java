package org.example.e185;

import java.util.HashSet;
import java.util.Set;

public class E185Set {
}

class E185CustomerOrdersHashSet {
    public static void main(String[] args) {

        Set<Integer> customerIds = new HashSet<>();
        customerIds.add(1001);
        customerIds.add(1002);
        customerIds.add(1001);
        customerIds.add(1003);
        customerIds.add(1002);
        customerIds.add(1004);
        System.out.println("Unique Customer IDs:");
        for (Integer id : customerIds) {
            System.out.println(id);
        }
    }
}
