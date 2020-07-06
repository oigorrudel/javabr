package deck;

import java.util.Collections;
import java.util.LinkedList;

public abstract class AbstractDeck extends LinkedList<AbstractCard> {

     protected AbstractDeck() {
          build();
     }

     protected abstract void build();

     protected abstract void generateByType(CardType type);

     public void showDeck(){
          iterator().forEachRemaining(System.out::println);
     }

     public void shuffle(){
          Collections.shuffle(this);
     }

}
