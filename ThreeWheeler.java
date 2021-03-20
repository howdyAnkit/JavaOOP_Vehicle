public class ThreeWheeler extends Vehicle {
    int NoOfWheels = wheel;
    int NoOfOneWheeler;

    ThreeWheeler() {
        System.out.println(" TwoWheeler ");
    }

    public void TwoWheelerFeatures() {
        int wheel = 2;
    }
}

class Cycle extends ThreeWheeler {
    boolean Automatic = false;
    boolean Manual = true;
    int Seaters = 2;
    Boolean Helmet = false;

    Cycle() {
        System.out.print(" -> Cycle");
    }

    public void TwoWheelerFeatures() {
        int seaters = 2;
        System.out.println("Seaters :" + seaters);
        System.out.println("Wheel :" + wheel);
        System.out.println("Helmet Free :" + (Helmet ? "Inclusive" : "Not Inclusive"));
    }
}