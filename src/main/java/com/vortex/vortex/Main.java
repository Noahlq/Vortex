package com.vortex.vortex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private Scene homeScene;
    private Scene libraryScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Vortex");

        HomeScene homeScreen = new HomeScene(this);
        LibraryScene libraryScreen = new LibraryScene(this);

        homeScene = new Scene(homeScreen.getLayout(), 800, 600);
        libraryScene = new Scene(libraryScreen.getLayout(), 800, 600);

        primaryStage.setScene(homeScene);
        primaryStage.show();
    }

    public void switchToHome() {
        primaryStage.setScene(homeScene);
    }

    public void switchToLibrary() {
        primaryStage.setScene(libraryScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
