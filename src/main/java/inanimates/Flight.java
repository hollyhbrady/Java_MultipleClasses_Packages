package inanimates;

import people.passenger.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;
import people.staff.Staff;

import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> passengerList;
    Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

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

//    public ArrayList<CabinCrew> getCabinCrewList() {
//        return cabinCrewList;
//    }
//
//    public void setCabinCrewList(ArrayList<CabinCrew> cabinCrewList) {
//        this.cabinCrewList = cabinCrewList;
//    }
//
//    public ArrayList<Passenger> getPassengerList() {
//        return passengerList;
//    }
//
//    public void setPassengerList(ArrayList<Passenger> passengerList) {
//        this.passengerList = passengerList;
//    }

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

    public String getCrewType() {
        return this.pilot.getName();
    }

    public PlaneType getPlaneType() {
        return this.plane.getType();
    }
}
