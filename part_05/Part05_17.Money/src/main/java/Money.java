
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+ addition.euros, this.cents+ addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros< compared.euros){
            return true;
        }
        if (this.euros== compared.euros && this.cents< compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        Money lessMoney = new Money(this.euros- decreaser.euros, this.cents- decreaser.cents);
        if (this.euros< decreaser.euros || (this.euros== decreaser.euros && this.cents< decreaser.cents)){
            lessMoney = new Money(0, 0);
            return lessMoney;
        }
        if (this.cents< decreaser.cents){
            lessMoney = new Money(this.euros-decreaser.euros-1, 100-(decreaser.cents-this.cents));
            return lessMoney;
        }
        return lessMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
