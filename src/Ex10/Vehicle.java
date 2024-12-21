package Ex10;

public class Vehicle {

    private String licensePlate;
    private int daysRented;
    protected static final int basePrice = 10;

    public Vehicle(String licensePlate, int daysRented){
        this.licensePlate = licensePlate;
        this.daysRented = daysRented;
    }



    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double totalPrice(){
        return daysRented*basePrice;
    }


}
