package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class FlatWhiteImage extends BeverageTypeImage {
    public FlatWhiteImage() {
        imageFile = BeverageImageFile.FLATWHITE.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
