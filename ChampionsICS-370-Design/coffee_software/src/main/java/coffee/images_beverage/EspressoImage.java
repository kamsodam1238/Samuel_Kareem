package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class EspressoImage extends BeverageTypeImage {
    public EspressoImage() {
        imageFile = BeverageImageFile.ESPRESSO.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
