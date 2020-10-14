import java.util.*;

public class Hand implements Comparable<Hand>{

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

    @Override
    public int compareTo(Hand hand) {
        int sum = 0;
        Iterator<Card> cardIterator = cardsInHand.iterator();

        while (cardIterator.hasNext()) {
            sum+=cardIterator.next().getValue();
        }
        int sum2 = 0;
        

        while (card2Iterator.hasNext()) {
            sum += cardIterator.next().getValue();
        }
        if (sum-sum2<0){
            return -1;
        }
        if (sum-sum2>0){
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

