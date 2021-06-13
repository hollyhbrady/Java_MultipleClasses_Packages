package people.staff;

public class CabinCrew extends Staff{

    public CabinCrew(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage(String message){
        return "Ready yourself for " + message;
    }
}
