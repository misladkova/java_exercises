package FlightControl;


import FlightControl.ui.UI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UI ui = new UI(scan);

        System.out.println("Airport Asset Control");
        System.out.println();
        ui.airportControl();
        System.out.println();
        System.out.println("Flight Control");
        System.out.println();
        ui.flightControl();
    }
}
