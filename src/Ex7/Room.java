package Ex7;

import java.util.ArrayList;

public class Room {

    private String type;
    private ArrayList<Service>services;

    public Room(String type){
        this.type = type;
        services = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
}
