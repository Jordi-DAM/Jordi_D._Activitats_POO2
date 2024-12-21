package ex6;

import java.time.LocalDateTime;

public class Visit {

    private int visitId;
    private LocalDateTime localDateTime;
    private String patientName;

    private static int visitCounter = 0;

    public Visit(LocalDateTime localDateTime, String patientName){
        this.visitId= ++visitCounter;
        this.localDateTime=localDateTime;
        this.patientName = patientName;
    }


    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public static int getVisitCounter() {
        return visitCounter;
    }

    public static void setVisitCounter(int visitCounter) {
        Visit.visitCounter = visitCounter;
    }


}
