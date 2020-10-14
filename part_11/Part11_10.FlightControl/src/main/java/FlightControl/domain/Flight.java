package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private String departureID;
    private String targetID;

    public Flight(Airplane airplane, String departure, String target){
        this.airplane = airplane;
        this.departureID = departure;
        this.targetID = target;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDepartureID() {
        return departureID;
    }

    public String getTargetID() {
        return targetID;
    }

    public String toString(){
        return airplane.toString()+" ("+this.departureID+"-"+this.targetID+")";
    }
}
