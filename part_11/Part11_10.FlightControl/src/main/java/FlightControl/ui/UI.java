package FlightControl.ui;

import java.util.Scanner;

public class UI {

    private Scanner scan;

    public UI(Scanner scanner){
        this.scan = scanner;
    }

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

            }
            if(action.equals("2")){

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
