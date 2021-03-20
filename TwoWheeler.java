import java.util.Scanner;
import java.util.concurrent.locks.Condition;

// import jdk.internal.module.IllegalAccessLogger.Mode;

// import jdk.internal.module.IllegalAccessLogger.Mode;

// import jdk.internal.module.IllegalAccessLogger.Mode;
// import jdk.jshell.Wrap.Range;

class TwoWheeler extends Vehicle {
    int NoOfWheels;
    int NoOfOneWheeler;

    TwoWheeler() {
        System.out.print(" TwoWheeler ");
    }

    public void TwoWheelerFeatures() {
        NoOfWheels = 2;
    }
}

class Cycle extends TwoWheeler {
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
        System.out.println("Wheel :" + NoOfWheels);
        System.out.println("Helmet Free :" + (Helmet ? "Inclusive" : "Not Inclusive"));
    }
}

class Bike extends TwoWheeler {
    boolean Automatic = true;
    boolean Manual = true;
    int Seaters = 2;
    Boolean Helmet = true;

    String Condition;

    Bike() {
        System.out.print(" -> Bike");
    }

    public void TwoWheelerFeatures() {
        int seaters = 2;
        System.out.println("Seaters " + seaters);
        System.out.println("Wheel " + NoOfWheels);
        System.out.println("Helmet Free :" + (Helmet ? "Inclusive" : "Not Inclusive"));
    }
}

class RoyalEnfield extends Bike {
    int classicStock = 52;
    int HimalayaStock = 90;
    int GTStock = 5;
    int ThunderBirdStock = 30;
    String ReusableString = " Range :";
    String ReusableLocation = " Imported :";
    String ReusabelStockString = " Stock :";

    RoyalEnfield() {
        System.out.println(" -> RoyalEnfield");
    }

    static String PapaParser = "RoyalEnfield";
    String Colour[] = { " Red ", " Black ", " Army " };
    String Models[] = { "1. Classic ", "2. ThunderBird ", "3. Himalaya ", "4. GT-650 " };

    void ReFeatures() {
        Boolean SmartNav = false;
        System.out.print("Colors -> ");
        for (int i = 0; i <= Colour.length - 1; i++) {
            System.out.print(Colour[i]);
        }
        System.out.println("");
        System.out.print("Models -> ");
        for (int i = 0; i <= Models.length - 1; i++) {
            System.out.print(Models[i]);
        }
        System.out.println("");
        System.out.println("please select Option to check Avaibality");
        Scanner sc = new Scanner(System.in);
        int bikeOpn = sc.nextInt();
        switch (bikeOpn) {

        case 1:
            RoyalEnfield cr = new classic();
            classic cl = (classic) cr;
            System.out.println(cl.getStock());
            System.out.println(ReusableString + cl.Range);
            System.out.println(ReusableLocation + cl.DeportedDetails);
            // System.out.println(ReusabelStockString + c1.getStock())
            break;
        case 2:
            RoyalEnfield cr2 = new ThunderBird();
            ThunderBird TB = (ThunderBird) cr2;
            System.out.println(TB.getStock());
            System.out.println(ReusableString + TB.Range);
            System.out.println(ReusableLocation + TB.DeportedDetails);
            break;

        }

    }

}

class classic extends RoyalEnfield {

    String BrandName = PapaParser;
    String ModelName = "Classic";
    String DeportedDetails = " Iraq ";
    int Range = 500;
    private String CustomRequest;

    classic() {
        System.out.print(" -> Classic");
    }

    void ReFeatures() {
        System.out.println("Range :" + Range);
    }

    public int getStock() {
        return this.classicStock;
    }

    public String getCustomRequest() {
        return CustomRequest;
    }

    public void setCustomRequest(String Request) {
        this.CustomRequest = Request;
    }
}

class ThunderBird extends RoyalEnfield {
    int Range = 700;
    private String CustomRequest;
    String DeportedDetails = " Iraq ";

    void ReFeatures() {
        System.out.println("Range :" + Range);
    }

    public int getStock() {
        return this.ThunderBirdStock;
    }

    public String getCustomRequest() {
        return CustomRequest;
    }

    public void setCustomRequest(String Request) {
        this.CustomRequest = Request;
    }
}

class Himalaya extends RoyalEnfield {
    int Range = 800;

    private String CustomRequest;

    void ReFeatures() {
        System.out.println("Range :" + Range);
    }

    public int getStock() {
        return this.HimalayaStock;
    }

    public String getCustomRequest() {
        return CustomRequest;
    }

    public void setCustomRequest(String Request) {
        this.CustomRequest = Request;
    }
}

class GT extends RoyalEnfield {
    int Range = 5200;
    private String CustomRequest;

    void ReFeatures() {
        System.out.println("Range :" + Range);
    }

    public int getStock() {
        return this.HimalayaStock;
    }

    public String getCustomRequest() {
        return CustomRequest;
    }

    public void setCustomRequest(String Request) {
        this.CustomRequest = Request;
    }
}
