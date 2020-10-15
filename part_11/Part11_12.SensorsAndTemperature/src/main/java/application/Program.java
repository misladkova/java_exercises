package application;

public class Program {

    public static void main(String[] args) {


        TemperatureSensor ts = new TemperatureSensor();

        System.out.println(ts.isOn());
        //System.out.println(ts.read());
        ts.setOn();
        System.out.println(ts.read());
        ts.setOff();
        System.out.println(ts.isOn());
        ts.setOn();
        System.out.println(ts.read());
        
    }

}
