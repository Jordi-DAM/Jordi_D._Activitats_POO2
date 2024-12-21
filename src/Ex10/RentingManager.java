package Ex10;

import java.util.ArrayList;

public class RentingManager {

    private ArrayList<Vehicle>vehicles;

    public RentingManager(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void getPriceByLicensePlate(String licensePlate){
        for(Vehicle v: vehicles){
            if(v.getLicensePlate().equals(licensePlate)){
                v.totalPrice();
            }
        }
    }
}
