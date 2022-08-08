import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Pilot Reynholm;
    CabinCrew Moss;
    CabinCrew Jen;
    CabinCrew Roy;

    PlaneType planeType;


    @Before
    public void before() {
        flight = new Flight(
                "ITCRWD",
                "JFK",
                "LHR",
                "2000hrs");

    }

    @Test
    public void hasGotCabinCrews() {
        flight.addCrewMember(Moss);
        flight.addCrewMember(Jen);
        flight.addCrewMember(Roy);
        assertEquals(3,flight.getCabinCrew());
    }

    @Test
    public void hasGotPilot() {
        flight.addPilot(Reynholm);
        assertEquals(1, flight.getPilots());
    }

    @Test
    public void hasEmptyListOfPassengers() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void hasGotPlane() {
        assertTrue(flight.isPlanePresent(PlaneType.B25J));
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(100, flight.getPlaneCapacity());
    }
}
