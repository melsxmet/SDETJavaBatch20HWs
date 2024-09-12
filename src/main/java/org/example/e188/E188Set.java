package org.example.e188;

import java.util.TreeSet;

public class E188Set {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("Australia");
        treeSet.add("South Africa");
        treeSet.add("India");
        treeSet.add("America");
        treeSet.add("America");

        System.out.println(treeSet);
    }
}
