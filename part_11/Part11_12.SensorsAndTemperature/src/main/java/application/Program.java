package application;

public class Program {

    public static void main(String[] args) {


        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees");

        System.out.println("readings: " + helsinkiRegion.readings());
    }

}
