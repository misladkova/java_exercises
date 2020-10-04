import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                System.out.print("To add: ");
                String nextTask = scanner.nextLine();
                this.list.add(nextTask);
            }
            if (command.equals("list")){
                this.list.print();
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int number = Integer.parseInt(scanner.nextLine());
                this.list.remove(number);
            }
        }

    }

}
