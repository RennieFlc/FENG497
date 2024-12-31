package com.example.feng497ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class HelloController {
    @FXML
    private Button scanButton;
    @FXML
    private Button uploadButton;
    @FXML
    private Button analyzeButton;
    @FXML
    private Button resultsButton;

    private File selectedFile;

    @FXML
    private void handleScan(ActionEvent event) {
        // Simulate scanning a file (for now, mock a scanned image file)
        selectedFile = new File("scanned_blueprint.png");
        analyzeButton.setDisable(false);
    }

    @FXML
    private void handleUpload(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Blueprint Files", "*.pdf", "*.png", "*.jpg")
        );
        selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            analyzeButton.setDisable(false);
        }
    }

    @FXML
    private void handleAnalyze(ActionEvent event) {
        if (selectedFile == null) {
            return;
        }

        ResultsController.setAnalysisResults("File: " + selectedFile.getName() + "\n"
                + "Safety Score: 85/100\n"
                + "Critical Issues: None\n"
                + "Recommendations: Safe for Earthquakes.");

        resultsButton.setDisable(false);
    }

    @FXML
    private void goToResults(ActionEvent event) throws IOException {
        HelloApplication.loadScene("results-view.fxml");
    }
}
