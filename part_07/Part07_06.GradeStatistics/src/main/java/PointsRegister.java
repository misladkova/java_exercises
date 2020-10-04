import java.util.ArrayList;
import java.util.Scanner;

public class PointsRegister {

    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> gradesList;
    private Scanner scan;

    public PointsRegister(Scanner sc) {
        this.pointsList = new ArrayList<>();
        this.gradesList = new ArrayList<>();
        this.scan = sc;
    }

    public void read(){
        while(true){
            String inputAsString = scan.nextLine();
            int input = Integer.parseInt(inputAsString);
            if (input==-1){
                break;
            }
            if (input>=0 && input<=100){
                this.addPoints(input);
                this.addGrades(input);
            }
        }
    }

    public void addPoints(int points) {
        this.pointsList.add(points);
    }

    public double averageOfPoints() {
        int sum = 0;
        for (Integer integer : pointsList) {
            sum += integer;
        }
        return sum / (pointsList.size() * 1.0);
    }

    public double averageOfPointsPassing() {
        int sum = 0;
        int passed = 0;
        for (Integer integer : pointsList) {
            if (integer >= 50) {
                sum += integer;
                passed++;
            }
        }
        if (passed==0){
            return 0.0;
        }
        return sum / (passed * 1.0);
    }

    public String averagePassingString(){
        double x = averageOfPointsPassing();
        String y = String.valueOf(x);
        if (x==0.0){
            return "-";
        }else{
            return y;
        }
    }

    public double passPercentage() {
        int passed = 0;
        for (Integer integer : pointsList) {
            if (integer >= 50) {
                passed++;
            }
        }
        return 100 * passed / (pointsList.size() * 1.0);
    }

    public void addGrades(int points) {
        this.gradesList.add(gradesDependingOnPoints(points));
    }

    public int howManyGrades(int grade) {
        int howMany = 0;
        for (Integer grades: gradesList){
            if (grades==grade){
                howMany++;
            }
        }
        return howMany;
    }

    public String gradeDistribution(){
        String out = "";
        int grade = 5;
        while(grade>=0){
            int count = howManyGrades(grade);
            out += grade+": ";
            String s = printStar(count);
            out+=s;
            out+="\n";
            grade--;
        }
        return out;
    }

    public String printStar(int count){
        String output = "";
        while(count>0){
            output+="*";
            count--;
        }
        return output;
    }

    public static int gradesDependingOnPoints(int points) {
        int grade = 0;
        if (points<50){
            grade=0;
        }else if (points< 60) {
            grade = 1;
        }else if (points < 70) {
            grade = 2;
        }else if (points < 80) {
            grade = 3;
        }else if (points < 90) {
            grade = 4;
        }else {
            grade = 5;
        }
        return grade;
    }
}
