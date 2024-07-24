package org.example.quiz;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ScenesController {
    @FXML
    private void goToMenu() throws IOException {
        changeScene("menu.fxml");
    }

    @FXML
    private void startGame() throws IOException {
        changeScene("game.fxml");
    }

    @FXML
    private void browseQuestions() throws IOException {
        changeScene("browse.fxml");
    }

    @FXML
    private void addQuestion() throws IOException {
        changeScene("add.fxml");
    }

    @FXML
    private void closeApp() {
        Platform.exit();
    }

    private void changeScene(String fxmlFile) throws IOException {
        if (HelloApplication.default_stage == null) {
            throw new IllegalStateException("Stage is not set.");
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);

        HelloApplication.default_stage.setScene(scene);
        HelloApplication.default_stage.show();
    }
}
