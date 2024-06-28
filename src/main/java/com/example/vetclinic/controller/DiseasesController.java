package com.example.vetclinic.controller;

import javafx.fxml.FXML;

import java.io.IOException;

public class DiseasesController {

    @FXML
    protected void returnAction() throws IOException {
        SceneController.switchScene("adminMenu.fxml");
    }
}
