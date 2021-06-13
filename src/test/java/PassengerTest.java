import org.junit.Before;
import org.junit.Test;
import people.Passenger.Passenger;
import people.Person;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Person person;
    Passenger passenger;

    @Before
    public void before(){
    passenger = new Passenger("Dave", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Dave", passenger.getName());
    }

    @Test
    public void passengerHasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
