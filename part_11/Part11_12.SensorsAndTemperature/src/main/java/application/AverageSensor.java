package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private List<Sensor> allSensors;

    public AverageSensor(){
        this.allSensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        allSensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return 0;
    }
}
