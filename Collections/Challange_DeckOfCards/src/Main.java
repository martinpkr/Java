import dev.lpa.Card;
import dev.lpa.Player;
import dev.lpa.Voina;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        Card jackOfDiamonds = new Card(Card.Suit.DIAMOND,"J",9);
//        Card aFiveOfClubs = Card.getNumbericCard(Card.Suit.CLUB,5);
//
//        List<Card> listOfJacks = Collections.nCopies(13,jackOfDiamonds);
//        System.out.println(listOfJacks);
//        Card.printDeck(listOfJacks,"idk",3);
//
//        List<Card> standardDeck = Card.getStandardDeck();
//        Collections.shuffle(standardDeck);
//        Card.printDeck(standardDeck);
//        List<Card> deck = Card.getStandardDeck();
//        Card.printDeck(deck);
        List<Card> deck = Card.getStandardDeck();
        Voina voina = new Voina(5, deck);
        List<Player> players = voina.getPlayers(deck, 5);
        voina.getPlayers(deck, 5);
    }
}