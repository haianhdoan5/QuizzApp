module com.dha.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.dha.quizzapp to javafx.fxml;
    exports com.dha.quizzapp;
}
