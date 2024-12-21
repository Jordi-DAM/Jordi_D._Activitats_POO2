package Ex10;

public class Van extends Vehicle {

    private double PMA;

    public Van(String licensePlate, int daysRented, double PMA){
        super(licensePlate,daysRented);
        this.PMA = PMA;
    }

    public double getPMA() {
        return PMA;
    }

    public void setPMA(double PMA) {
        this.PMA = PMA;
    }

    @Override
    public double totalPrice(){
        return super.totalPrice() + 20*PMA;
    }

}
