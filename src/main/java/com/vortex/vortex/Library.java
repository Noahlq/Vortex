package com.vortex.vortex;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Game> games;

    public Library() {
        this.games = new ArrayList<Game>();
    }
    public void addGame (Game game) {
        this.games.add(game);

    }
    public void removeGame (Game game) {
        this.games.remove(game);
    }

}
