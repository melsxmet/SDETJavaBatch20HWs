package org.example.e88;

// Declare the Dog class
public class Dog {
    // Declare String variables named 'breed', 'name', and 'color'
    String breed;
    String name;
    String color;
    // Declare the method 'bark()' that prints "Breed can bark"
    void bark(){
        System.out.println(breed+" can bark");
    }
    // Declare the method 'run()' that prints "Breed can run"
    void run() {
        System.out.println(breed + " can run");
    }
    // Declare the method 'play()' that prints "Breed can play"
    void play() {
        System.out.println(breed + " can play");
    }

    public static void main(String[] args) {
        Dog husky=new Dog();
        husky.breed="Husky";
        husky.name="Max";
        husky.color="White";

        Dog bulldog=new Dog();
        bulldog.breed="BullDog";
        bulldog.name="Maggie";
        bulldog.color="Brown";

        Dog labrador=new Dog();
        labrador.breed="Labrador";
        labrador.name="Mellie";
        labrador.color="Grey";


        husky.bark();
        husky.run();
        husky.play();

        bulldog.bark();
        bulldog.run();
        bulldog.play();

        labrador.bark();
        labrador.run();
        labrador.play();
    }
}
