
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(){
        advance(1);
    }

    public void advance(int howManyDays){
        int newDay = this.day+howManyDays;
        int newMonth = (newDay-1)/30;
        if (newDay%30!=0){
            this.day = newDay % 30;
        }else{
            this.day=30;
        }
        this.month = this.month+newMonth;

        if(this.month>12) {
            int newYear=(this.month-1)/12;
            if (this.month%12==0){
                this.month=12;
            }else {
                this.month = this.month % 12;
            }
            this.year = this.year + newYear;
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }


    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
