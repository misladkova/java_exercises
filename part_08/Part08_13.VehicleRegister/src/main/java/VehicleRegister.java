import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<LicensePlate, String> register;

    public VehicleRegister() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!register.containsKey(licensePlate)) {
            this.register.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (register.containsKey(licensePlate)) {
            return register.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (register.containsKey(licensePlate)) {
            this.register.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : register.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();
        for (String value : register.values()) {
            if (!alreadyPrinted.contains(value)) {
                alreadyPrinted.add(value);
                System.out.println(value);
            }
        }
    }
}



