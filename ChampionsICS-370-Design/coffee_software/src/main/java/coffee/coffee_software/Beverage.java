package coffee.coffee_software;

import coffee.coffee_beverage.*;

import java.util.ArrayList;
import java.util.List;

public class Beverage {
    private BeverageType type;
    private drinkAdd additive;
    private drinkSize size;
    private brewOpt brewOption;
    private List<customAdds> custom;   //Custom additives available for custom order

    public Beverage() {}

    //This constructor is for beverages that only have one additive option
    public Beverage(BeverageType type, drinkAdd additive, drinkSize size, brewOpt brewOption){
        this.type = type;
        this.additive = additive;
        this.size = size;
        this.brewOption = brewOption;
    }

    //Constructor for if only 1 custom additive was added
    public Beverage(BeverageType type, drinkAdd additive, drinkSize size, brewOpt brewOption, customAdds custom){
        this.type = type;
        this.additive = additive;
        this.size = size;
        this.brewOption = brewOption;
        addOption(custom);
    }

    //Add an additive to the additives list for the beverage
    public void addOption(customAdds additive){
        if (this.custom == null){
            this.custom = new ArrayList<customAdds>();
        }
        this.custom.add(additive);
    }

    //Getter methods
    public BeverageType getType() {
        return type;
    }

    public drinkAdd getAdditive(){
        return this.additive;
    }

    public drinkSize getSize() {
        return size;
    }

    public brewOpt getBrewOption() {
        return brewOption;
    }

    //Setter Methods
    public void setType(BeverageType type) {
        this.type = type;
    }

    public void setAdditive(drinkAdd additive) {
        this.additive = additive;
    }

    public void setSize(drinkSize size) {
        this.size = size;
    }

    public void setBrewOption(brewOpt brewOption) {
        this.brewOption = brewOption;
    }

    public List<customAdds> getCustomAdditives(){
        return this.custom;
    }

    public void clearCustom() {
        custom.clear();
    }

    public void removeAdditive(customAdds additive) {
        custom.remove(additive);
    }

    @Override
    public String toString() {
        return "BEVERAGE: " + additive.getAdds() + " " +type.getEtype()
                + "\nSIZE: " + size.getSize() + "\n"
                + "BREW OPTION: " + brewOption.getBrew();
    }
}
