/*  Abstract class for retrieving Images for each Beverage Type
    Implements Factory Design Pattern
 */

package coffee.images_beverage;

import javafx.scene.image.Image;

abstract class BeverageTypeImage {
    protected String imageFile; //Image's File path and File name in String form
    Image image;

    public Image getImage() {
        return image;
    }
}
