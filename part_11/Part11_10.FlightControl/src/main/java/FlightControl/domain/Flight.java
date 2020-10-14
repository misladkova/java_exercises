package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private Airport airport;

    public Flight(Airplane airplane, Airport airport){
        this.airplane = airplane;
        this.airport = airport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Airport getAirport() {
        return airport;
    }

    public String toString(){
        return airplane.toString()+airport.toString();
    }
}
