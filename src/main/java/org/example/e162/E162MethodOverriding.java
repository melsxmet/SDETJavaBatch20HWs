package org.example.e162;

public class E162MethodOverriding {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal kitten1 = new Kitten1();
        Animal kitten2 = new Kitten2();
        Animal kitten3 = new Kitten3();
        Animal[] animals = {cat, kitten1, kitten2, kitten3};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
        Cat realCat = new Cat();
        realCat.makeSound();
    }
}

class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }
    public void eat() {
        System.out.println("I am an animal eating");
    }
    protected void sleep() {
        System.out.println("I am an animal sleeping");
    }
    void makeSound() {
        System.out.println("I am an animal making sound");
    }
    private void roam() {
        System.out.println("I am an animal roaming");
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }
    @Override
    protected void sleep() {
        System.out.println("Cat sleeps a lot");
    }
    @Override
    void makeSound() {
        System.out.println("Cat makes a sound");
    }
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}
class Kitten1 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten1 eats milk");
    }
    public void sleep() {
        System.out.println("kitten1 sleeps a lot");
    }
}
class Kitten2 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }
    public void sleep() {
        System.out.println("kitten2 sleeps a lot");
    }
}
class Kitten3 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten3 eats everything");
    }
    public void sleep() {
        System.out.println("kitten3 sleeps a lot");
    }
}
