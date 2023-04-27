/*  This class contains the String data for the Images for all Beverage Types
    Update the Strings here in the future if the filepath for Beverage Type Images is changed,
    or if the names of their respective Images change
 */

package coffee.images_beverage;

public enum BeverageImageFile {
    ESPRESSO("/img/esp.png"),
    LATTE("/img/lat.png"),
    AMERICANO("/img/ame.png"),
    CAPPUCCINO("/img/cap.png"),
    MACCHIATO("/img/mac.jpg"),
    FLATWHITE("/img/flt.png"),
    DECAF("/img/dec.png");

    private final String imageFile;

    BeverageImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public String toString() {
        return imageFile;
    }
}
