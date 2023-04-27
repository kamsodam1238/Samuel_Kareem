package coffee.coffee_beverage;

public enum customAdds {
    defaults("CUSTOM ADDITIVE", 0),
    dairy("DAIRY", 0.00),
    almond("ALMOND", 0.50),
    oat("OAT", 0.75),
    carbrulee("CARAMEL BRULEE", 1.00),
    cindolce("CINNAMON DOLCE", 0.75),
    eggnog("EGGNOG", 0.75),
    peppermint("PEPPERMINT", 0.75),
    pumpkin("PUMPKIN SPICE", 0.75),
    mocha("MOCHA", 0.75),
    whitemocha("WHITE CHOCOLATE MOCHA", 0.75);

    private final String custom;
    private final double price;
    customAdds (String cust, double price){
        this.custom = cust;
        this.price = price;
    }

    @Override
    public String toString() {
        if (isDefault()) {
            return custom;
        }
        return custom + "\t\t\t$" + String.format("%.2f", price);
    }

    public String getCustom() {
        return custom;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDefault() {
        return this.equals(defaults);
    }
}
