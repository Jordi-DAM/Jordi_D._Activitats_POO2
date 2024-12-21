package Ex10;

public class Car extends Vehicle {

    private static final double extraPricePerDayAndSeat = 1.5;
    private  int seats;

    public Car(String licensePlate, int daysRented, int seats) {
        super(licensePlate, daysRented);
        this.seats = seats;
    }

    @Override
    public double totalPrice(){
        return super.totalPrice()+extraPricePerDayAndSeat*seats*getDaysRented();
    }

}


