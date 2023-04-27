package coffee.coffee_beverage;

public enum drinkSize {
    defaults("Select Drink Size", 0),
    Short("short".toUpperCase(), 0.50),
    Tall("tall".toUpperCase(), 0.50),
    Grande("grande".toUpperCase(), 0.75),
    Venti("venti".toUpperCase(), 0.75);

    private final String dsize;
    private final double price;

    drinkSize(String size, double price)
    {
        this.dsize = size;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isDefault()){
            return dsize;
        }
        return dsize + "\t\t$" + String.format("%.2f", price);
    }

    public String getSize() {
        return dsize;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDefault() {
        return this.equals(defaults);
    }
}
