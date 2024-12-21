package Ex10;

public class Microbus extends Vehicle {

    private static final int pricePerSeat = 2;
    private int seats;
    public Microbus(String licensePlate, int daysRented, int seats) {
        super(licensePlate, daysRented);
        this.seats = seats;
    }

    @Override
    public double totalPrice(){
        return super.totalPrice()+pricePerSeat*seats;
    }

}
