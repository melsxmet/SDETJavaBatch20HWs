package org.example.e157;

public class E157MethodOverloading {
    public static void main(String[] args) {

        TransactionCalculator calculator = new TransactionCalculator();

        int result4 = calculator.calculateProfit(100, 20, 30, 10);
        System.out.println(result4);

        int result3 = calculator.calculateProfit(80, 30, 20);
        System.out.println(result3);

        int result2 = calculator.calculateProfit(50, 30);
        System.out.println(result2);
    }
}
class TransactionCalculator {

    public int calculateProfit(int profit1, int profit2) {
        return (profit1 + profit2) - (profit1 + profit2);
    }
    public int calculateProfit(int profit1, int profit2, int profit3) {
        return (profit1 + profit2 + profit3) - (profit1 + profit2 + profit3);
    }
    public int calculateProfit(int profit1, int profit2, int profit3, int profit4) {
        return (profit1 + profit2 + profit3 + profit4) - (profit1 + profit2 + profit3 + profit4);
    }
}

