module com.example.feng497ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.feng497ui to javafx.fxml;
    exports com.example.feng497ui;
}