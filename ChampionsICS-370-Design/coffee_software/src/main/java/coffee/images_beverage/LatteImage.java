package coffee.images_beverage;

import javafx.scene.image.Image;

import java.util.Objects;

public class LatteImage extends BeverageTypeImage {
    public LatteImage() {
        imageFile = BeverageImageFile.LATTE.toString();
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
    }
}
