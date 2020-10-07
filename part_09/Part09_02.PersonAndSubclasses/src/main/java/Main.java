import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Tom Novak", "Baker St London"));
        persons.add(new Student("Oliver Merck", "5th Ave NY"));
        persons.add(new Teacher("Jim Talon", "10th Ave NY", 3000));

        printPersons(persons);


        //Person tom = new Person("Tom Novak", "Baker St London");
        //Person nina = new Person("Nina Merck", "Oxford St London");

        //System.out.println(tom);
        //System.out.println(nina);

        //Student oliver = new Student("Oliver Merck", "5th Ave NY");

        //System.out.println(oliver);
        //System.out.println(oliver.credits());
        //oliver.study();
        //System.out.println(oliver.credits());

        //Teacher teacher = new Teacher("Jim Talon", "10th Ave NY", 3000);

        //System.out.println(teacher);
    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person: persons){
            System.out.println(person);
        }
    }

}
