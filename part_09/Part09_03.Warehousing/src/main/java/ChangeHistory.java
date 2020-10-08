import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList();
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public String toString(){
        return history.toString();
    }

    public double maxValue(){
        if (!(history.isEmpty())){
            double maxValue = this.history.get(0);
            for (Double aDouble : history) {
                if (aDouble > maxValue) {
                    maxValue = aDouble;
                }
            }
            return maxValue;
        }
        return 0.0;
    }

    public double minValue(){
        if (!(history.isEmpty())){
            double minValue = this.history.get(0);
            for (Double aDouble : history) {
                if (aDouble < minValue) {
                    minValue = aDouble;
                }
            }
            return minValue;
        }
        return 0.0;
    }

    public double average(){
        if (!(history.isEmpty())){
            double sum = 0.0;
            int count = 0;
            for (Double aDouble : history) {
                sum+=aDouble;
                count++;
            }
            return sum/count;
        }
        return 0.0;
    }

}







