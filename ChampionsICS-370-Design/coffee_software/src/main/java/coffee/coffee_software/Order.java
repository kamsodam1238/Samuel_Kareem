package coffee.coffee_software;

import java.util.Date;

//Order object contains information info about a customer's drink, date purchased
public class Order {
    private int orderId;
    private Date date;
    private Beverage beverage;  //Contains the beverage item
    private double total;   //Total amount due for beverage

    public Order(){
        this.date = new Date();
    }

    public Order(int orderId){
        this.orderId = orderId;
        this.date = new Date();
    }
    public Order(int orderId, Beverage beverage){
        this.orderId = orderId;
        this.date = new Date();
        this.beverage = beverage;
    }



    public int getOrderId() {
        return orderId;
    }

    public Date getDate() {
        return date;
    }

    public void updateTotal() {
        total = beverage.getType().getPrice() + beverage.getAdditive().getPrice()
                + beverage.getSize().getPrice() + beverage.getBrewOption().getPrice();
    }

    public double getTotal() {
        updateTotal();
        return total;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return beverage.toString()
                + "\nTOTAL: $" + String.format("%.2f", getTotal())
                + "\nORDER PLACED: " + date;
    }
}
