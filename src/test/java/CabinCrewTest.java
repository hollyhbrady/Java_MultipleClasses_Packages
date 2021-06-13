import jdk.nashorn.internal.ir.FunctionNode;
import org.junit.Before;
import org.junit.Test;
import people.staff.CabinCrew;
import people.staff.Rank;
import people.staff.Staff;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;
    Staff staff;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Izzy", Rank.ATTENDANT);
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Izzy", cabinCrew.getName());
    }
    
    @Test
    public void cabinCrewHasRank(){
        assertEquals(Rank.ATTENDANT, cabinCrew.getRank());
    }
}
