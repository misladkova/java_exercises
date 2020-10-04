public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentage){
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return ((maximumHeartRate - restingHeartRate) * (percentage) + restingHeartRate);
    }

}
