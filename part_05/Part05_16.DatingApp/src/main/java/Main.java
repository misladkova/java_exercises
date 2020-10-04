
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(5, 10, 2000);

        date.advance(30);
        System.out.println(date);

       //SimpleDate newDate = date.afterNumberOfDays(10);
        // System.out.println(newDate);
    }
}
