package dev.lpa;

import java.util.Collections;
import java.util.List;

public record Player(List<Card> playerDeck, String name){

    public Card playCard(){
        Card firstPlayedCard = playerDeck.get(playerDeck.size() - 1);
        Card playedCard = playerDeck.get(0);
        System.out.println(playedCard);
        Collections.rotate(playerDeck,playerDeck.size() - 1);
        return playedCard;
//        if (firstPlayedCard.equals(playedCard)){
//            System.out.println("End of game!");
//        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerDeck=" + playerDeck +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String name() {
        return name;
    }
}
