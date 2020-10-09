
public class Main {

    public static void main(String[] args) {
        
        TripleTacoBox triple = new TripleTacoBox();

        triple.eat();
        triple.eat();
        triple.eat();
        triple.eat();
        System.out.println(triple.tacosRemaining());

        CustomTacoBox custom = new CustomTacoBox(5);

        custom.eat();
        System.out.println(custom.tacosRemaining());
    }
}
