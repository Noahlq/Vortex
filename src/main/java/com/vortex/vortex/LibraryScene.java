package com.vortex.vortex;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class LibraryScene {

    private Main main;
    private VBox layout;
    private Header header;
    private ObservableList<Game> gamesList;
    private ListView<Game> listView;

    public LibraryScene(Main main) {
        this.main = main;
        layout = new VBox(10);

        header = new Header(main);

        gamesList = FXCollections.observableArrayList();

        listView = new ListView<>(gamesList);
        listView.setPrefHeight(400);

        listView.setCellFactory(new Callback<ListView<Game>, javafx.scene.control.ListCell<Game>>() {
            @Override
            public javafx.scene.control.ListCell<Game> call(ListView<Game> param) {
                return new javafx.scene.control.ListCell<Game>() {
                    @Override
                    protected void updateItem(Game item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            setText(item.getName() + " - " + item.getDirectory() + " - " + item.getPlatform() + " - " + item.getHoursPlayed());
                        } else {
                            setText(null);
                        }
                    }
                };
            }
        });

        layout.getChildren().addAll(header.getLayout(), listView);

        Button buttonAddGame = new Button("Adicionar Jogo");

        layout.getChildren().addAll(buttonAddGame);

        buttonAddGame.setOnAction(e -> {
            TextField gameName = new TextField();
            TextField gameDirectory = new TextField();
            TextField gamePlatform = new TextField();
            TextField gameIcon = new TextField();

            gameName.setPromptText("Game Name:");
            gameDirectory.setPromptText("Game Directory:");
            gamePlatform.setPromptText("Game Platform:");
            gameIcon.setPromptText("Game Icon:");

            layout.getChildren().addAll(gameName, gameDirectory, gamePlatform, gameIcon);

            layout.getChildren().remove(buttonAddGame);

            Button buttonSaveGame = new Button("Salvar Jogo");
            layout.getChildren().add(buttonSaveGame);

            buttonSaveGame.setOnAction(ev -> {
                String gameNameString = gameName.getText();
                String gameDirectoryString = gameDirectory.getText();
                String gamePlatformString = gamePlatform.getText();
                String gameIconString = gameIcon.getText();

                // Criando um novo jogo com os dados inseridos
                Game newGame = new Game(gameNameString, gameDirectoryString, gamePlatformString, gameIconString, 0);

                // Adicionando o novo jogo à lista
                gamesList.add(newGame);

                System.out.println("Game Added: " + newGame);
            });
        });
    }

    public VBox getLayout() {
        return layout;
    }
}
