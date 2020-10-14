package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.logic.Program;

import java.util.Scanner;

public class UI {

    private Scanner scanner;

    public UI(Scanner scanner){
        this.scanner = scanner;
    }

    Program program = new Program();

    public void airportControl(){
        while(true){
            System.out.print("Choose an action:\n" +
                    "[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control\n< ");
            String action = scanner.nextLine();
            if (action.equals("x")){
                break;
            }
            if (action.equals("1")){
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                program.addAirplane(new Airplane(id, capacity));
            }
            if(action.equals("2")){
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String dep = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String tar = scanner.nextLine();
                program.addFlight(id, new Airport(dep, tar));
            }
        }
    }

    public void flightControl(){
        while(true){
            System.out.print("Choose an action:\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n" +
                    "> ");
            String action = scanner.nextLine();
            if (action.equals("x")){
                break;
            }
            if (action.equals("1")){
                program.printAirplanes();
            }
            if(action.equals("2")){
                program.printFlights();
            }
            if (action.equals("3")){
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                program.printSpecificAirplane(id);
            }
        }
    }
}
