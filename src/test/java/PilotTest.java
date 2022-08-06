import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Carole", "Captain", "PHLY1");

    }

    @Test
    public void hasName() {
        assertEquals("Carole", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasLicence() {
        assertEquals("PHLY1", pilot.getLicenceNumber());
    }
}
