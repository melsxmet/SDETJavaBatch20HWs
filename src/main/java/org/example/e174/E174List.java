package org.example.e174;

import java.util.ArrayList;

public class E174List {
}
class E174ProductInventory {
    public static void main(String[] args) {
        ArrayList<Integer> productIDs = new ArrayList<>();
        productIDs.add(1011);
        productIDs.add(1022);
        productIDs.add(1033);
        productIDs.add(1044);
        productIDs.add(1055);
        productIDs.add(1066);
        System.out.println(productIDs.get(0));
        System.out.println(productIDs.get(2));
        System.out.println(productIDs.get(4));
        }
    }