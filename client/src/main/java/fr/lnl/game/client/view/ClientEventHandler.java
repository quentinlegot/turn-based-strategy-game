package fr.lnl.game.client.view;

import fr.lnl.game.client.listener.ButtonListener;
import fr.lnl.game.server.listener.ModelListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ClientEventHandler implements EventHandler<ActionEvent> {

    private final ModelListener listener;

    public ClientEventHandler(ButtonListener listener) {
        this.listener = listener;
    }

    @Override
    public void handle(ActionEvent event) {
        listener.updateModel(event);
    }
}
