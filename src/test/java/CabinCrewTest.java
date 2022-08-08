import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Dave", "3rd Class");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", cabinCrew.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("3rd Class", cabinCrew.getRank());
    }

    @Test
    public void canSpeakToPassengers() {
        assertEquals("Good afternoon, please don't panic but the engines have fallen off. That is all.", cabinCrew.speakToPassengers());
    }
}
