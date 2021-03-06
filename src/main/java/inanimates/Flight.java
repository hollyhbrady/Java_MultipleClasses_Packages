package inanimates;

import people.Person;
import people.passenger.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;
import people.staff.Staff;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<Staff> cabinCrewList;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private CabinCrew cabinCrew;
    private Person staff;

    public Flight (Pilot pilot, Plane plane, String flightNo, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrewList = new ArrayList<>();
//        this.cabinCrewList = new ArrayList<CabinCrew>(Rank.CAPTAIN, Rank.FIRSTOFFICER, Rank.ATTENDANT, Rank.ATTENDANT);
        this.passengerList = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int countPassengers() {
        return this.passengerList.size();
    }

    public int countCrew() {
        return this.cabinCrewList.size();
    }

    public String getPilotName() {
        return this.pilot.getName();
    }

    public PlaneType getPlaneType() {
        return this.plane.getType();
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacityFromEnum() > this.countPassengers()) {
            this.passengerList.add(passenger);
        }
    }

    public void addCrew(Staff staff) {
        this.cabinCrewList.add(staff);
    }

    public int returnAvailableSeats() {
        return this.plane.getCapacityFromEnum() - this.countPassengers();
    }
    public ArrayList getPassengerList() {
        return this.passengerList;
    }
}
