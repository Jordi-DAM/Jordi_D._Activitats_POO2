package Ex6;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Consultori {


    private String doctorName;
    private String doctorType;
    private ArrayList<Visit>visits;


    public Consultori(String doctorName, String doctorType){
        this.doctorName=doctorName;
        this.doctorType=doctorType;
        visits= new ArrayList<>();
    }


    public boolean programableVisit(Visit visit){
        LocalDateTime vTime = visit.getLocalDateTime();

        LocalDateTime thirtyMinBefore= vTime.minusMinutes(30);
        LocalDateTime thirtyMinAfter= vTime.plusMinutes(30);

        for (Visit v : visits){
            if (!visit.getLocalDateTime().isBefore(thirtyMinBefore) && !visit.getLocalDateTime().isAfter(thirtyMinAfter)){
                return false;
            }

        }
        return true;
    }

    public void displayVisitsAmount(){
        System.out.println(visits.size());
    }


    public void addVisit(Visit visit){
        if (programableVisit(visit)){
            visits.add(visit);
        }
       else System.out.println("No es pot programar la visita en aquest interval de 30 minuts");
    }


    public void displayVisitAmountBetweenDates(LocalDateTime date1, LocalDateTime date2){
        int comptadorVisites=0;

        System.out.println("Aquesta es la llista de visites: ");
        for (Visit v: visits){
            if (!v.getLocalDateTime().isBefore(date1) && !v.getLocalDateTime().isAfter(date2)) {
                comptadorVisites+=1;
            }
        }
        System.out.println("Aquest es el número de visites entre les dates: "+ comptadorVisites);
    }


    public void removeVisitById(Visit visit){
        for(Visit v: visits){
            if (v.getVisitId()==visit.getVisitId()){
                visits.remove(v);
            }
        }
    }


    public void removeAllVisits(){
        visits.clear();
    }
}
