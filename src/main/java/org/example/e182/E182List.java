package org.example.e182;


import java.util.LinkedList;

public class E182List {
}

class E182PrimeNumbersLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
