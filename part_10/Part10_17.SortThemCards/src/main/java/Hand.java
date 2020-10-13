import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand {

    private List<Card> cardsInHand;

    public Hand(){
        this.cardsInHand = new ArrayList<>();
    }

    public void add(Card card){
        cardsInHand.add(card);
    }

    public void print(){
        for (Card card: cardsInHand){
            System.out.println(card);
        }
    }

    public void sort(){
        Comparator<Card> sorted = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(cardsInHand, sorted);
        cardsInHand.stream()
                .forEach(s-> System.out.println(s));
    }
}

