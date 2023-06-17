/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ABD ALL
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField usernameTextField;
    @FXML
    private Button loginButton;
    @FXML
    private Label statusLabel;
    @FXML
    private PasswordField PasswordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginButtonHandler(ActionEvent event) throws IOException {
        if (usernameTextField.getText().equals("user") && PasswordField.getText().equals("12345")) {
            System.out.println("Login Successful");
            ViewManager.closeLoginPage();
            ViewManager.openConversionPage();
            usernameTextField.setText("");
            PasswordField.setText("");
            statusLabel.setText("");
        } else if (usernameTextField.getText().isEmpty() || PasswordField.getText().isEmpty()) {
            statusLabel.setText("A Blank Credential Found.");
        } else {
            statusLabel.setText("Incorrect username or password.");
        }

    }

}
