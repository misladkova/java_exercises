
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (amount<=0){
                continue;
            }
            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("remove")){
                second.remove(amount);
            }
            if (command.equals("move")) {
                if (first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
        }
    }

}
