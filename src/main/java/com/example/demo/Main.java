package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("calculator-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350  , 300);

            primaryStage.setTitle("Calculator Application");
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}