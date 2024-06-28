package com.example.vetclinic.controller;

import javafx.fxml.FXML;

import java.io.IOException;

public class UserWindowController {

    @FXML
    protected void returnAction() throws IOException {
        SceneController.switchScene("login.fxml");
    }
}
