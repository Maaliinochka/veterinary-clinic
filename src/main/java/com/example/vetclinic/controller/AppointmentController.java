package com.example.vetclinic.controller;

import javafx.fxml.FXML;

import java.io.IOException;

public class AppointmentController {

    @FXML
    protected void returnAction() throws IOException {
        SceneController.switchScene("adminMenu.fxml");
    }
}
