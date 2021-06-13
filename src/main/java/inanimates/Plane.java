package inanimates;

public class Plane {

    private PlaneType type;

    public Plane(PlaneType type){
        this.type = type;
    }

    public PlaneType getType() {
        return this.type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }
}
