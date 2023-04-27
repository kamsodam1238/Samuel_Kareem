package coffee.coffee_beverage;

public enum brewOpt {
    defaults("Select Brew Option", 0),
    Single("single shot".toUpperCase(), 0.50),
    Double("double shot".toUpperCase(), 0.75),
    Triple("triple shot".toUpperCase(), 1.00),
    Quad("quad shot".toUpperCase(), 1.25);
    private final String bopt;
    private final double price;

    brewOpt(String opt, double price){
        this.bopt = opt;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isDefault()) {
            return bopt;
        }
        return bopt + "\t\t$" + String.format("%.2f", price);
    }

    public String getBrew() {
        return bopt;
    }
    public double getPrice() {
        return price;
    }

    public boolean isDefault() {
        return this.equals(defaults);
    }
}
