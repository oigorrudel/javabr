package deck;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.IntStream;

public abstract class AbstractDeck extends LinkedList<AbstractCard> {

     protected AbstractDeck() {
          build();
     }

     protected abstract void build();

     protected abstract void generateByType(CardType type);

     protected void addAll(Integer start, CardType type, Integer times){
          IntStream
                  .iterate(start, j -> j + 1)
                  .limit(times)
                  .forEach(number -> add(type, number));
     }

     protected void add(CardType type, Integer number){
          add(new NormalCard(type, number));
     }

     public void showDeck(){
          iterator().forEachRemaining(System.out::println);
     }

     public void shuffle(){
          Collections.shuffle(this);
     }

}
