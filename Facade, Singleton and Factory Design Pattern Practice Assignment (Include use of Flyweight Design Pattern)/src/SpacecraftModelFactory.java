import java.util.HashMap;
//Creating the factory
public class SpacecraftModelFactory {
    //Creating a Hashmap to store the flyweight
    private HashMap lstModel;

    //Making the factory a singleton
    private static SpacecraftModelFactory factory = new SpacecraftModelFactory();
    private SpacecraftModelFactory(){
        lstModel = new HashMap();
    }
    public static SpacecraftModelFactory getInstance(){
        return factory;
    }

    //Creating a method to retrieved the flyweight base on the modelName, this method return an Object of Type SpacecraftModel
    public synchronized SpacecraftModel getModel(String modelName){
        if(lstModel.get(modelName)==null){
            SpacecraftModel model = new SpacecraftModel(modelName);
            lstModel.put(modelName, model);
            return model;
        } else {
            return (SpacecraftModel)lstModel.get(modelName);
        }
    }

    //Creating the private class in order to create the flyweight. This private class will implement ICraftModel in order for Spacecraft Object to refer to it
    private class SpacecraftModel implements ICraftModel{
        private String modelMesh;
        private String modelTexture;
        private int maxSpeed;
        private float acceleration;
        private float damage;

        //Creating the constructor that use the modelName to initialize the property of the flyweight
        private SpacecraftModel(String modelName){
            if (modelName.equalsIgnoreCase("NukeMayhemModel")){
                setValues("Nuke Mayhem Mesh", "Nuke Mayhem Texture", 3000, 200, 1000);
            } else if (modelName.equalsIgnoreCase("CoreDrillerModel")){
                setValues("Core Driller Mesh", "Core Driller Texture", 500, 10, 5000);
            } else if (modelName.equalsIgnoreCase("SwiftMapleModel")){
                setValues("Swift Maple Mesh", "Swift Maple Texture", 18000, 2500, 50);
            }
        }

        //Creating the setValues method to easily set the property of the flyweight, reduce code size
        private void setValues(String modelMesh, String modelTexture, int maxSpeed, float acceleration, float damage){
            this.modelMesh = modelMesh;
            this.modelTexture = modelTexture;
            this.maxSpeed = maxSpeed;
            this.acceleration = acceleration;
            this.damage = damage;
        }

        //Implementing the required method for the ICraftModel interface, these methods are getters for the class properties
        public String getMesh() {
            return modelMesh;
        }

        public String getTexture() {
            return modelTexture;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public float getAcceleration() {
            return acceleration;
        }

        public float getDamage() {
            return damage;
        }

        //Creating a toString method to print out the flyweight information more easily
        public String toString(){
            return "Model Mesh: " + this.modelMesh +
                    "\nModel Texture: " + this.modelTexture +
                    "\nMax Speed: " + this.maxSpeed +
                    "\nAcceleration: " + this.acceleration +
                    "\nDamage: " + this.damage;
        }
    }
}
