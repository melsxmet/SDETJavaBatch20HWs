package org.example.e145;

public class E145ThisKeyword {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tarzan", 50.0);
        Dog dog2 = new Dog("Lucy", 10.0);

        dog1.displayDetails();
        dog2.displayDetails();
    }
}
class Dog{
    private String dogName;
    private double dogWeight;

    private static String dogBreed = "Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    public void displayDetails() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }
}