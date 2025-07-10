package com.dha.quizzapp;

import com.dha.utils.themes.Theme;
import com.dha.utils.MyAlert;
import com.dha.utils.MyStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {

    @FXML
    private ComboBox<Theme> cbThemes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }

    public void clickMQ(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("question.fxml");
    }

    public void clickT(ActionEvent event) {
        MyAlert.getInstance().showMq("coming soon...");
    }

    public void clickP(ActionEvent event) {
        MyAlert.getInstance().showMq("coming soon...");
    }

    public void clickJ(ActionEvent event) {
        MyAlert.getInstance().showMq("coming soon...");
    }

    public void clickA(ActionEvent event) {
        MyAlert.getInstance().showMq("coming soon...");
    }

    public void clickThemse(ActionEvent event) {
          this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }

}
