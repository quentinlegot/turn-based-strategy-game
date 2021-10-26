package fr.lnl.game.server.games.action;

import fr.lnl.game.server.games.Game;

public abstract class AbstractAction implements Action {
    private final Game game;

    public AbstractAction(Game game){
        this.game = game;
    }

    protected Game getGame() {
        return game;
    }
}
