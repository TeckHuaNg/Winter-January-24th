/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wjan24;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class LaunchCreateNewEmployeeViewer extends Application{

    public static void main(String[] args){
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreatenewEmployeeView.fxml"));
        AnchorPane createEmployeeLayout = loader.load();
        
        Scene createEmployeeScene = new Scene(createEmployeeLayout);
        primaryStage.setScene(createEmployeeScene);
        primaryStage.show();
    }
    
}
