import java.util.Scanner;
import java.util.concurrent.locks.Condition;

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your VehicleNumber");
        int wheel = sc.nextInt();
        int UserInputOption;
        switch (wheel) {
        case 1:
            Vehicle v = new OneWheeler(1);
            OneWheeler w = (OneWheeler) v;
            System.out.println(w.NoOfWheels);
            w.OnewWheelerFeatures(1, false);
            CircusCycle l = new CircusCycle();
            l.oneFeatures();
            break;
        case 2:
            Vehicle v2 = new TwoWheeler();
            TwoWheeler w2 = (TwoWheeler) v2;
            // System.out.println();
            System.out.println("Please select Option");
            System.out.println("1: Cycle -> ");
            System.out.println("2: Bike ->");
            UserInputOption = sc.nextInt();
            switch (UserInputOption) {
            case 1:
                Cycle refCycle = new Cycle();
                refCycle.TwoWheelerFeatures();
                break;
            case 2:
                Bike refBike = new Bike();
                refBike.TwoWheelerFeatures();
                Bike refBikes = new RoyalEnfield();
                RoyalEnfield royalEnfield = (RoyalEnfield) refBikes;
                royalEnfield.ReFeatures();
                break;
            }
            break;
        case 3:
            Vehicle v3 = new ThreeWheeler();
            ThreeWheeler w3 = (ThreeWheeler) v3;
            System.out.println("Please Select Option");
            System.out.println("1. Auto");
            UserInputOption = sc.nextInt();
            switch (UserInputOption) {
            case 1:
                Auto refAuto = new Auto();
                refAuto.ThreeWheeler();
                break;
            }
            break;
        case 4:
            Vehicle v4 = new FourWheeler();
            FourWheeler w4 = (FourWheeler) v4;
            System.out.println("Please Select Option");
            System.out.println("1. Petrol");
            UserInputOption = sc.nextInt();
            switch (UserInputOption) {
            case 1:
                Petrol refPetrol = new Petrol();
                refPetrol.Petrol4Wheelers();
                break;
            case 2:
                Diesel refDiesel = new Diesel();
                refDiesel.DieselFeatures();
                break;
            }
            // case 3:
            // this.wheel = 3;
            // break;
            // case 4:
            // this.wheel = 4;
            // break;
            // case 5:
            // this.wheel = 5;
            // break;
            // case 6:
            // this.wheel = 6;
            // break;
        default:
            break;
        }
        // if (wheel >= 1 && wheel <= 2) {

        // } else if (wheel >= 2 && wheel <= 3) {

        // }

    }
}