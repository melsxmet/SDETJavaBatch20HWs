package org.example.e153;


public class E153SuperKeyword {
    public static void main(String[] args) {

        Car myCar = new Car();
    }
}
class Vehicle {
    public Vehicle() {
        System.out.println("This is the Vehicle constructor");
    }
}

class Car extends Vehicle {
    // No-Argument Constructor
    public Car() {
        super();
    }
}