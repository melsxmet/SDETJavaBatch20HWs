package org.example.e156;

public class E156SuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displaySound();
    }
}
class Animal {
    protected String sound = "Some generic animal sound";
    public Animal() {
    }
}
class Dog extends Animal {
    protected String sound = "Bark";
    public void displaySound() {
        System.out.println(this.sound);
        System.out.println(super.sound);
    }
}