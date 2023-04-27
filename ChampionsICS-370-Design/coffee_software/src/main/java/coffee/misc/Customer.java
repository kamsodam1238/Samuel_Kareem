package coffee.misc;

import coffee.coffee_software.Order;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerId;
    private final ArrayList<Order> orderHistory;
    private String savedPayMethod;  //The customer's preferred payment method

    public Customer(String name, int customerId){
        this.name = name;
        this.customerId = customerId;
        this.orderHistory = new ArrayList<Order>();
    }

    public Customer(String name, int customerId, String payMethod){
        this.name = name;
        this.customerId = customerId;
        this. savedPayMethod = payMethod;
        this.orderHistory = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getSavedPayMethod() {
        return savedPayMethod;
    }

    public void setSavedPayMethod(String savedPayMethod) {
        this.savedPayMethod = savedPayMethod;
    }

    public void addOrder(Order drink){  //Add an order to a customer's order history
        orderHistory.add(drink);
    }
}
