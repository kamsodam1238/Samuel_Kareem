/*
    This class represents the recipe of a brewed beverage ordered
    If the customer
 */

package coffee.misc;
import coffee.coffee_beverage.BeverageType;
import coffee.coffee_beverage.brewOpt;
import coffee.coffee_beverage.drinkAdd;
import coffee.coffee_beverage.drinkSize;

import java.util.Date;

public class SharedRecipe {
    private final BeverageType type;
    private final drinkAdd additive;
    private final drinkSize size;
    private final brewOpt brewOption;
    private final Date date;

    public SharedRecipe(BeverageType type, drinkAdd additive, drinkSize size, brewOpt brewOption){
        this.type = type;
        this.additive = additive;
        this.size = size;
        this.brewOption = brewOption;
        date = new Date();
    }

    public SharedRecipe(String type, String additive, String size, String brewOption){
        this.type = BeverageType.valueOf(type);
        this.additive = drinkAdd.valueOf(additive);
        this.size = drinkSize.valueOf(size);
        this.brewOption = brewOpt.valueOf(brewOption);
        date = new Date();
    }

    //Getters
    public BeverageType getType() {
        return type;
    }

    public drinkAdd getAdditive() {
        return additive;
    }

    public drinkSize getSize() {
        return size;
    }

    public brewOpt getBrewOption() {
        return brewOption;
    }

    public Date getDate() {
        return date;
    }

    //Generate the QR code for sharing this recipe (NOT Implementable currently
    public void generateQr(){
        //Return QR
    }
}
