import org.junit.Before;
import org.junit.Test;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("James", Rank.CAPTAIN, "SV12345");
    }

    @Test
    public void pilotHasName(){
        assertEquals("James", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNo(){
        assertEquals("SV12345", pilot.getLicenseNo());
    }
}
