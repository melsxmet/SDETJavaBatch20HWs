package org.example.e158;

public class E158MethodOverloading {
    public static void main(String[] args){
        LoanPaymentCalculator calculator = new LoanPaymentCalculator();
        double result1 = calculator.calculatePayment(10000, 5);
        System.out.printf("%.2f\n", result1);
        double result2 = calculator.calculatePayment(10000, 5, 24);
        System.out.printf("%.2f\n", result2);
        double result3 = calculator.calculatePayment(10000, 5, 24, 2000);
        System.out.printf("%.2f\n", result3);
    }
}

class LoanPaymentCalculator {
    public double calculatePayment(double loanAmount, double annualInterestRate) {
        int termInMonths = 12;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double payment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -termInMonths));
        return payment;
    }
    public double calculatePayment(double loanAmount, double annualInterestRate, int numberOfMonths) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double payment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
        return payment;
    }
    public double calculatePayment(double loanAmount, double annualInterestRate, int numberOfMonths, double downPayment) {
        double loanAmountAfterDownPayment = loanAmount - downPayment;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double payment = (loanAmountAfterDownPayment * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
        return payment;
    }
}
