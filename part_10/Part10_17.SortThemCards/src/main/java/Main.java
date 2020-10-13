import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(14, Suit.HEART);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        List<Card> cards = new ArrayList<>();
        cards.add(first);
        cards.add(second);
        cards.add(third);

        Comparator<Card> sorted = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(cards, sorted);
        cards.stream()
                .forEach(s-> System.out.println(s));
    }
}
