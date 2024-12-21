package Ex10;

public class Truck extends Vehicle {

    private static final int extraPrice = 40;
    private double PMA;

    public Truck(String licensePlate, int daysRented, double PMA) {
        super(licensePlate, daysRented);
        this.PMA = PMA;
    }

    public void setPMA(double PMA) {
        this.PMA = PMA;
    }


    @Override
    public double totalPrice(){
        return super.totalPrice() + 20*PMA + extraPrice;
    }


}
