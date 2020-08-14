package main.java.deck;

public class TrucoDeck extends AbstractDeck {

    @Override
    protected void build() {
        CardType.normalTypes()
                .forEach(this::generateByType);
    }

    @Override
    protected void generateByType(CardType type) {
        int i = 1;
        while(i <= 7)
            add(new NormalCard(type, i++));

        i = 10;
        while(i <= 12)
            add(new NormalCard(type, i++));
    }
}
