package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void addFlight(Airplane plane, Airport port){
        flightsMap.put(plane, port);
    }

    public void printAirplanes(){
        for(Airplane plane: airplanesList){
            System.out.println(plane);
        }
    }

    public void printFlights(){

    }

    public void printSpecificAirplane(){
        for(Airplane plane: airplanesList){
            if (plane.getAirplaneID().equals("input")){
                System.out.println(plane);
            }
        }
    }

}
