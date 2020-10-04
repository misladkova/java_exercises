
public class PaymentTerminal {


    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money=1000.00;
        this.affordableMeals=0;
        this.heartyMeals=0;
    }

    public double eatAffordably(double payment) {
        if (payment<2.50){
            return payment;
        }else {
            this.money = this.money + 2.50;
            this.affordableMeals = this.affordableMeals+1;
            return payment - 2.50;
        }
    }

    public boolean eatAffordably(PaymentCard card){
        if (card.takeMoney(2.50)) {
            this.affordableMeals = this.affordableMeals + 1;
            return true;
        }else{
            return false;
        }
    }

    public double eatHeartily(double payment) {
        if (payment<4.30){
            return payment;
        }else {
            this.money = this.money + 4.30;
            this.heartyMeals = this.heartyMeals + 1;
            return payment - 4.30;
        }
    }

    public boolean eatHeartily(PaymentCard card){
        if (card.takeMoney(4.30)) {
            this.heartyMeals = this.heartyMeals + 1;
            return true;
        }else{
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum>0) {
            this.money = this.money + sum;
        }
        card.addMoney(sum);
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
