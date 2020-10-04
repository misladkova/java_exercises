
public class Main {

    public static void main(String[] args) {

        PaymentTerminal cash = new PaymentTerminal();

        PaymentCard card = new PaymentCard(2.00);

        System.out.println(cash);

        boolean wasSuccessful = cash.eatHeartily(card);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = cash.eatAffordably(card);
        System.out.println("there was enough money: " + wasSuccessful);
        cash.addMoneyToCard(card, 20);
        wasSuccessful = cash.eatHeartily(card);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(cash);
    }
}

