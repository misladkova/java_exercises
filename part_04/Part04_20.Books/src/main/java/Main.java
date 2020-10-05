import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publication_year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, publication_year));
        }
        System.out.println();

        System.out.print("What information will be printed? ");
        String vyber = scanner.nextLine();
        if (vyber.equals("everything")){
            for (Book book: books) {
                System.out.println(book);
            }
        }
        if (vyber.equals("name")){
            for (Book a : books) {
                String a_title = a.getTitle();
                System.out.println(a_title);
            }
        }
        if (vyber.equals("pages")){
            for (Book a : books) {
                int a_pages = a.getPages();
                System.out.println(a_pages);
            }
        }
        if (vyber.equals("publication year")){
            for (Book a : books) {
                int a_pubyear = a.getPublicationYear();
                System.out.println(a_pubyear);
            }
        }
    }
}
