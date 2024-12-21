package Ex5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contract {
    private String code;
    private LocalDate beginning;
    private LocalDate ending;
    private Company company;

    public Contract(String code, LocalDate beginning,LocalDate ending,String cif, String companyName, String sector){
        this.code=code;
        this.beginning=beginning;
        this.ending=ending;
        this.company= new Company(cif,companyName,sector);
    }

    public int getDuration(){
        return (int) ChronoUnit.DAYS.between(beginning,ending);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning;
    }

    public LocalDate getEnding() {
        return ending;
    }

    public void setEnding(LocalDate ending) {
        this.ending = ending;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
