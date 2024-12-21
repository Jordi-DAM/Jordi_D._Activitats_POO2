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

//  Retorn del valor en Double

    public Double getPriceByLicensePlate(String licensePlate){
        Double foundPrice = null;
        for(Vehicle v: vehicles){
            if(v.getLicensePlate().equals(licensePlate)){
                 foundPrice = v.totalPrice();
            }
        }
        return foundPrice;
    }


//    Impresió del valor directament
//    public void getPriceByLicensePlate(String licensePlate){
//            for (Vehicle v: vehicles){
//                if(v.getLicensePlate().equals(licensePlate)){
//                    System.out.println("El preu del vehicle es de: "+ v.totalPrice() + "€");
//         }
//      }
//
//    }
}
