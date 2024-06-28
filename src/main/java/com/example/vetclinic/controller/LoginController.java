package com.example.vetclinic.controller;

import com.example.vetclinic.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class LoginController {

    @FXML
    protected void loginAction() throws IOException {
        SceneController.switchScene("vet.fxml");
    };
    @FXML
    protected void registerAction() {

    };

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
