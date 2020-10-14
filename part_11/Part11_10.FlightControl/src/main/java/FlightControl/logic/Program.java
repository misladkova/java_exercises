package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.domain.Flight;

import java.util.*;

public class Program {

    private List<Airplane> airplanesList;
    private List<Flight> flightsList;

    public Program(){
        this.airplanesList = new ArrayList<>();
        this.flightsList = new ArrayList<>();
    }

    public void addAirplane(Airplane airplane){
        airplanesList.add(airplane);
    }

    public void addFlight(String planeID, Airport port){
        for(Airplane plane: airplanesList) {
            if (plane.getAirplaneID().equals(planeID)) {
                Flight f = new Flight(plane, port);
                flightsList.add(f);
            }
        }
    }

    public void printAirplanes(){
        for(Airplane plane: airplanesList){
            System.out.println(plane);
        }
        System.out.println();
    }

    public void printFlights(){
        flightsList.forEach(flight-> System.out.println(flight.toString()));
        System.out.println();
    }

    public void printSpecificAirplane(String id){
        for(Airplane plane: airplanesList){
            if (plane.getAirplaneID().equals(id)){
                System.out.println(plane);
            }
        }
        System.out.println();
    }

}
