package deck;

public class TrucoDeck extends AbstractDeck {

    @Override
    protected void build() {
        CardType.normalTypes()
                .forEach(this::generateByType);
    }

    @Override
    protected void generateByType(CardType type) {
        int i = 1;
        addAll(i, type, 7);

        i = 10;
        addAll(i, type, 3);
    }
}
