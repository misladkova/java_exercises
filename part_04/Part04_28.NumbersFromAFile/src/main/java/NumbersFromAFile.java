
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        try (Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                int number = Integer.valueOf(scan.nextLine());
                if(number<=upperBound && number>=lowerBound){
                    sum+=1;
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Numbers: "+sum);

    }

}
