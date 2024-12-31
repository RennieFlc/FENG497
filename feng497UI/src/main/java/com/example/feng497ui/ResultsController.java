package com.example.feng497ui;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ResultsController {
    @FXML
    private TextArea resultArea;

    private static String analysisResults;

    public static void setAnalysisResults(String results) {
        analysisResults = results;
    }

    @FXML
    private void initialize() {
        resultArea.setText(analysisResults);
    }

    @FXML
    private void goToHome() throws IOException {
        HelloApplication.loadScene("hello-view.fxml");
    }
}
