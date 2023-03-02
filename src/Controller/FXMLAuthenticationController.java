package Controller;

import Model.Users;
import Repository.Repository;
import View.DomainsInterface;
import View.PersonInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

public class FXMLAuthenticationController implements Initializable {
    @FXML
    private Label welcomeLabel;
    @FXML
    private Label userField;
    @FXML
    private Label passwordField;
    @FXML
    private TextField userText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Button singIn;
    @FXML Label massage;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void handleButtonActionSingIn(ActionEvent actionEvent) {
        Set<Users> users = new Repository().findUser();
        for (Users user : users) {
            if (userText.getText().equals(user.getName()) && passwordText.getText().equals(user.getPassword())) {
                massage.setText("");
                new PersonInterface().init();
            } else {
                massage.setStyle("-fx-text-fill: RED");
                massage.setText("Пользователь не найден");
            }
        }
    }
}
