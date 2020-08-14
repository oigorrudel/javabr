package deck;

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
        addAll(1, type, 13);
    }
}