package com.dha.bth1;

import com.dha.utils.MyAlert;
import com.dha.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {

    public void clickMQ(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("question.fxml");
    }
    
     public void clickT(ActionEvent event){
        MyAlert.getInstance().showMq("coming soon...");
    }
     
      public void clickP(ActionEvent event){
        MyAlert.getInstance().showMq("coming soon...");
    }
    
       public void clickJ(ActionEvent event){
        MyAlert.getInstance().showMq("coming soon...");
    }
       
        public void clickA(ActionEvent event){
        MyAlert.getInstance().showMq("coming soon...");
    }
}
