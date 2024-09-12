package org.example.e175;

import java.util.ArrayList;

public class E175List {
}

class E175OrderManagement {
    public static void main(String[] args) {
        ArrayList<Integer> productQuantities = new ArrayList<>();
        productQuantities.add(111);
        productQuantities.add(111);
        productQuantities.add(111);
        productQuantities.add(999);
        productQuantities.add(999);
        productQuantities.add(999);

        for (int quantity : productQuantities) {
            System.out.println(quantity);
        }
    }
}
