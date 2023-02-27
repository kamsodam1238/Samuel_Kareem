package coffee.coffee_software;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.control.SelectionMode.MULTIPLE;

public class CoffeeController {
    public Button pay;
    public Button brew;
    public TextField tfield;
    @FXML
    private Button start;
    @FXML
    private MenuButton cust;

    @FXML
    private MenuButton dsize;

    @FXML
    private MenuButton add;
    @FXML
    private MenuButton bshots;
    @FXML
    private ImageView qrcode;
    @FXML
    private ImageView coffee_image;
    @FXML
    private MenuButton etype;


    public void actionetype(ActionEvent actionEvent) {
        etype.setText(((MenuItem)actionEvent.getTarget()).getText());
        dsize.setVisible(true);
    }


    public void actionsize(ActionEvent actionEvent) {
        dsize.setText(((MenuItem)actionEvent.getTarget()).getText());
        add.setVisible(true);
        cust.setVisible(true);
    }

    public void actionadd(ActionEvent actionEvent) {
        add.setText(((MenuItem)actionEvent.getTarget()).getText());

        bshots.setVisible(true);
    }


    public void actionbshots(ActionEvent actionEvent) {
        bshots.setText(((MenuItem)actionEvent.getTarget()).getText());
        qrcode.setVisible(true);

        if(etype.getText().equalsIgnoreCase("LATTE")){
            Image image = new Image(getClass().getResourceAsStream("coffee/coffee_software/esp.png"));
            coffee_image.setImage(image);
        }

    }


    public void actionstart() {
        etype.setVisible(true);
        start.setVisible(false);
    }

    public void actioncustom(ActionEvent actionEvent) {
        cust.setText(((CheckMenuItem)actionEvent.getTarget()).getText());
        tfield.setText(((CheckMenuItem)actionEvent.getSource()).getText());
    }


    public void actionpay(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Payment");
        alert.setHeaderText("Results:");
        alert.setContentText("Payment is Successful!!!\n\nBegin Brewing");
        alert.showAndWait();
        pay.setVisible(false);
    }

    public void actionbrew(ActionEvent actionEvent) {

    }

    public void images(ActionEvent actionEvent){

    }

}