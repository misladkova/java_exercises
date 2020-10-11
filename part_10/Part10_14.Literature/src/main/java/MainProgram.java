
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Book> library = new ArrayList<>();

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();
            if (book.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int recommended = Integer.valueOf(scanner.nextLine());
            library.add(new Book(book, recommended));
            System.out.println();
        }

        System.out.println();
        System.out.println(library.size()+" books in total.");
        System.out.println();

        sortLibrary(library);
        library.stream()
                .forEach(System.out::println);

    }

    public static ArrayList<Book> sortLibrary(ArrayList<Book> list){
        Collections.sort(list);
        return list;
    }

}
