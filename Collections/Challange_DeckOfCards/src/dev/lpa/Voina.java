package dev.lpa;

import java.util.*;

public class Voina {

    private int numberOfPlayers;
    private List<Card> deck;

    public Voina(List<Card> deck){
        numberOfPlayers = 2;
    }
    public Voina(int numberOfPlayers, List<Card> deck) {
        if(numberOfPlayers > 5){
            System.out.println("More than 5 players can't play the game");
        }
        this.numberOfPlayers = numberOfPlayers;
        this.deck = deck;
    }

    public List<Player> getPlayers(List<Card> deck,int numberOfPlayers){

        List<Player> players = new ArrayList<>();
        Collections.shuffle(deck);
        int partsOfDeckToBeSplitted = deck.size() / numberOfPlayers;
        int startOfSplit = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            List<Card> deckForPlayer = deck.subList(startOfSplit,partsOfDeckToBeSplitted + startOfSplit);
            startOfSplit += partsOfDeckToBeSplitted;
            Player player = new Player(deckForPlayer,"player" + i);
            players.add(player);
            System.out.println("player" + (i + 1) + " was created");
        }
        for (int i = 0; i < partsOfDeckToBeSplitted; i++) {
            inGame(players);
        }
        return players;
    }
    public void inGame(List<Player> players){
        Player bestPlayer = null;
        Card bestCard = null;
        List<Card> cardsPlayed = new ArrayList<>();

        for (Player player:
             players) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(player.name() + " is playing a card, click ENTER to see the card");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("Q")){
                return;
            }else{
                Card card = player.playCard();
                boolean isDuplicateRank = false;
                for (Card c : cardsPlayed) {
                    if (c.getRank() == card.getRank()) {
                        isDuplicateRank = true;
                        Player playerInWar2 = getPlayerByName(players,"player"+ cardsPlayed.indexOf(c));
                        System.out.println("Voina between: " + player.name() + " and player:" + playerInWar2.name());
                        War.whoWinsWar(player,playerInWar2);
                        break;
                    }
                }
                cardsPlayed.add(card);

                if (bestCard == null || card.getRank() > bestCard.getRank()) {
                    bestCard = card;
                    bestPlayer = player; // Update the bestPlayer to the current player
                }
            }

        }
        System.out.println("This hand is done!");
        Collections.sort(cardsPlayed,Comparator.comparing(Card::getRank).reversed());
        System.out.println(cardsPlayed);

        int bestCardIndex = cardsPlayed.indexOf(bestCard);

        // Retrieve the corresponding player from the players list
        System.out.println("The best played cards was" + bestCard + "this hand goes to -->" + bestPlayer.name());
    }

    public static Player getPlayerByName(List<Player> players,String targetName){
        for (Player player:
             players) {
            if(player.name().equals(targetName)){
                return player;
            }
        }
        return null;
    }
    public static Comparator<Card> RANK = new Comparator<Card>() {
        @Override
        public int compare(Card card, Card t1) {
            return card.getRank() + t1.getRank();
        }
    };
}
