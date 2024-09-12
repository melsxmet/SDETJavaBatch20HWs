package org.example.e191;

import java.util.LinkedHashMap;
import java.util.Map;

public class E191Map {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> productCatalog = new LinkedHashMap<>();

        productCatalog.put("Laptop", 1200.99);
        productCatalog.put("Smartphone", 799.99);
        productCatalog.put("Tablet", 499.99);
        productCatalog.put("Smartwatch", 199.99);
        productCatalog.put("Headphones", 149.99);

        System.out.println("Product Catalog:");
        for (Map.Entry<String, Double> entry : productCatalog.entrySet()) {
            System.out.printf("%s: $%.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
