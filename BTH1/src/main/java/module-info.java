module com.dha.bth1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.dha.bth1 to javafx.fxml;
    exports com.dha.bth1;
}
