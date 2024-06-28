package com.example.vetclinic.controller;

import com.example.vetclinic.database.UserDB;
import com.example.vetclinic.entitiy.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class RegistrationController {

    public TextField nameFIeld;
    public TextField addressField;
    public TextField phoneField;
    public TextField passwordField;

    @FXML
    protected void registerAction() throws IOException, SQLException {
        UserDB userDB = new UserDB();
        User user = new User(0, nameFIeld.getText(), addressField.getText(), phoneField.getText(), passwordField.getText());
        userDB.add(user);
        SceneController.switchScene("login.fxml");
    }

    @FXML
    protected void returnAction() throws IOException {
        SceneController.switchScene("login.fxml");
    }
}
