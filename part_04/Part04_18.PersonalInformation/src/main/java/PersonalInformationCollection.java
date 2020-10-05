
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }
        System.out.println();

        for (int i=0; i<infoCollection.size(); i++){
            PersonalInformation a = infoCollection.get(i);
            String a_firstName = a.getFirstName();
            String a_lastName = a.getLastName();
            System.out.println(a_firstName+" "+a_lastName);
        }
    }
}
