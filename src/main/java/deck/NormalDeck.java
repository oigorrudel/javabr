package main.java.deck;

public class NormalDeck extends AbstractDeck {

    @Override
    protected void build() {
        generateHalfDeck();
        generateHalfDeck();
    }

    private void generateHalfDeck(){
        CardType.normalTypes()
                .forEach(this::generateByType);

        add(JokerCard.create());
        add(JokerCard.create());
    }

    @Override
    protected void generateByType(CardType type) {
        for(int i = 1; i <= 13; i++)
            add(new NormalCard(type, i));
    }
}