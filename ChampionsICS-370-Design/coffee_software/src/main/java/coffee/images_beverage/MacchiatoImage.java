package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class MacchiatoImage extends BeverageTypeImage {
    public MacchiatoImage() {
        imageFile = BeverageImageFile.MACCHIATO.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
