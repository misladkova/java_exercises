package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;

import java.util.*;

public class Program {

    private List<Airplane> airplanesList;
    private Map<Airplane, Airport> flightsMap;

    public Program(){
        this.airplanesList = new ArrayList<>();
        this.flightsMap = new HashMap<>();
    }

    public void addAirplane(Airplane airplane){
        airplanesList.add(airplane);
    }

    public void addFlight(String planeID, Airport port){
        for(Airplane plane: airplanesList) {
            if (plane.getAirplaneID().equals(planeID)) {
                flightsMap.putIfAbsent(plane, port);
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
        flightsMap.forEach((key, value)-> System.out.println(key+" "+value));
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
