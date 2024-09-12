package org.example.e172;

public class E172Encapsulation {
    public static void main(String[] args){
        Customer customer = new Customer(1234567890L, "Sarah Connor", "sarah.connor@example.com", 15000.0);
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Account Balance: " + customer.getBalance());
    }
}

class Customer {
    private long accountNumber;
    private String fullName;
    private String email;
    private double balance;

    public Customer(long accountNumber, String fullName, String email, double balance) {
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.email = email;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

