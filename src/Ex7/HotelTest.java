package Ex7;

public class HotelTest {

    public static void main(String[] args) {
        Service wifi = new Service("Wifi");
        Service minibar = new Service("Minibar");
        Service airConditioner = new Service("Aire acondicionat");

        Room r1 = new Room("Suite");
        r1.setServices(wifi);
        r1.setServices(airConditioner);
        r1.setServices(minibar);
        r1.showServices();
    }



}
