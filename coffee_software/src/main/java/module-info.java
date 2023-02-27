module coffee.coffee_software {
    requires javafx.controls;
    requires javafx.fxml;


    opens coffee.coffee_software to javafx.fxml;
    exports coffee.coffee_software;
}