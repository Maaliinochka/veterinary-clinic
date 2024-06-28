package com.example.vetclinic;

import com.example.vetclinic.controller.SceneController;
import com.example.vetclinic.database.DataBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("veterinary-clinic");
        stage.setScene(scene);
        SceneController.setStage(stage);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        DataBase.closeConnection();
    }

    public static void main(String[] args) {
        launch();
    }
}