module com.example.vetclinic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vetclinic to javafx.fxml;
    exports com.example.vetclinic;
}