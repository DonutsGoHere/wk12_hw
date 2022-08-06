import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> bookedPassengers;
    private PlaneType planeType;


    public Flight() {
        this.cabinCrews = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
    }


}
