import java.util.ArrayList;
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
}

