package coffee.coffee_software;

import coffee.coffee_beverage.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static coffee.record.Order_history.writeXml;
import static coffee.record.Order_history.xml_record;


public class CoffeeController extends CoffeeSuperController implements Initializable {


    public CoffeeController() throws FileNotFoundException {
    }

    public void actionetype() {
        BeverageType clickedType = etype.getSelectionModel().getSelectedItem();
        newBeverage.setType(clickedType);
        add.setVisible(true);
        cust.setVisible(true);
        tfield.setVisible(true);
        clearbox.setVisible(true);

        // Selection validation action
        if (clickedType.isDefault()) {
            add.setVisible(false);
            add.getSelectionModel().select(0);
            dsize.setVisible(false);
            dsize.getSelectionModel().select(0);
            bshots.setVisible(false);
            bshots.getSelectionModel().select(0);
            coffee_image.setVisible(false);
        } else {
            //Image beverageImage = new ImageManager(clickedType).getImage();
            Image beverageImage = bevImageFactory.getImage(clickedType);
            coffee_image.setImage(beverageImage);
            coffee_image.setVisible(true);
        }
    }

    // Drink additives combo box button action
    public void actionadd() {
        drinkAdd clickedAdditive = add.getSelectionModel().getSelectedItem();
        newBeverage.setAdditive(clickedAdditive);
        dsize.setVisible(true);
        tfield.appendText(clickedAdditive + "\n");

        //Menu selection validation action
        if (clickedAdditive.isDefault()) {
            tfield.undo();
            dsize.setVisible(false);
            dsize.getSelectionModel().selectFirst();
            bshots.setVisible(false);
            bshots.getSelectionModel().selectFirst();

        }
    }

    // Drink size combo box button action
    public void actionsize() {
        drinkSize clickedSize = dsize.getSelectionModel().getSelectedItem();
        newBeverage.setSize(clickedSize);

        bshots.setVisible(true);

        // Selection validation action
        if (clickedSize.isDefault()) {
            bshots.setVisible(false);
            bshots.getSelectionModel().selectFirst();
        }
    }

    // Brew option combo box button action
    public void actionbshots() {
        brewOpt clickedBrewOption = bshots.getSelectionModel().getSelectedItem();
        newBeverage.setBrewOption(clickedBrewOption);
        brew.setVisible(false);
        pay.setVisible(true);
        qrcode.setVisible(false);

        // Selection validation action
        if (clickedBrewOption.isDefault()) {
            qrcode.setVisible(false);
            pay.setVisible(false);
        }
    }

    // Start button action
    public void actionstart() {
        apane.setVisible(true);
        parentpane.setVisible(false);

    }

    // Custom Menu combo box
    public void actioncustom() {
        tfield.appendText(cust.getSelectionModel().getSelectedItem() + "\n");
    }

    // Pay Now button action
    public void actionpay() {
        newOrder = new Order(1, newBeverage);   //Create a new Order with the Beverage ordered by Customer

        /*  Error check to see if the Beverage Options selected from customer are VALID
            Don't let customer checkout if their Beverage has any default options selected
         */
        if (newBeverage.getType().isDefault() || newBeverage.getAdditive().isDefault() ||
                newBeverage.getSize().isDefault() || newBeverage.getBrewOption().isDefault()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Payment");
            alert.setHeaderText("WARNING:");
            alert.setContentText("UNSELECTED FIELD DETECTED");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Payment");
            alert.setHeaderText("Results:");
            alert.setContentText("Payment is Successful!!!\n\nBegin Brewing");
            alert.showAndWait();
            System.out.println(alert.getButtonTypes());
            pay.setVisible(false);
            brew.setVisible(true);

        }
    }

    // Brew Now button action
    public void actionbrew() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Brew");
        alert.setHeaderText("Results:");
        alert.setContentText("Brewing will start shortly....");
        alert.showAndWait();
        qrcode.setVisible(true);

        if (!pay.isVisible()) {
            xml_record(newOrder);   //Record details of the new Order to XML file
        }
    }

    public void ending() throws IOException, SAXException, TransformerException {
        writeXml(outputStream);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Populate the combo box with data hardcoded from their respective enum classes
        etype.getItems().addAll(BeverageType.values());
        add.getItems().addAll(drinkAdd.values());
        dsize.getItems().addAll(drinkSize.values());
        bshots.getItems().addAll(brewOpt.values());
        cust.getItems().addAll(customAdds.values());

//      Select the first index as the selected default displayed text
        etype.getSelectionModel().select(0);
        add.getSelectionModel().select(0);
        dsize.getSelectionModel().select(0);
        bshots.getSelectionModel().select(0);
        cust.getSelectionModel().select(0);

    }

    // Reset Button Action
    public void actionclear() {
        etype.getSelectionModel().select(0);
        add.setVisible(false);
        add.getSelectionModel().select(0);
        dsize.setVisible(false);
        dsize.getSelectionModel().select(0);
        bshots.setVisible(false);
        bshots.getSelectionModel().select(0);

        clearbox.setVisible(false);
        cust.getSelectionModel().select(0);
        cust.setVisible(false);
        tfield.clear();
        tfield.setVisible(false);
        coffee_image.setVisible(false);
        qrcode.setVisible(false);
        brew.setVisible(false);
        pay.setVisible(false);

    }

    // Text field clear button action
    public void actionddeletselection() {
        cust.getSelectionModel().select(0);
        tfield.clear();

    }


    public void actionmaintenance() {
        pinpane.setVisible(true);
    }

    public void actionexit() {
        maintainpane.setVisible(false);
        apane.setVisible(false);
        parentpane.setVisible(true);
        pinpane.setVisible(false);
        pin.setText("");
    }


    public void actionpin() {
        if (pin.getText().equals(servicecode)) {
            maintainpane.setVisible(true);
            pinpane.setVisible(false);
            parentpane.setVisible(false);
        } else if (pin.getText().equals("")) {
            pinpane.setVisible(true);

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("PASSWORD ERROR");
            alert.setContentText("WRONG PIN CODE");
            alert.setX(615);
            alert.setY(220);
            alert.showAndWait();
        }
    }
}