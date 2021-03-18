public class Vehicle {
    int regNo;
    String Colour;
    String PurchaseDate; // Convert to date type

    private String VehicleNumber;
    private String UserName;
    private String MobileNo;
    public int wheel;
    public boolean Automatic;
    public boolean Manual;

    // public void Drive() {
    // boolean Automatic = false;
    // boolean Manual = false;
    // boolean Steering = true;
    // System.out.println(Automatic)
    // }

    // Vehicle(int regNo, String colour, String PurchaseDate) {
    // this.regNo = regNo;
    // this.Colour = colour;
    // this.PurchaseDate = PurchaseDate;
    // }

    // Vehicle(int a) {
    // System.out.println(a);
    // }

    // public Vehicle(int wheel) {
    // switch (wheel) {
    // case 1:
    // this.wheel = 1;
    // break;
    // case 2:
    // this.wheel = 2;
    // break;
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
    // default:
    // this.wheel = 0;
    // }
    // }

    public String getVehicleNumber(String Vno) {
        return this.VehicleNumber;
    }

    public String getUserName(String Uname) {
        return this.UserName;
    }

    public void setVehicleNumber(String Vno) {
        this.VehicleNumber = Vno;
    }

    public void setUserName(String Uname) {
        this.UserName = Uname;
    }

    public void generateUserId() {

    }

    // {
    // System.out.println("Welcome to Vehicle Details");
    // System.out.println("Please Enter the no of wheels your vehicle have");
    // }

}