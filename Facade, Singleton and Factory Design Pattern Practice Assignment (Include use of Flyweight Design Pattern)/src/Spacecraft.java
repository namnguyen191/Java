//Creating the Spacecraft class
public class Spacecraft{

    //Coordinate is a unique property of the spacecraft
    private String coordinate;
    //craftID is a unique property of the spacecraft
    private int craftID;
    //ICraftModel will be use to refer to the flyweight
    private ICraftModel model;

    //Creating the constructor
    public Spacecraft(String coordinate, int craftID, ICraftModel model){
        this.coordinate = coordinate;
        this.craftID = craftID;
        this.model = model;
    }

    //Creating getters for the property
    public String getCoordinate() {
        return this.coordinate;
    }

    public int getCraftID() {
        return this.craftID;
    }

    public ICraftModel getModel() {
        return this.model;
    }
}
