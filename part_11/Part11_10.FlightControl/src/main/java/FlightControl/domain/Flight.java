package FlightControl.domain;

public class Flight {

    private Airplane airplaneID;
    private String departureID;
    private String targetID;

    public Flight(Airplane airplane, String departure, String target){
        this.airplaneID = airplane;
        this.departureID = departure;
        this.targetID = target;
    }

    public Airplane getAirplaneID() {
        return airplaneID;
    }

    public String getDepartureID() {
        return departureID;
    }

    public String getTargetID() {
        return targetID;
    }
}
