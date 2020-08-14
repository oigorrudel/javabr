package deck;

public class NormalCard extends AbstractCard {

    private Integer number;

    public NormalCard(CardType type, Integer number) {
        this.type = type;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number +" "+ this.type;
    }
}
