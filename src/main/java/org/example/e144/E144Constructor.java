package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        StoreProduct product2 = new StoreProduct("Paper Towels", 2.0, 24);
        StoreProduct product3 = new StoreProduct("Paper Towels", 2.0);

        product1.display();
        product2.display();
        product3.display();

    }
}
class StoreProduct{
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public StoreProduct(String label, double price, int stock) {
        this(label, price, "misc", false, stock); // Default category to "misc" and hasExpiration to false
    }
    public StoreProduct(String label, double price) {
        this(label, price, "misc", false, 0); // Default category to "misc", hasExpiration to false, and stock to 0
    }
    public void display() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}