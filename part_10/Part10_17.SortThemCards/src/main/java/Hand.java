import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{

    private List<Card> cardsInHand;
    private int sum;

    public Hand(){
        this.cardsInHand = new ArrayList<>();
        this.sum = sum;
    }

    public void add(Card card){
        cardsInHand.add(card);
        sum+= card.getValue();
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

    @Override
    public int compareTo(Hand o) {
        if (this.sum-o.sum<0){
            return -1;
        }
        if (this.sum-o.sum>0){
            return 1;
        }
        return 0;
    }

    public void sortBySuit(){
        Comparator<Card> sorted = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(cardsInHand, sorted);
    }
}

