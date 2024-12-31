package com.example.feng497ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        loadScene("hello-view.fxml");
        stage.setTitle("Building Safety Analyzer");
        stage.show();
    }

    public static void loadScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
