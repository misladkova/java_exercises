package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean boo;

    public TemperatureSensor() {
        this.boo = false;
    }

    @Override
    public boolean isOn() {
        return boo;
    }

    @Override
    public void setOn() {
        boo = true;
    }

    @Override
    public void setOff() {
        boo = false;
    }

    @Override
    public int read() {
        if (boo == false) {
            throw new IllegalStateException();
        }
        return (new Random().nextInt(61)) - 30;
    }
}
