package coffee.coffee_software;

import coffee.coffee_beverage.*;
import coffee.images_beverage.BeverageImageFactory;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class CoffeeSuperController {
    @FXML
    protected Button clearbox;
    @FXML
    protected Button pay;
    @FXML
    protected Button brew;
    @FXML
    protected TextArea tfield;
    @FXML
    protected AnchorPane apane;
    @FXML
    protected Button start;
    @FXML
    protected ComboBox<customAdds> cust;
    @FXML
    protected ComboBox<drinkSize> dsize;
    @FXML
    protected ComboBox<drinkAdd> add;
    @FXML
    protected ComboBox<brewOpt> bshots;
    @FXML
    protected ImageView qrcode;
    @FXML
    protected ImageView coffee_image;
    @FXML
    protected ComboBox<BeverageType> etype;
    @FXML
    protected Button maintain;
    @FXML
    protected Button exit;
    @FXML
    protected AnchorPane maintainpane;
    @FXML
    protected AnchorPane pinpane;
    @FXML
    protected PasswordField pin;
    @FXML
    protected AnchorPane parentpane;
    @FXML
    protected Label labels;




    Order newOrder; //new Order object associated with Customer's Beverage

    File records = new File("Orders_History/history.xml");
    FileOutputStream outputStream = new FileOutputStream(records);
    Beverage newBeverage = new Beverage();  //Create new beverage

    //BeverageImageFactory uses Factory Pattern to retrieve beverage images for displaying
    BeverageImageFactory bevImageFactory = new BeverageImageFactory();
    String servicecode = "042023";
    String empcode = "012023";

    public CoffeeSuperController() throws FileNotFoundException {
    }


}
