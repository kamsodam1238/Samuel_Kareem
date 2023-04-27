package coffee.coffee_beverage;

public enum drinkAdd {
    defaults("Add Drink Additives" , 0),

    Milk("milk".toUpperCase(), 0),
    Almond("almond".toUpperCase(), 0.50),
    Oat("oat".toUpperCase(), 0.75),
    Vanilla("vanilla".toUpperCase(), 0.50),
    Caramel("caramel".toUpperCase(), 0.50),
    Hazelnut("hazelnut".toUpperCase(), 0.50);

    private final String adds;

    private final double price;

    drinkAdd (String add, double price)
    {
        this.adds = add;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isDefault()) {
            return adds;
        }
        return adds + "\t\t$" + String.format("%.2f", price);
    }

    public String getAdds() {
        return adds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDefault() {
        return this.equals(defaults);
    }
}
