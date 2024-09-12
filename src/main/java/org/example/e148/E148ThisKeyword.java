package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args){
        ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore item2 = new ShoppingStore("Mattress", 219.59, 2);

        double totalValue1 = item1.itemTotalPrice();
        double totalValue2 = item2.itemTotalPrice();

        double totalSum = totalValue1 + totalValue2;

        System.out.println("You purchased " + totalSum + " Today");
    }
}
class ShoppingStore{
    private String item;
    private double price;
    private int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public double itemTotalPrice() {
        double totalValue = price * quantity;
        System.out.println(item + " Total Value " + totalValue);
        return totalValue;
    }
}