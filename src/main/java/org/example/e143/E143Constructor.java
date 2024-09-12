package org.example.e143;

public class E143Constructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        car1.display();

        Car car2 = new Car("Toyota", "Prius", 120, 30000.0);
        car2.display();

        Car car3 = new Car(4, 120, 30000.0);
        car3.display();

        Car car4 = new Car("Toyota", "Prius", 4);
        car4.display();
    }
}
class Car{
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Car(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);
    }
    public Car(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }
    public Car(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0);
    }
    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }


}

