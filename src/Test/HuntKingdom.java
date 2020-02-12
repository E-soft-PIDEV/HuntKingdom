/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Med. Ali
 */
public class HuntKingdom extends Application {

    private Stage ps;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.ps = primaryStage;
       
        Parent parentPage = FXMLLoader.load(getClass().getResource("/Views/article.fxml"));

        Scene scene = new Scene(parentPage);

        this.ps.setScene(scene);

        this.ps.show();
    }

    ;
        
      
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
