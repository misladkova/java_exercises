import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")){
                break;
            }
            if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokes.addJoke(joke);
            }
            if (command.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(this.jokes.drawJoke());
            }
            if (command.equals("3")){
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
    }
}
