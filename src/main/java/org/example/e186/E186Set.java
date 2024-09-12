package org.example.e186;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E186Set {
    public static void main(String[] args) {

        Set<String> HashSet = new HashSet<>();
        HashSet.add("third");
        HashSet.add("first");
        HashSet.add("second");

        List<String> list = new ArrayList<>(HashSet);

        Collections.sort(list);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
        }
        System.out.println("]");
        HashSet.clear();
        System.out.println(HashSet);
    }
}
