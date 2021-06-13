import inanimates.Flight;
import inanimates.Plane;
import inanimates.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;
import people.staff.FlightManager;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    FlightManager flightManager;
    Passenger Nezuko;
    Passenger Tanjiro;

    @Before
    public void before(){
        pilot = new Pilot("Sebby", Rank.CAPTAIN, "GH1234");
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(pilot, plane, "FG123", "AKL", "EDI", "20:00");
        Nezuko = new Passenger("Nezuko", 0);
        Tanjiro = new Passenger("Tanjiro", 2);
    }

    @Test
    public void canCalculateBaggageWeight(){
        assertEquals(11, flightManager.calculateBaggageWeight());
    }

    @Test
    public void canCalculateBaggageWeightBooked(){
        flight.addPassenger(Nezuko);
        flight.addPassenger(Tanjiro);
        assertEquals(22, flightManager.calculateBaggageWeightBooked());
    }
}
