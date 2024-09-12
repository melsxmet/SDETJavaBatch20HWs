package org.example.e160;

public class E160MethodOverloading {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayInfo();
        account.displayInfo(5000);
        BankAccount.displayBankInfo();
        BankAccount.displayBankInfo(20);
    }
}
class BankAccount {
    void displayInfo() {
        System.out.println("private displayInfo method");
    }
    void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }
    public static void displayBankInfo() {
        System.out.println("static method without parameter");
    }
    public static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }
}


