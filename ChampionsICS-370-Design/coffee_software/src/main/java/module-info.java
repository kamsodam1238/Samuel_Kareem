module coffee.coffee_software {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens coffee.coffee_software to javafx.fxml;
    exports coffee.coffee_software;
    exports coffee.coffee_beverage;
    opens coffee.coffee_beverage to javafx.fxml;
    exports coffee.misc;
    opens coffee.misc to javafx.fxml;
}