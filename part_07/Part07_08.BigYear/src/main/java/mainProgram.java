
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdsRegister register = new BirdsRegister();

        while (true){
            System.out.print("? ");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if (command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName, 0);
                register.addBird(bird);
            }
            if (command.equals("Observation")){
                System.out.print("Bird? ");
                String observedBird = scanner.nextLine();
                register.observation(observedBird);

            }
            if (command.equals("All")){
                register.printBirds();
            }
            if (command.equals("One")){
                System.out.print("Bird? ");
                String printedBird = scanner.nextLine();
                register.printOneBird(printedBird);
            }
        }


    }

}
