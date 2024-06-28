module com.example.vetclinic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.vetclinic to javafx.fxml;
    exports com.example.vetclinic;
    exports com.example.vetclinic.controller;
    opens com.example.vetclinic.controller to javafx.fxml;
}