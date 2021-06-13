package inanimates;

public enum PlaneType {

    BOEING747(5, 100),
    BOEING737(5, 110),
    CESSNA(1,20);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}
