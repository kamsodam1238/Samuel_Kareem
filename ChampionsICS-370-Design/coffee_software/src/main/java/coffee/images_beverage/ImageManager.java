package coffee.images_beverage;

import coffee.coffee_beverage.BeverageType;
import javafx.scene.image.Image;

import java.util.Objects;

public class ImageManager {
    String imageFile;
    Image image;

    public ImageManager(BeverageType bevType) {
        switch (bevType) {
            case Espresso -> imageFile = BeverageImageFile.ESPRESSO.toString();

            case Latte -> imageFile = BeverageImageFile.LATTE.toString();

            case Americano -> imageFile = BeverageImageFile.AMERICANO.toString();

            case Cappuccino -> imageFile = BeverageImageFile.CAPPUCCINO.toString();

            case Macchiato -> imageFile = BeverageImageFile.MACCHIATO.toString();

            case Flatwhite -> imageFile = BeverageImageFile.FLATWHITE.toString();

            case Decaf -> imageFile = BeverageImageFile.DECAF.toString();

            case defaults -> {
                return; //Don't create an Image if null or Default BeverageType is passed as argument
            }

        }
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }

    public Image getImage() {
        return image;
    }
}
