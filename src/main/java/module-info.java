module org.example.quiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.quiz to javafx.fxml;
    exports org.example.quiz;
}