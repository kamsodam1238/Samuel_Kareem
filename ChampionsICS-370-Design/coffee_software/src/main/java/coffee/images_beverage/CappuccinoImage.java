package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class CappuccinoImage extends BeverageTypeImage {
    public CappuccinoImage() {
        imageFile = BeverageImageFile.CAPPUCCINO.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
