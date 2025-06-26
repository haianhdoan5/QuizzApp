/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dha.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alert=new Alert(Alert.AlertType.INFORMATION);
    private MyAlert(){
        alert.setTitle("QuizzApp");
    }
    
    public static MyAlert getInstance(){
        if(instance==null)
            instance=new MyAlert();
        return instance;
    }
    
    
    public void showMq(String content){
        alert.setContentText(content);
        alert.showAndWait();
    }
    
}
