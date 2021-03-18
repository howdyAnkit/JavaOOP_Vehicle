import java.util.Scanner;
import java.util.concurrent.locks.Condition;

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your VehicleNumber");
        int wheel = sc.nextInt();
        switch (wheel) {
        case 1:
            Vehicle v = new OneWheeler(1);
            OneWheeler w = (OneWheeler) v;
            System.out.println(w.NoOfWheels);
            w.OnewWheelerFeatures(1, false);
            System.out.println("Would you like to see Features?");
            int checkCondition = sc.nextInt();
            switch (checkCondition) {
            case 1:
                OneWheeler a = new OneWheeler(1);
                a.oneFeatures(1);
                break;
            case 2:
                CircusCycle b = new CircusCycle();
                b.oneFeatures(1, true);
                break;
            }
        case 2:
            Vehicle v2 = new TwoWheeler(2);
            TwoWheeler w2 = (TwoWheeler) v2;
            System.out.println(w2.NoOfWheels);
            break;
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