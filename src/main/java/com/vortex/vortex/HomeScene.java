package com.vortex.vortex;

import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class HomeScene {

    private Main main;
    private VBox layout;
    private Header header;

    public HomeScene(Main main) {
        this.main = main;
        layout = new VBox(10);

        // Inicializa o header
        header = new Header(main);
        Label label = new Label("Welcome to the Home");
        layout.getChildren().addAll(header.getLayout(), label);
    }

    public VBox getLayout() {
        return layout;
    }
}
