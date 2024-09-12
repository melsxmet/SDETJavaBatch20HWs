package org.example.e147;

public class E147ThisKeyword {
    public static void main(String[] args) {
        CarObject car1 = new CarObject("Toyota 2019", 50000.0, 50);
        CarObject car2 = new CarObject("BMW 2019", 10883.0, 60);

        car1.carStockValue();
        car2.carStockValue();

    }
}
class CarObject{
    private String model;
    private double price;
    private int quantity;

    public CarObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public void carStockValue() {
        double totalValue = price * quantity;
        System.out.println(model + " Stock Value " + totalValue);
    }
}