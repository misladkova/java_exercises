package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.logic.Program;

import java.util.Scanner;

public class UI {

    private Scanner scan;

    public UI(Scanner scanner){
        this.scan = scanner;
    }

    Program program = new Program();

    public void airportControl(Scanner scanner){
        while(true){
            System.out.print("Choose an action:\n" +
                    "[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control\n<");
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
                System.out.println("Give the departure airport id: ");
                String dep = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String tar = scanner.nextLine();
                program.addFlight(new Airplane(id, 0), new Airport(dep, tar));
            }
        }
    }

    public void flightControl(Scanner scanner){
        while(true){
            System.out.print("Choose an action:\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n" +
                    ">");
            String action = scanner.nextLine();
            if (action.equals("x")){
                break;
            }
            if (action.equals("1")){

            }
            if(action.equals("2")){

            }
            if (action.equals("3")){

            }
        }
    }




}
