import java.util.*;

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

    public void sortBySuit(){
        Comparator<Card> sorted = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(cardsInHand, sorted);
    }
}

