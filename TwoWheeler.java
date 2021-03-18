public class TwoWheeler extends Vehicle {
    int NoOfWheels = wheel;
    int NoOfOneWheeler;
    // public int ListOfOneWheeler() {
    // return NoOfOneWheeler;
    // }

    TwoWheeler(int wheel) {
        this.NoOfWheels = wheel;
    }

    public static String Actions() {
        String Drift = "false";
        return Drift;
    }
}

public class Cycle extends TwoWheeler {

}

public class Bike extends TwoWheeler {

}
