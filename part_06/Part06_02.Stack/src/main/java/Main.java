import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Stack values = new Stack();

        System.out.println(values.isEmpty());
        values.add("1");
        values.add("2");
        values.add("3");
        values.add("4");
        values.add("5");

        System.out.println(values.isEmpty());
        System.out.println(values.values());

        while (!(values.isEmpty())){
            String a = values.take();
            System.out.println(a);

        }
    }
}
