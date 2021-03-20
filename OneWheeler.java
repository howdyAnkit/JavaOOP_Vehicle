class OneWheeler extends Vehicle {
    int NoOfWheels;
    int NoOfOneWheeler;
    String OnewheelerNames;

    OneWheeler() {
        System.out.println("Details oF Circus Cycle below");
    }

    OneWheeler(int wheel) {
        this.NoOfWheels = wheel;
    }

    // OneWheeler(boolean Automatic2, boolean Manual2, boolean Steering2, int
    // Seaters2) {
    // this.Automatic = Automatic2;
    // this.Manual = Manual2;
    // this.Steering = Steering2;
    // this.seaters = Seaters2;
    // }

    void OnewWheelerFeatures(int wheel, boolean Automatic) {
        System.out.println("No.of Wheels " + NoOfWheels);
        System.out.println("Automatic " + Automatic);
    }

    public void Engine() {
        boolean Petrol = false;
        boolean Diesel = false;
        boolean Electric = false;

    }
}

class CircusCycle extends OneWheeler {

    // CircusCycle(boolean powerSteering, boolean Manual, boolean Steering, int
    // Seaters) {
    // super(powerSteering, Manual, Steering, Seaters);
    // }
    // boolean Automatic = false;
    // boolean Manual;
    // boolean Steering;
    // int seaters = 3;

    boolean Automatic = false;
    boolean Manual = false;
    int Seaters = 1;

    void oneFeatures() {
        System.out.println("Manual " + this.Manual);
        System.out.println("Seaters " + this.Seaters);
        System.out.println("Automatic " + Automatic);
    }

    // public void Engine(String ){

    // }

    // public void OneWheeler(int wheel, boolean Automatic, boolean Manual, boolean
    // Steering, int seaters) {
    // System.out.print("HEllo");
    // }
    // int NoOfWheels = wheel;
    // CircusCycle c = new CircusCycle(Automatic, Manual, Steering, seaters);
}