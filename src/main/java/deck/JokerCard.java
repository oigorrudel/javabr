package main.java.deck;

public class JokerCard extends AbstractCard {


    private JokerCard() {
        this.type = CardType.JOKER;
    }

    public static JokerCard create(){
        return new JokerCard();
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
