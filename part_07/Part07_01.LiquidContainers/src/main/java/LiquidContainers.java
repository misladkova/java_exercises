
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int limit = 100;

        while (true) {
            System.out.println("First: " + first + "/" + limit);
            System.out.println("Second: " + second + "/" + limit);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (amount<=0){
                continue;
            }
            if (command.equals("add")) {
                if ((first + amount) > limit) {
                    first = limit;
                } else {
                    first += amount;
                }
            }
            if (command.equals("move")) {
                if (first < amount) {
                    second += first;
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                }
                if (second > limit) {
                    second = limit;
                }
            }
            if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}

