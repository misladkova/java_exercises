
public class MainProgram {

    public static void main(String[] args) {

        Money money = new Money(10,60);

        System.out.println(money);


        Money decreaser = new Money(2, 90);

        Money addition = new Money(12, 50);

        Money lessMoney = money.minus(decreaser);

        Money newMoney = money.plus(addition);

        //System.out.println(money);
        System.out.println(newMoney);

        System.out.println(lessMoney);

        //System.out.println(money.lessThan(addition));
        //System.out.println(newMoney.lessThan(addition));


    }
}
