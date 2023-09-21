package dev.lpa;


import java.util.ArrayList;
import java.util.List;

public class Card {
    private Suit suit;
    private String face;
    private int rank;
    public Card(Suit suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }

    public static Card getFaceCard(Suit suit, char abbrv) {
        int index = "JQKA".indexOf(abbrv);
        if (index > -1) {
            return new Card(suit, "" + abbrv, index + 9);
        }
        System.out.println("Invalid Card Face Passed!");
        return null;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        if (description != null) {
            System.out.println(description);
        }
        int numberOfRows = deck.size() / rows;
        String printForEveryRow = "";
        for (int i = 0; i < deck.size(); i++) {
            if (i % numberOfRows == 0) {
                printForEveryRow += "\n";

            }
            printForEveryRow += deck.get(i);

        }

    }

    public Card getNumbericCard(Suit suit, int number) {
        if (number > 1 && number < 11) {
            return new Card(suit, String.valueOf(number), number - 2);
        }
        System.out.println("Invalid Card Number!");
        return null;
    }

    public ArrayList<Card> getStandardDeck() {
        ArrayList<Card> allcards = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            List<Suit> list = List.of(Suit.getValues());
            Suit currentSuit = list.get(i);
            ArrayList<Card> OneSuit = new ArrayList<>();
            for (int j = 2; j <= 10; j++) {

                allcards.add(getNumbericCard(currentSuit, j));
            }
            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
                allcards.add(getFaceCard(currentSuit, c));
            }
        }
        System.out.println(allcards);
        return allcards;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return switch (suit) {
            case CLUB -> '\u2660';
            case DIAMOND -> '\u2666';
            case HEART -> '\u2665';
            case SPADE -> '\u2663';
        } + " " + face + "(" + rank + ")";


    }

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public static Suit[] getValues() {
            return Suit.values();
        }
    }

}

