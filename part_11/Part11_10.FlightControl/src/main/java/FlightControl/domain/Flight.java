package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private String departure;
    private String target;

    public Flight(Airplane airplane, String departure, String target){
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDepartureID() {
        return departure;
    }

    public String getTargetID() {
        return target;
    }

    public String toString(){
        return airplane.toString()+" ("+this.departure+"-"+this.target+")";
    }
}
