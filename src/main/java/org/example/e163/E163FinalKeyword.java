package org.example.e163;

public class E163FinalKeyword {
    public static void main(String[] args){
        StringManipulator stringManipulator = new StringManipulator("hello");
        String reversedString = stringManipulator.reverseString();
        System.out.println(reversedString);

        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int[] numbers = {3, 4, 5, 6, 6};
        double average = arrayManipulator.avgElements(numbers);
        System.out.println(average);
    }

}
class StringManipulator {
    private String str;
    public StringManipulator(String str) {
        this.str = str;
    }
    public final String reverseString() {
        return new StringBuilder(str).reverse().toString();
    }
}
class ArrayManipulator {
    public final double avgElements(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

