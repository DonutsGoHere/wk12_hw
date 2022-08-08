import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> bookedPassengers;

    private PlaneType planeType;

    private String flightNumber;

    private String destination;

    private String departureAirport;

    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrews = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int getCabinCrew() {
        return cabinCrews.size();
    }

    public void addCrewMember(CabinCrew cabinCrew) {
        cabinCrews.add(cabinCrew);
    }

    public int getPilots() {
        return pilots.size();
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public int getPassengerCount() {
        return bookedPassengers.size();
    }

    public boolean isPlanePresent(PlaneType planeType) {
        if (planeType == planeType);
        return true;
    }

    public int getPlaneCapacity() {
        return PlaneType.B25J.getCapacity();
    }

//    public int getAvailableCapacity() {
//    }


}

