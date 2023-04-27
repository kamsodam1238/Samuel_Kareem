package coffee.coffee_beverage;

public enum BeverageType {
    defaults("Select Coffee Variety", 0),
    Espresso("ESPRESSO", 3.00),
    Latte("LATTE", 4.00),
    Americano("AMERICANO", 4.00),
    Cappuccino("CAPPUCCINO", 5.00),
    Macchiato("MACCHIATO", 4.50),
    Flatwhite("FLAT WHITE", 4.00),
    Decaf("DECAF", 2.00);
    private final String etype;
    private final double price;
    BeverageType(String type, double price) {
        this.etype = type;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isDefault()) {
            return etype;
        }
        return etype + "\t\t$" + String.format("%.2f", price);
    }

    public String getEtype() {
        return etype;
    }

    public double getPrice() {
        return price;
    }

    public String display() {
        if (isDefault()) {
            return etype;
        }
        return etype + "\t\t$" + price;
    }

    public boolean isDefault(){
        return this.equals(defaults);
    }
}
