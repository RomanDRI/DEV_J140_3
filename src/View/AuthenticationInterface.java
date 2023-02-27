package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Set;

public class AuthenticationInterface extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent gp = FXMLLoader.load(getClass().getResource("FXMLAuthentication.fxml"));

        Scene scene = new Scene(gp,400,300);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
}