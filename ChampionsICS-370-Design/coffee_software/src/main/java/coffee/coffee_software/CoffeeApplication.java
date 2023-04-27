package coffee.coffee_software;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public class CoffeeApplication extends Application {
    CoffeeController cont;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CoffeeApplication.class.getResource("coffee-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),1280, 800);
        cont = fxmlLoader.getController();
        stage.setTitle("Coffee Software!");
        stage.setScene(scene);
        stage.setFullScreen(stage.isFullScreen());
        stage.show();
        stage.setOnCloseRequest(event -> {
            try {
                cont.ending();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (TransformerException e) {
                throw new RuntimeException(e);
            }
        });
    }



    public static void main(String[] args) {
        launch();


    }

}