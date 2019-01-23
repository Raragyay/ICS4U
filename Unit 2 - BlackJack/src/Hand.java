import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand = new ArrayList<>();
    private int totalValue = 0;
    private boolean over21 = false;
    private boolean isDealer;
    private String moniker;

    public int getTotalValue() {
        return totalValue;
    }

    public boolean isOver21() {
        return over21;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public Hand(boolean isDealer) {
        this.isDealer = isDealer;
        moniker=isDealer?"Dealer":"Player";
    }

    public void addCard(Card c) {
        hand.add(c);
        totalValue += c.getValue();
        over21 = totalValue > 21;
    }

    public void draw(Deck d){
        addCard(d.draw());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.format("%s's Hand: \n",moniker));
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && isDealer) {
                s.append("\tCard ???\n");
            } else {
                s.append(String.format("\t%s\n", hand.get(i)));
            }
        }
        if (!isDealer) s.append(String.format("Card Value: %d\n", totalValue));
        return s.toString();
    }
    public void transparentPrint(){
        boolean formerIsDealer=isDealer;
        isDealer=false;
        System.out.println(this);
        isDealer=formerIsDealer;
    }

    public static void main(String[] args) {
        Hand h = new Hand(true);
        h.addCard(new Card(12, 3));
        h.addCard(new Card(1, 1));
        System.out.println(h);
    }
}
