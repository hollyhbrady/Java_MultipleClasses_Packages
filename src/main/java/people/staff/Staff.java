package people.staff;

import people.Person;

public abstract class Staff extends Person {

    private Rank rank;

    public Staff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
