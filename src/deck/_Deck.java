package deck;

public class _Deck {

    public static void main(String[] args) {
        testDeck(new NormalDeck());
        testDeck(new TrucoDeck());
    }

    private static void testDeck(AbstractDeck deck){
        System.out.println("*** BEFORE ***");
        deck.showDeck();
        deck.shuffle();
        System.out.println("*** AFTER ***");
        deck.showDeck();

        System.out.println("*** POLL ***");
        System.out.println(deck.pollFirst());
        System.out.println(deck.pollFirst());
    }

}
