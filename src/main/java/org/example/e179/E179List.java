package org.example.e179;

import java.util.Iterator;
import java.util.LinkedList;

public class E179List {
}
class E179LinkedListDivisibility {
    public static void main(String[] args) {

        LinkedList<Integer> numberList = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            numberList.add(i);
        }
        Iterator<Integer> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 3 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numberList);
    }
}
