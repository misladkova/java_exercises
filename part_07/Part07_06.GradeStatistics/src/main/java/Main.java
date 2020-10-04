
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner25 = new Scanner(System.in);

        PointsRegister register = new PointsRegister(scanner25);

        System.out.println("Enter point totals, -1 stops:");
        register.read();
        System.out.println("Point average (all): "+register.averageOfPoints());
        System.out.println("Point average (passing): "+register.averagePassingString());
        System.out.println("Pass percentage: "+register.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(register.gradeDistribution());
    }
}



