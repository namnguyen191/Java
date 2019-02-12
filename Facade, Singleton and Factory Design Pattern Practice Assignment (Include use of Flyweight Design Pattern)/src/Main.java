import java.util.ArrayList;

public class Main {
    //Creating the spacecraftsHanger which is an Array list of type Spacecraft
    static ArrayList<Spacecraft> spacecraftsHanger = new ArrayList<>();
    //Creating the factory object
    static SpacecraftModelFactory factory = SpacecraftModelFactory.getInstance();

    public static void main(String[] args) {
        //Adding spacecraft objects to the spacecraftsHanger Array list while using the factory to retrieve their flyweight
        spacecraftsHanger.add(new Spacecraft("x:13 y:67 z:31", 1, factory.getModel("NukeMayhemModel") ));
        spacecraftsHanger.add(new Spacecraft("x:56 y:42 z:54", 2, factory.getModel("NukeMayhemModel")));
        spacecraftsHanger.add(new Spacecraft("x:11 y:231 z:421", 3, factory.getModel("NukeMayhemModel")));
        spacecraftsHanger.add(new Spacecraft("x:432 y:1 z:412", 4, factory.getModel("CoreDrillerModel")));
        spacecraftsHanger.add(new Spacecraft("x:168 y:12 z:92", 5, factory.getModel("CoreDrillerModel")));
        spacecraftsHanger.add(new Spacecraft("x:62 y:82 z:11", 6, factory.getModel("CoreDrillerModel")));
        spacecraftsHanger.add(new Spacecraft("x:54 y:164 z:212", 7, factory.getModel("SwiftMapleModel")));
        spacecraftsHanger.add(new Spacecraft("x:2 y:54 z:124", 8, factory.getModel("SwiftMapleModel")));
        spacecraftsHanger.add(new Spacecraft("x:5 y:126 z:651", 9, factory.getModel("SwiftMapleModel")));
        spacecraftsHanger.add(new Spacecraft("x:12 y:75 z:125", 10, factory.getModel("SwiftMapleModel")));
        launch();
    }
    //Creating a launch method to print out all the information of every spacecrafts in the spacecraftsHanger Array list.
    static void launch(){
        for (Spacecraft sc:spacecraftsHanger) {
            System.out.println("Spacecraft ID: " + sc.getCraftID() + "\nSpacecraft Coordinate: " + sc.getCoordinate());
            System.out.println(sc.getModel()+"\n---------------------------------------------");
        }
    }
}
