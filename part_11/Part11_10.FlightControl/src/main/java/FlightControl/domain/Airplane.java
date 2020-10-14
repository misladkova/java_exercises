package FlightControl.domain;

public class Airplane {

    private String airplaneID;
    private int capacity;

    public Airplane(String ID, int capacity){
        this.airplaneID = ID;
        this.capacity = capacity;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString(){
        return getAirplaneID()+" ("+getCapacity()+")";
    }
}
