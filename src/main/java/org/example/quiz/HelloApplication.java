package org.example.quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage default_stage; // Zmienna statyczna

    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.default_stage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("start.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        ScenesController controller = fxmlLoader.getController();
        if (controller != null) {
        } else {
            System.err.println("Controller is null");
        }

        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);

        default_stage.setTitle("Quiz Game");
        default_stage.setScene(scene);
        default_stage.setResizable(false);
        default_stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
