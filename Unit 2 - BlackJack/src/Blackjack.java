import java.util.Scanner;

public class Blackjack {
    private int bet;
    private int cash;
    private Scanner s;
    private String winner;
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public Blackjack() {
        s = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            cash = 100;
            while (cash > 0) {
                System.out.println(String.format("Thanks for playing Blackjack! You have $%d to play!", cash));
                initGameState();
                playerTurn();
                if (!winner.equals("dealer")) {
                    dealerTurn();
                }
                declareWinner();
            }
        }
    }

    private void initGameState() {
        bet = getBet();
        cash -= bet;
        deck = new Deck();
        deck.shuffle();
        playerHand = new Hand(false);
        dealerHand = new Hand(true);
        winner = "";

        initHands();

        System.out.println(playerHand);
        System.out.println(dealerHand);
    }

    private void playerTurn() {
        while (!playerHand.isOver21()) {
            String action = getAction(new String[]{"hit", "stand"});
            if (action.equals("hit")) {
                playerHand.draw(deck);
                System.out.println(playerHand);
            } else {
                return;
            }
        }
        System.out.println("Your hand is busted!");
        winner = "dealer";
    }

    private void dealerTurn() {
        while (dealerHand.getTotalValue() < 17) {
            System.out.println("The dealer decides to hit!");
            dealerHand.draw(deck);
            System.out.println(dealerHand);
        }
        if (dealerHand.isOver21()) {
            System.out.println("The dealer's hand is busted!");
            winner = "player";
        }
    }

    private void declareWinner() {
        System.out.println(playerHand);
        dealerHand.transparentPrint();
        if (winner.equals("dealer") || (!winner.equals("player") && dealerHand.getTotalValue() > playerHand.getTotalValue())) {
            System.out.println("The dealer has won this round!");
        } else if (winner.equals("player") || (!winner.equals("dealer") && playerHand.getTotalValue() > dealerHand.getTotalValue())) {
            System.out.println("You have won this round!");
            cash += bet * 2;
        } else {
            System.out.println("It was a tie!");
            cash += bet;
        }
    }

    private String getAction(String[] validStrings) {
        String ui;
        while (true) {
            System.out.print("Would you like to hit or stand? ");
            ui = s.nextLine();
            for (String s : validStrings) {
                if (ui.equalsIgnoreCase(s)) return ui.toLowerCase();
            }
            System.out.print("Invalid Input! ");
        }

    }

    private int getBet() throws NumberFormatException {
        String ui;
        int convert;
        System.out.print("How much would you like to bet? ");
        while (true) {
            ui = s.nextLine();
            try {
                convert = Integer.parseInt(ui);
                if ((0 < convert) && (convert <= cash)) {
                    return convert;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input! How much would you like to bet? ");
            }
        }
    }

    private void initHands() {
        playerHand.draw(deck);
        playerHand.draw(deck);
        dealerHand.draw(deck);
        dealerHand.draw(deck);
    }

    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        bj.run();
    }
}
