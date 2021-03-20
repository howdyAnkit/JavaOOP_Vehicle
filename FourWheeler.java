import java.util.Scanner;

public class FourWheeler extends Vehicle {
    int NoOfWheels;
    int NoOfOneWheeler;

    FourWheeler() {
        System.out.print(" FourWheeler ");
    }

    public void TwoWheelerFeatures() {
        NoOfWheels = 2;
    }
}

class Petrol extends FourWheeler {
    boolean Petrol = true;
    int PetrolPrice = 92;

    int SwiftStock = 52;
    int MarutiStock = 90;
    int InnovaStock = 5;
    int FortunerStock = 30;
    int TataNexonStock = 3;
    int TataHarrierStock = 50;

    String ReusableString = " Range :";
    String ReusableLocation = " Imported :";
    String ReusabelStockString = " Stock :";

    Petrol() {
        System.out.print(" -> Petrol");
    }

    public void PetrolFeatures() {
        System.out.println("Petrol car");
    }

    String petrolCars[] = { "Swift", "Maruti800" };

    void Petrol4Wheelers() {
        Boolean SmartNav = false;
        System.out.print("Petrol Cars List");
        for (int i = 0; i <= petrolCars.length - 1; i++) {
            System.out.println(petrolCars[i]);
        }
        System.out.println("please select Option to check Avaibality");
        Scanner sc = new Scanner(System.in);
        int PetrolCarOpn = sc.nextInt();
        switch (PetrolCarOpn) {
        case 1:
            Petrol pr = new Swift();
            Swift sft = (Swift) pr;
            System.out.println(sft.getStock());
            System.out.println(ReusableString + sft.Range);
            System.out.println(ReusableLocation + sft.DeportedDetails);
            System.out.println("Stock Details :" + sft.getStock());
            break;
        case 2:
            Petrol pr2 = new Maruti800();
            Maruti800 Mr = (Maruti800) pr2;
            System.out.println(Mr.getStock());
            System.out.println(ReusableString + Mr.Range);
            System.out.println(ReusableLocation + Mr.DeportedDetails);
            System.out.println("Stock Details :" + Mr.getStock());
            break;
        }
    }
}

class Diesel extends FourWheeler {
    boolean Diesel = true;
    int DieselPrice = 92;

    Diesel() {
        System.out.print(" -> Diesel");
    }

    public void DieselFeatures() {
        System.out.println("Diesel car");
    }
}

class Swift extends Petrol {
    boolean Automatic = true;
    boolean Manual = true;
    int Seaters = 5;
    int Range = 300;
    String ModelName = "xl";
    String DeportedDetails = " Iraq ";
    private String CustomRequest;
    Boolean CarCover = true;

    Swift() {
        System.out.print(" -> Swift");
    }

    public int getStock() {
        return this.SwiftStock;
    }

    public void FourWheelerFeatures() {
        int seaters = 2;
        System.out.println("Seaters :" + seaters);
        System.out.println("Wheel :" + NoOfWheels);
        System.out.println("Car Cover Free :" + (CarCover ? "Inclusive" : "Not Inclusive"));
        System.out.println("Petrol Price By Litre" + PetrolPrice);
    }
}

class Maruti800 extends Petrol {
    boolean Automatic = true;
    boolean Manual = true;
    int Seaters = 5;
    Boolean CarCover = true;
    int Range = 600;
    String ModelName = "800";
    String DeportedDetails = " Iraq ";
    private String CustomRequest;

    Maruti800() {
        System.out.print(" -> Maruti800");
    }

    public int getStock() {
        return this.MarutiStock;
    }

    public void FourWheelerFeatures() {
        int seaters = 8;
        System.out.println("Seaters :" + seaters);
        System.out.println("Wheel :" + NoOfWheels);
        System.out.println("Car Cover Free :" + (CarCover ? "Inclusive" : "Not Inclusive"));
    }

    public String getCustomRequest() {
        return CustomRequest;
    }

    public void setCustomRequest(String Request) {
        this.CustomRequest = Request;
    }
}

class Innova extends Diesel {
    boolean Automatic = true;
    boolean Manual = true;
    int Seaters = 5;
    Boolean CarCover = true;

    Innova() {
        System.out.print(" -> Innova");
    }

    public void FourWheelerFeatures() {
        int seaters = 8;
        System.out.println("Seaters :" + seaters);
        System.out.println("Wheel :" + NoOfWheels);
        System.out.println("Car Cover Free :" + (CarCover ? "Inclusive" : "Not Inclusive"));
    }
}