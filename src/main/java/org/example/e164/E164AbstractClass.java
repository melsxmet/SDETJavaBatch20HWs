package org.example.e164;

public class E164AbstractClass {
    public static void main(String[] args){

            Car myCar = new Car();
            myCar.startEngine();
            myCar.startEngine("a smart key");
            myCar.stopEngine();
    }
}
abstract class Vehicle {
    public abstract void startEngine();
    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    public void startEngine(String keyType) {
        System.out.println("Car engine started with " + keyType);
    }
}




