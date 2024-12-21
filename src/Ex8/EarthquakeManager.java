package Ex8;

import java.util.ArrayList;

public class EarthquakeManager {

    private ArrayList<Earthquake>earthquakes;

    public EarthquakeManager(){
        earthquakes = new ArrayList<>();
    }



    public Earthquake findEarthQuakeByID(int earthquakeID){
        Earthquake foundEarthquake = null;
        
        for (Earthquake e: earthquakes){
            if(e.getEarthquakeID() == earthquakeID){
                foundEarthquake = e;
            }
        }
        return foundEarthquake;
    }


    public void showEarthquakeVictimsByID(int earthquakeID){
        Earthquake foundEarthquake = findEarthQuakeByID(earthquakeID);

        System.out.println(foundEarthquake.getVictims());
        
    }


    public void showMagnitudeLocation(int earthquakeID){
        Earthquake foundEarthquake = findEarthQuakeByID(earthquakeID);

        System.out.println(foundEarthquake.getLocation());
        System.out.println(foundEarthquake.getMagnitude());
        }
 }

