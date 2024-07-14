package com.vortex.vortex;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Header {

    private Button buttonHome;
    private Button buttonLibrary;
    private HBox layout;

    public Header(Main main) {
        buttonHome = new Button("Home");
        buttonLibrary = new Button("Library");

        buttonHome.setOnAction(e -> main.switchToHome());
        buttonLibrary.setOnAction(e -> main.switchToLibrary());

        layout = new HBox(10);
        layout.getChildren().addAll(buttonHome, buttonLibrary);
    }

    public HBox getLayout() {
        return layout;
    }
}
