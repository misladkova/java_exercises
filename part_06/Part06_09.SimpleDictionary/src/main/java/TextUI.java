import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            if (input.equals("search")){
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                if (dictionary.translate(toBeTranslated) == null){
                    System.out.println("Word "+toBeTranslated+" was not found");
                    continue;
                }
                System.out.println("Translation: "+dictionary.translate(toBeTranslated));
            }else {
                System.out.println("Unknown command");
            }
        }
    }
}
