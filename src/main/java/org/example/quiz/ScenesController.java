package org.example.quiz;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScenesController {
    private Stage stage;

    // Domyślny konstruktor
    public ScenesController() {
    }

    // Setter do ustawiania Stage (można używać do przekazywania Stage)
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handleStartButtonAction() throws IOException {
        changeScene("menu.fxml");
    }

    private void changeScene(String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
