package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class War {
    private List<Card> cardsForWar = new ArrayList<>(3);
    private Player player1;
    private Player player2;


    public War(List<Card> cardsForWar, Player player1,Player player2) {
        this.cardsForWar = cardsForWar;
        this.player1 = player1;
        this.player2 = player2;

    }

    public static void whoWinsWar(){

    }

}
