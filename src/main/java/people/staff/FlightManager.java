package people.staff;

import inanimates.Flight;
import inanimates.Plane;
import people.passenger.Passenger;

public class FlightManager extends Staff {

    Plane plane;
    FlightManager flightManager;
    Flight flight;
    Passenger passenger;

    public FlightManager(String name, Rank rank) {
        super(name, rank);
    }

    public int calculateBaggageWeight(){
        return (plane.getTotalWeightFromEnum() / 2) / plane.getCapacityFromEnum();
    }

    public int calculateBaggageWeightBooked(){
        for (passenger in; flight.getPassengerList()) {

        }
    }

}
