package br.edu.fatecfranca;

import br.edu.fatecfranca.ex3.Reservation;
import br.edu.fatecfranca.ex3.Passenger;
import br.edu.fatecfranca.ex3.Flight;

public class MainFlight {
    public static void main(String[] args) {
        Flight flight1 = new Flight(1, "Brasil", "Canada");
        Flight flight2 = new Flight(2, "Brazil", "China");

        Passenger passenger1 = new Passenger(1, "Murilo", "123456-789");
        Reservation reservation1 = new Reservation(1, 01022025, passenger1, flight1);

        Passenger passenger2 = new Passenger(2, "Caio", "987654-321");
        Reservation reservation2 = new Reservation(2, 01032025, passenger2, flight2);
        flight1.addReservation(reservation1);
        flight2.addReservation(reservation2);

        System.out.println(reservation1.toString());
        System.out.println(flight1.toString());

        System.out.println(reservation2.toString());
        System.out.println(flight2.toString());
    }
}
