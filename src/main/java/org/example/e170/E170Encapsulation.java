package org.example.e170;

public class E170Encapsulation {
}
class Customer {
    private String customerName;
    private int customerAge;
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public int getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(int age) {
        this.customerAge = age;
    }
}
class StoreManagement {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);
        String name = customer.getCustomerName();
        int age = customer.getCustomerAge();
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }
}





