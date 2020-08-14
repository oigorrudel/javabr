package deck;

import java.util.Arrays;
import java.util.Collection;

public enum CardType {

    JOKER, SWORD, STICK, HEART, GOLD;

    public static Collection<CardType> normalTypes(){
        return Arrays.asList(SWORD, STICK, HEART, GOLD);
    }

}
