package FlightControl.domain;

public class Flight {

    private Airplane plane;
    private Airport port;

    public Flight(Airplane plane, Airport port){
        this.plane = plane;
        this.port = port;
    }

    public String toString(){
        return plane.toString()+" "+port.toString();
    }
}
