import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Gift book = new Gift("LOTR", 1);
        Gift bike = new Gift("Bond", 5);
        Gift clothes = new Gift("HM", 2);

        Package gifts = new Package();

        gifts.addGift(book);
        gifts.addGift(bike);
        gifts.addGift(clothes);

        System.out.println("Gift's name: "+book.getName());
        System.out.println("Gift's weight: "+book.getWeight());
        System.out.println("Gift: "+book);

        System.out.println(gifts.totalWeight());

    }
}
