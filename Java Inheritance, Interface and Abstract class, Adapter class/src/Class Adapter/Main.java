package C;

public class Main {
    public static void main(String[] args) {
        ShooterClassAdapter shoot1 = new ShooterClassAdapter();
        System.out.println("Spawning shooter 1");
        ShooterObjectAdapter shoot2 = new ShooterObjectAdapter();
        System.out.println("Spawning shooter 2");
        System.out.println("Shooter 1 health is: " + shoot1.getHealth());
        System.out.println("Shooter 2 health is: " + shoot2.getHealth());

        for (int i = 0; i<10; i++){
            shoot1.decHealth();
            System.out.println("Shooter 1 is hit with a lazer gun. Health decrease by 1. Current health: " + shoot1.getHealth());
        }

        for (int i = 0; i<10; i++){
            shoot2.decHealth();
            System.out.println("Shooter 2 is hit with a lazer gun. Health decrease by 1. Current health: " + shoot2.getHealth());
        }
    }
}
