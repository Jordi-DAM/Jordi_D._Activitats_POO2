package Ex8;

import java.util.ArrayList;

public class Earthquake {

    private int earthquakeID;
    private Location location;
    private double magnitude;
    private ArrayList<Victim>victims;


    public Earthquake(int earthquakeID, Location location, double magnitude){
        this.earthquakeID = earthquakeID;
        this.location = location;
        this.magnitude = magnitude;
        victims = new ArrayList<>();
    }

    public int getEarthquakeID() {
        return earthquakeID;
    }

    public void setEarthquakeID(int earthquakeID) {
        this.earthquakeID = earthquakeID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public ArrayList<Victim> getVictims() {
        return victims;
    }


    //Jo faria servir això, crearia una llista de víctimes del terratrèmol i l'afegiria de cop
    public void setVictims(ArrayList<Victim> victims) {
        this.victims = victims;
    }

    //Si volem afegir víctimes una per una podem fer servir això
    public void addVictim(Victim victim){
        victims.add(victim);
    }

    //Si en volem afegir més d'una a la llista ja creada podem fer servir aquest mètode
    public void addMultipleVictims(ArrayList<Victim>newVictims){
        for (Victim v: newVictims){
            victims.add(v);
        }
    }

    public void showVictims(){
        for(Victim v: victims){
            System.out.println(v);
        }
    }




}
