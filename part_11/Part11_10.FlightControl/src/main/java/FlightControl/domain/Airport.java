package FlightControl.domain;

public class Airport {

    private String departure;
    private String arrival;

    public Airport(String depart, String arrive){
        this.departure = depart;
        this.arrival = arrive;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival(){
        return arrival;
    }

    public String toString(){
        return "("+getDeparture()+"-"+getArrival()+")";
    }
}
