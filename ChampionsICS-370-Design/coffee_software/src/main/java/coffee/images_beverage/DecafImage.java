package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class DecafImage extends BeverageTypeImage {
    public DecafImage() {
        imageFile = BeverageImageFile.DECAF.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
