
public class Main {

    public static void main(String[] args) {

        Box box = new Box(5);

        Box box1 = new Box(10);

        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 3);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);

        //System.out.println(book1);
        //System.out.println(book2);
        //System.out.println(cd1);
        //System.out.println(cd2);

        box.add(book1);
        box.add(cd1);
        box.add(book2);

        box1.add(book2);

        System.out.println(box);
        System.out.println(box1);

        box1.add(box);

        System.out.println(box1);
    }

}
