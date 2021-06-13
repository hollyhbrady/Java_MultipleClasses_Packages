import inanimates.Flight;
import inanimates.Plane;
import inanimates.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Pilot pilot;
    Plane plane;
    Passenger Nezuko;
    Passenger Tanjiro;
    Passenger Zenitsu;
    Passenger Inosuke;
    Passenger Tomioka;
    Passenger Urokodaki;
    CabinCrew attendant1;
    CabinCrew attendant2;
    CabinCrew firstOfficer;
    Flight flight;

    @Before
    public void before(){
        pilot = new Pilot("Sebby", Rank.CAPTAIN, "GH1234");
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(pilot, plane, "FG123", "AKL", "EDI", "20:00");
        attendant1 = new CabinCrew("Izzy", Rank.ATTENDANT);
        attendant2 = new CabinCrew("Samuel", Rank.ATTENDANT);
        firstOfficer = new CabinCrew("Holly", Rank.FIRSTOFFICER);
        Nezuko = new Passenger("Nezuko", 0);
        Tanjiro = new Passenger("Tanjiro", 2);
        Zenitsu = new Passenger("Zenitsu", 1);
        Inosuke = new Passenger("Inosuke", 1);
        Tomioka = new Passenger("Tomioka", 1);
        Urokodaki = new Passenger("Urokodaki", 1);
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Sebby", flight.getPilotName());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING737, flight.getPlaneType());
    }

    @Test
    public void flightHasFlightNo(){
        assertEquals("FG123", flight.getFlightNo());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("AKL", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("20:00", flight.getDepartureTime());
    }

    @Test
    public void flightPassengerListStartsEmpty(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(Nezuko);
        flight.addPassenger(Tanjiro);
        assertEquals(2, flight.countPassengers());
    }

    @Test
    public void flightCantAddPassengers(){
        flight.addPassenger(Nezuko);
        flight.addPassenger(Tanjiro);
        flight.addPassenger(Zenitsu);
        flight.addPassenger(Inosuke);
        flight.addPassenger(Tomioka);
        flight.addPassenger(Urokodaki);
        assertEquals(5, flight.countPassengers());
    }

    @Test
    public void flightHasCrewList(){
        flight.addCrew(pilot);
        flight.addCrew(attendant1);
        flight.addCrew(attendant2);
        flight.addCrew(firstOfficer);
        assertEquals(4, flight.countCrew());
    }

    @Test
    public void canReturnAvailableSeats(){
        flight.addPassenger(Nezuko);
        flight.addPassenger(Tanjiro);
        assertEquals(3, flight.returnAvailableSeats());
    }

}
