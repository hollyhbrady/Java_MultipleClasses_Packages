import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;
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
    public void passengerCanSetNoOfBags(){
        passenger.setNoOfBags(1);
        assertEquals(1, passenger.getNoOfBags());
    }

    @Test
    public void passengerHasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
