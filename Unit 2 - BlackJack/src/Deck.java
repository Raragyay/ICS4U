import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public void shuffle() {
        Random rand = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i);
            Card temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }

    public Card draw() {
        Card temp = deck.get(deck.size() - 1);
        deck.remove(temp);
        return temp;
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                this.deck.add(new Card(i, j));
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck.draw());
        System.out.println();
        deck.printDeck();
    }

}
