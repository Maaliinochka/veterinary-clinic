package com.example.vetclinic.controller;

import com.example.vetclinic.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private static Stage stage;


    public static void setStage(Stage stage) {
        SceneController.stage = stage;
        stage.show();
    }

    public static void switchScene(String name) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(name));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
