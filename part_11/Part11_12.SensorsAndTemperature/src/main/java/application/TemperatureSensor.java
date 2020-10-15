package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean boo;

    public TemperatureSensor(){
        this.boo = false;
    }

    @Override
    public boolean isOn() {
        return boo;
    }

    @Override
    public void setOn() {
        boo = !boo;
    }

    @Override
    public void setOff() {
        boo = !boo;
    }

    @Override
    public int read() {
        if (!isOn()){
            throw new IllegalStateException();
        }
        int temperature = (new Random().nextInt(61))-30;
        return temperature;
    }
}
