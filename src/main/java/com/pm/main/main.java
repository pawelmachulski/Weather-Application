package com.pm.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Główna klasa okna oraz klasa uruchomieniowa
 */


public class main extends Application {

    public void start(Stage primaryStage) throws Exception { //argument to referencja na obiekt głównego okna
        //zwiazanie okna z plikiem fxml gdzie jest zdefiniowany layout
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Weather");
        Scene scene = new Scene(root, 200,270);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  //daje nam to mozliwosc wyswietlenia aplikacji z konsoli. Nie musimy podawac argumentow args.
    }
}
