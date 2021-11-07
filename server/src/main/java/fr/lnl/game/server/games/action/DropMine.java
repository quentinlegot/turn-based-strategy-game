package fr.lnl.game.server.games.action;

import fr.lnl.game.server.games.Game;
import fr.lnl.game.server.games.grid.Mine;
import fr.lnl.game.server.games.player.Player;
import fr.lnl.game.server.utils.Point;

import java.util.List;

public class DropMine extends DropObject {

    public DropMine(Game game, Player player){
        super(game, player);
    }

    /**
     * @deprecated même principe que {@link Shot#doAction()}
     */
    @Deprecated
    @Override
    public void doAction() {
        List<Point> points = getValidPoint();
        Point point = choseRandomPoint(points);
        game.getGrid().getBoard().get(point).setB(new Mine());
        game.getCurrentPlayer().decrementEnergy(player.getClassPlayer().getMineCost());
    }

    @Override
    public boolean isPossible() {
        return super.isPossible();
    }

    @Override
    public List<Point> getValidPoint() {
        return super.getValidPoint();
    }

}
