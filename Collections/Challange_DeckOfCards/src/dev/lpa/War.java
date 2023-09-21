package dev.lpa;

import java.util.List;

public class War {

    private Player player1;
    private Player player2;


    public War(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void whoWinsWar(Player player1, Player player2) {
        List<Card> firstThree = player1.playerDeck().subList(0, 3);
        int sumRank1 = 0;
        List<Card> firstThreeSecPlayer = player2.playerDeck().subList(0, 3);
        int sumRank2 = 0;
        for (Card card :
                firstThree) {
            sumRank1 += card.getRank();
        }
        for (Card card :
                firstThreeSecPlayer) {
            sumRank2 += card.getRank();
        }
        if (sumRank1 > sumRank2) {
            System.out.println(player1.name() + " Wins this war!");
            for (Card card :
                    firstThree) {
                System.out.println(card + ", ");
            }
            System.out.println("Versus the opponent " + player2.name() + " with theese cards: ");
            for (Card card :
                    firstThreeSecPlayer) {
                System.out.println(card + ", ");
            }
            System.out.println("End of war -----------------------------------");
        } else if (sumRank2 > sumRank1) {
            System.out.println(player2.name() + " Wins this war with the following cards ->");
            for (Card card :
                    firstThreeSecPlayer) {
                System.out.println(card + ", ");
            }
            System.out.println("Versus the opponent " + player1.name() + " with theese cards: ");
            for (Card card :
                    firstThree) {
                System.out.println(card + ", ");
            }

            System.out.println("End of war -----------------------------------");
        } else {
            System.out.println("Tie");
        }
    }

}
