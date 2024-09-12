package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;
    // Create a method to display values of instance variables
    public void display(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);
    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        E122Variables instanceA= new E122Variables();
        E122Variables instanceB= new E122Variables();
        // Assign values to variables for the first instance
        instanceA.countryName="USA";
        instanceA.capital="Washington DC";
        instanceA.populationSize=330000000;
        // Execute the method to display values for the first instance
        instanceA.display();
        // Assign values to variables for the second instance
        instanceB.countryName="Kazakhstan";
        instanceB.capital="Astana";
        instanceB.populationSize=18500000;
        // Execute the method to display values for the second instance
        instanceB.display();

    }
}
