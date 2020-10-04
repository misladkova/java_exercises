
public class MainProgram {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Counter counter1 = new Counter(5);

        counter.decrease(2);
        counter.decrease();
        counter.decrease(-8);

        System.out.println(counter.value());

        counter1.increase(3);
        counter1.increase();
        counter1.increase(-9);

        System.out.println(counter1.value());

    }
}
