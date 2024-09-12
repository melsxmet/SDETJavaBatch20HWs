package org.example.e192;

import java.util.TreeMap;
import java.util.Map;

public class E192Map {
    public static void main(String[] args) {

        TreeMap<String, String> productMap = new TreeMap<>();

        productMap.put("1 item", "apple");
        productMap.put("2 item", "banana");
        productMap.put("3 item", "pear");
        productMap.put("4 item", "tomato");
        productMap.put("5 item", "mango");
        productMap.put("6 item", "kiwi");

        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            System.out.printf("Key is %s and value is %s%n", entry.getKey(), entry.getValue());
        }
    }
}
