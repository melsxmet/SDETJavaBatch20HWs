package org.example.e87;

// Declare the Car class
public class Car {
    // Declare a String variable named 'carColor'
    String carColor;
    // Declare an integer variable named 'carYear'
    int carYear;
    // Declare a String variable named 'carMake'
    String carMake;

    public static void main(String[] args) {
        Car car1=new Car();
        car1.carColor="Black";
        car1.carYear=2019;
        car1.carMake="BMW";
        Car car2=new Car();
        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";

        System.out.println("Car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);
        System.out.println("Car color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);


    }



}
