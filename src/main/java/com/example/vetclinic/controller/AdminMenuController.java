package com.example.vetclinic.controller;

import javafx.fxml.FXML;

import java.io.IOException;

public class AdminMenuController {

    @FXML
    protected void animals() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void owners() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void breeds() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void vets() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void diseases() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void appointments() throws IOException {
        SceneController.switchScene(".fxml");
    }
    @FXML
    protected void returnAction() throws IOException {
        SceneController.switchScene("login.fxml");
    }
}
