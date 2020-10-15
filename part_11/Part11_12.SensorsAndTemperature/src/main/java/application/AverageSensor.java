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
        if (allSensors.isEmpty()||isOn()==false){
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor s: allSensors){
            sum+=s.read();
        }
        return sum/ allSensors.size();

    }
}
