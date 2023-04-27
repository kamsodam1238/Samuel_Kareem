package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class AmericanoImage extends BeverageTypeImage {
    public AmericanoImage() {
        imageFile = BeverageImageFile.AMERICANO.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
