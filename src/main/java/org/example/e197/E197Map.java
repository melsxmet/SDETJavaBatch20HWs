package org.example.e197;


import java.util.HashMap;
import java.util.Map;

public class E197Map {
}

class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}
class DogMapExample {
    public static void main(String[] args) {
        Map<Integer, Dog> dogMap = new HashMap<>();

        Dog max = new Dog("Max", "Labrador", 5);
        Dog bella = new Dog("Bella", "Beagle", 3);
        Dog rocky = new Dog("Rocky", "Bulldog", 4);

        dogMap.put(1, max);
        dogMap.put(2, bella);
        dogMap.put(3, rocky);

        for (Map.Entry<Integer, Dog> entry : dogMap.entrySet()) {
            Integer id = entry.getKey();
            Dog dog = entry.getValue();
            System.out.println("Dog ID: " + id + ", Details: " + dog);
        }
    }
}