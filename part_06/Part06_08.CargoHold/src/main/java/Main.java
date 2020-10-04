
public class Main {

    public static void main(String[] args) {
        
        Item book = new Item("Dark", 1);
        Item laptop = new Item("Mac", 3);
        Item boots = new Item("Boo", 3);
        Item mobile = new Item("Nok", 1);

        //System.out.println("Book: "+book);

        Suitcase suitcase = new Suitcase(5);

        Hold hold = new Hold(50);

        System.out.println(suitcase);
        System.out.println(hold);

        suitcase.addItem(book);
        System.out.println(suitcase);
        //System.out.println(suitcase.totalWeight());

        System.out.println();
        suitcase.addItem(laptop);
        suitcase.printItems();

        suitcase.addItem(boots);
        suitcase.addItem(mobile);

        hold.addSuitcase(suitcase);

        System.out.println(suitcase);
        System.out.println();
        System.out.println("Total weight: "+suitcase.totalWeight()+" kg");
        System.out.println();
        System.out.println("The suitcase contains the following items:\n");
        suitcase.printItems();

        System.out.println();
        System.out.println("Heaviest item: "+suitcase.heaviestItem());
        System.out.println();
        System.out.println(hold);

        System.out.println();
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
