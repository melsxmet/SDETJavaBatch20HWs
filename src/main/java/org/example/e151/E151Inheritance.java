package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 1000.0, "123456789", 0.05);
        savingsAccount.deposit(50.0);
        savingsAccount.applyInterest();
        savingsAccount.printAccountInfo();
        System.out.println();
        CheckingAccount checkingAccount = new CheckingAccount("Jane Smith", 100.0, "987654321", 50.0);
        checkingAccount.withdraw(150.0);
        checkingAccount.printAccountInfo();
}
}

class BankAccount {
    private String accountHolderName;
    protected double balance;
    private String accountNumber;

    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void printAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
    }

    protected double getBalance() {
        return super.balance;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        }
    }

    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
    }

    protected double getBalance() {
        return super.balance;
    }
}
