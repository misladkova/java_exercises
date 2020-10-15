package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> allSensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.allSensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        allSensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : allSensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : allSensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : allSensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (allSensors.isEmpty() || isOn() == false) {
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor s : allSensors) {
            sum += s.read();
        }
        readings.add(sum / allSensors.size());
        return sum / allSensors.size();
    }

    public List<Integer> readings() {
        return readings;
    }
}
