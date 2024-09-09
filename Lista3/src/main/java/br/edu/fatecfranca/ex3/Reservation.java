package br.edu.fatecfranca.ex3;

public class Reservation {
    private int id, date;
    private Passenger passenger;
    private Flight flight;

    public Reservation(){
        this.id = 0;
    }

    public Reservation(int id, int date, Passenger passenger, Flight flight) {
        this.id = id;
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                ", flight=" + flight.getId() +
                '}';
    }
}
