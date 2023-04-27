/*  This is the Factory Constructor Class that implements Factory Design Pattern
    Gets the image that corresponds to beverage type a customer selects on screen
 */
package coffee.images_beverage;

import coffee.coffee_beverage.BeverageType;
import javafx.scene.image.Image;

public class BeverageImageFactory {
    public Image getImage(BeverageType beverageType) {
        switch (beverageType) {
            case Espresso -> {
                return new EspressoImage().getImage();
            }
            case Latte -> {
                return new LatteImage().getImage();
            }
            case Americano -> {
                return new AmericanoImage().getImage();
            }
            case Cappuccino -> {
                return new CappuccinoImage().getImage();
            }
            case Macchiato -> {
                return new MacchiatoImage().getImage();
            }
            case Flatwhite -> {
                return new FlatWhiteImage().getImage();
            }
            case Decaf -> {
                return new DecafImage().getImage();
            }
        }
        return null;
    }
}
