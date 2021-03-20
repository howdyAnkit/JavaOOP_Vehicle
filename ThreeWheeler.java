public class ThreeWheeler extends Vehicle {
    int NoOfWheels;
    int NoOfOneWheeler;

    ThreeWheeler() {
        System.out.print(" ThreeWheeler ");
    }

    public void ThreeWheeler() {
        NoOfWheels = 2;
    }
}

class Auto extends ThreeWheeler {
    boolean Automatic = true;
    boolean Manual = true;
    int Seaters = 4;

    Auto() {
        System.out.print(" -> Auto ");
        System.out.println("");
    }

    public void ThreeWheeler() {
        int seaters = 4;
        System.out.println("Seaters :" + seaters);
        System.out.println("Wheel :" + NoOfWheels);
    }
}