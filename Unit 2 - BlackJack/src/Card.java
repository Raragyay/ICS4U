public class Card {
    private int rank = 1;
    private int suit = 1;
    private int value = 0;

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String rankToString() {
        String index = "AJQK";
        if (2 <= this.rank && this.rank <= 10) {
            return String.valueOf(this.rank);
        } else {
            return String.valueOf(index.charAt((this.rank - 1) % 9));
        }
    }

    public String suitToString() {
        String[] index = {"Empty", "Diamonds", "Clubs", "Hearts", "Spades"};
        return index[suit];
    }

    private static int valueConvert(int rank) {
        if (rank == 1) {
            return 11;
        } else if (rank >= 10) {
            return 10;
        } else {
            return rank;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (rank != card.rank) return false;
        if (suit != card.suit) return false;
        return value == card.value;
    }

    @Override
    public int hashCode() {
        int result = rank;
        result = 31 * result + suit;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Card %s of %s", rankToString(), suitToString());
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        this.value = Card.valueConvert(this.rank);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            Card c = new Card(i, 1);
            System.out.println(c.rankToString());
            System.out.println(c.getValue());
        }
    }
}
