public class OneWheeler extends Vehicle {
    int NoOfWheels = wheel;
    int NoOfOneWheeler;
    String OnewheelerNames;

    OneWheeler(int wheel) {
        this.NoOfWheels = wheel;
    }

    public void oneFeatures(int wheel) {
        System.out.println("Wheels" + wheel);
    }

    // OneWheeler(boolean Automatic2, boolean Manual2, boolean Steering2, int
    // Seaters2) {
    // this.Automatic = Automatic2;
    // this.Manual = Manual2;
    // this.Steering = Steering2;
    // this.seaters = Seaters2;
    // }

    public void OnewWheelerFeatures(int wheel, boolean Automatic) {
        System.out.println("No.of Wheels" + NoOfWheels);
        System.out.println(Automatic);
    }

}

class CircusCycle extends OneWheeler {

    // CircusCycle(boolean powerSteering, boolean Manual, boolean Steering, int
    // Seaters) {
    // super(powerSteering, Manual, Steering, Seaters);
    // }
    boolean Automatic = true;
    boolean Manual;
    boolean Steering;
    int seaters = 3;

    public void oneFeatures(int seaters, boolean Manual) {
        System.out.println(Manual);
    }

    // public void OneWheeler(int wheel, boolean Automatic, boolean Manual, boolean
    // Steering, int seaters) {
    // System.out.print("HEllo");
    // }
    // int NoOfWheels = wheel;
    // CircusCycle c = new CircusCycle(Automatic, Manual, Steering, seaters);
}