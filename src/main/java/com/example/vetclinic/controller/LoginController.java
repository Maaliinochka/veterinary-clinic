package com.example.vetclinic.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class LoginController {

    @FXML
    protected void loginAction() throws IOException {
        SceneController.switchScene("userWindow.fxml");
    }
    @FXML
    protected void registerAction() throws IOException {
        SceneController.switchScene("registration.fxml");
    }
}
