
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number==-1){
                break;
            }
            total.addNumber(number);
//            total.sum();
            if (number%2==0){
                even.addNumber(number);
//                even.sum();
            }else{
                odd.addNumber(number);
//                odd.sum();
            }
        }
        System.out.println("Sum: "+total.sum());
        System.out.println("Sum of even numbers: "+even.sum());
        System.out.println("Sum of odd numbers: "+odd.sum());
    }
}
